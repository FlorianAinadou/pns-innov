package com.teamj.MyDiet.daoImplementations;

import com.teamj.MyDiet.dao.UserDao;
import com.teamj.MyDiet.model.Client;
import com.teamj.MyDiet.model.Coach;
import com.teamj.MyDiet.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeUsers")
public class UserDaoImpl implements UserDao {

    public static List<User> users = new ArrayList<>();
    static {
        users.add(new Client(UUID.fromString("9a874c4c-a577-11ea-bb37-0242ac130002"), "florian", "florian@ainadou.fr", "1234",180, 97, 22));
        users.add(new Coach(UUID.fromString("9a874eb8-a577-11ea-bb37-0242ac130002"), "virgile", "virgile@fantauzzi.fr", "1234", 28));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User findById(UUID i) {
        for (User u: users) {
            if(u.getUserID().equals(i)){
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
