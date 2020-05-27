package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Food;

import java.util.List;

public interface FoodDao {
    int insertFood(Food food);


    List<Food> selectAllFood();
}
