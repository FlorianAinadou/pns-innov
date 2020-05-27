package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getUsers();

    public User findById(int i);

    public User save(User user);
}
