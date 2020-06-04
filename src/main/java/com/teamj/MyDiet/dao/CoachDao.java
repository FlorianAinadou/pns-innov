package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Coach;
import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CoachDao {
    int insertCoach(UUID id, Coach coach);

    default int insertCoach(Coach coach){
        UUID id = UUID.randomUUID();
        return  insertCoach(id, coach);
    }

    List<User> selectAllCoach();

    Optional<User> selectCoachById(UUID id);

    int deleteCoachById(UUID id);

    int updateCoachById(UUID id, Coach coach);


}
