package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeFoodDataAccessService implements FoodDao {
    private static List<Food> DB = new ArrayList<>();

    @Override
    public int insertFood(int id, Food food) {
        DB.add(new Food(id, food.getKcal(), food.getProtein(), food.getCarbohydrates(), food.getLipids(), food.getName()));
        return 1;
    }

    @Override
    public List<Food> selectAllFood() {
        return DB;
    }

    @Override
    public Optional<Food> selectFoodById(int id) {
        return DB.stream()
                .filter(food -> food.getId() == id)
                .findFirst();
    }

    @Override
    public int deleteFoodById(int id) {
        Optional<Food> foodMaybe= selectFoodById(id);
        if (foodMaybe.isPresent()){
            DB.remove(foodMaybe.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int updateFoodByName(int id, Food food) {

        return selectFoodById(id)
                .map(food1 -> {
                    int indexOfFoodToDelete = DB.indexOf(food1);
                    if(indexOfFoodToDelete>=0){
                        DB.set(indexOfFoodToDelete, food);
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }




}
