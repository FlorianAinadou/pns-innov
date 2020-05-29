package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Food;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public interface FoodDao {
    int insertFood(int id,Food food);

    default int insertFood(Food food){
        //UUID id = UUID.randomUUID();
        return  insertFood(food.getId(), food);
    }

    List<Food> selectAllFood();

    Optional<Food> selectFoodById(int id);

    int deleteFoodById(int id);

    int updateFoodByName(int id, Food food);
}
