package com.teamj.MyDiet.services;

import com.teamj.MyDiet.dao.FoodDao;
import com.teamj.MyDiet.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FoodService {
    private final FoodDao foodDao;

    @Autowired
    public FoodService(@Qualifier("fakeDao") FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    public  int addFood(Food food){
        return foodDao.insertFood(food);
    }

    public List<Food> getAllFood(){
        return foodDao.selectAllFood();
    }

    public Optional<Food> getFoodById(int id){
        return  foodDao.selectFoodById(id);
    }

    public int deleteFood(int id){
        return foodDao.deleteFoodById(id);
    }

    public int updateFood(int id, Food food){
        return foodDao.updateFoodByName(id,food);
    }
}
