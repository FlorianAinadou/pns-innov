package com.teamj.MyDiet.controller;

import com.teamj.MyDiet.model.User;
import com.teamj.MyDiet.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/user")
@RestController
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "all")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(value = "{id}")
    public User getUserById(@PathVariable UUID id) {
        return userService.findById(id);
    }
}
