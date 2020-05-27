package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Food;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FoodDao {
    int insertFood(UUID id,Food food);

    default int insertFood(Food food){
        UUID id = UUID.randomUUID();
        return  insertFood(id, food);
    }

    List<Food> selectAllFood();

    Optional<Food> selectFoodById(UUID id);

    int deleteFoodById(UUID id);

    int updateFoodByName(UUID id, Food food);
}
