package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {


    public List<User> findAllByIdCoachEquals(int id);

    public List<User> findByisCoachIsTrue();

    public User findById(int i);

}
