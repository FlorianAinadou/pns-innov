package com.teamj.MyDiet.controller;

import com.teamj.MyDiet.dao.UserDao;
import com.teamj.MyDiet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping(value = "api/v1/users")
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @GetMapping(value = "api/v1/user/{id}")
    public User getUserById(@PathVariable UUID id) {
        return userDao.findById(id);
    }
}
