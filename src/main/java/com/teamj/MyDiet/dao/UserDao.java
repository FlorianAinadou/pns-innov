package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.User;

import java.util.List;
import java.util.UUID;

public interface UserDao {

    public List<User> getUsers();

    public User findById(UUID i);

    public User save(User user);
}
