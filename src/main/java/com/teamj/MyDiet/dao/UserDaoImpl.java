package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    public static List<User> users = new ArrayList<>();
    static {
        users.add(new User(0, "florian", "florian@ainadou.fr", "1234"));
        users.add(new User(1, "virgile", "virgile@fantauzzi.fr", "1234"));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User findById(int i) {
        for (User u: users) {
            if(u.getUserID() == i){
                return u;
            }
        }
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }
}
