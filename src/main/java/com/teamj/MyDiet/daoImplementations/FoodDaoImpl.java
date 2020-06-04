package com.teamj.MyDiet.daoImplementations;

import com.teamj.MyDiet.dao.FoodDao;
import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FoodDaoImpl implements FoodDao {

    private static List<Food> DB = new ArrayList<>();
    static {
        DB.add(new Food(UUID.randomUUID(), 45, 32, 34, 12, "Banane"));
        DB.add(new Food(UUID.randomUUID(), 12, 30, 13, 2, "Jus d'orange"));
        //DB.add(new Food(UUID.randomUUID(), 45, 0, 0, 0, "Banane"));
        //DB.add(new Food(UUID.randomUUID(), 12, 0, 0, 0, "Jus d'orange"));
    }

    @Override
    public int insertFood(UUID id, Food food) {
        DB.add(new Food(id, food.getKcal(), food.getProtein(), food.getCarbohydrates(), food.getLipids(), food.getName()));
        return 1;
    }

    @Override
    public List<Food> selectAllFood() {
        return DB;
    }

    @Override
    public Optional<Food> selectFoodById(UUID id) {
        return DB.stream()
                .filter(food -> food.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteFoodById(UUID id) {
        Optional<Food> foodMaybe= selectFoodById(id);
        if (foodMaybe.isPresent()){
            DB.remove(foodMaybe.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int updateFoodByName(UUID id, Food food) {

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