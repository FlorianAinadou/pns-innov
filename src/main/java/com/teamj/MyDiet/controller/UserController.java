package com.teamj.MyDiet.controller;

import com.teamj.MyDiet.dao.UserDao;
import com.teamj.MyDiet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping(value = "api/v1/users")
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @GetMapping(value = "api/v1/user/{id}")
    public User getUserById(@PathVariable int id) {
        return userDao.findById(id);
    }

    @GetMapping(value = "api/v1/coachs")
    public List<User> getCoachs() {
        return userDao.findByisCoachIsTrue();
    }

    @GetMapping(value = "api/v1/coach/{id}")
    public List<User> getFollowingPeople(@PathVariable int id) {
        return userDao.findAllByIdCoachEquals(id);
    }


    @PutMapping(value = "api/v1/selectCoach/{idUser}/{idCoach}")
    public ResponseEntity<Void> choseCoach(@PathVariable int idUser, @PathVariable int idCoach){

        User coach = userDao.findById(idCoach);
        User user = userDao.findById(idUser);


        if(coach == null){
            return ResponseEntity.noContent().build();
        }

        user.setIdCoach(coach.getId());

        userDao.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(coach.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }
}
