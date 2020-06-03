package com.teamj.MyDiet.services;

import com.teamj.MyDiet.dao.UserDao;
import com.teamj.MyDiet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("fakeUsers") UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getUsers(){

        return userDao.getUsers();
    }

    public User findById(UUID i){
        return userDao.findById(i);
    }

    public User save(User user){
        return userDao.save(user);
    }

}
