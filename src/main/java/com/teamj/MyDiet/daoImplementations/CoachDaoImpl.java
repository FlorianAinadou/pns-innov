package com.teamj.MyDiet.daoImplementations;

import com.teamj.MyDiet.dao.CoachDao;
import com.teamj.MyDiet.model.Coach;
import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CoachDaoImpl implements CoachDao {
    @Override
    public int insertCoach(UUID id, Coach coach) {
        UserDaoImpl.users.add(coach);
        return 1;
    }

    @Override
    public List<User> selectAllCoach() {
        ArrayList<User> coachs= new ArrayList<>();
        for ( User user: UserDaoImpl.users ) {
            if (user.isCoach()){
                coachs.add(user);
            }
        }
        return coachs;
    }

    @Override
    public Optional<User> selectCoachById(UUID id) {
        return UserDaoImpl.users.stream()
                .filter(user -> user.getUserID().equals(id) && user.isCoach())
                .findFirst();
    }

    @Override
    public int deleteCoachById(UUID id) {
        Optional<User> user= selectCoachById(id);
        if (user.isPresent()){
            UserDaoImpl.users.remove(user.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int updateCoachById(UUID id, Coach coach) {
        return selectCoachById(id)
                .map(user -> {
                    int indexOfFoodToDelete = UserDaoImpl.users.indexOf(user);
                    if(indexOfFoodToDelete>=0){
                        UserDaoImpl.users.set(indexOfFoodToDelete, coach);
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
