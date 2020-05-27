package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeDao")
public class FakeFoodDataAccessService implements FoodDao {
    private static List<Food> DB = new ArrayList<>();
    @Override
    public void insertFood(Food food) {
        DB.add(food);
    }
}
