package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Client;
import com.teamj.MyDiet.model.Coach;
import com.teamj.MyDiet.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserDaoImpl implements UserDao {

    public static List<User> users = new ArrayList<>();
    static {
        users.add(new Client(UUID.randomUUID(), "florian", "florian@ainadou.fr", "1234",180, 97, 22));
        users.add(new Coach(UUID.randomUUID(), "virgile", "virgile@fantauzzi.fr", "1234", 28));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User findById(UUID i) {
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
