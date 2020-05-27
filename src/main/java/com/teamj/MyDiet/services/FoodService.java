package com.teamj.MyDiet.services;

import com.teamj.MyDiet.dao.FoodDao;
import com.teamj.MyDiet.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodDao foodDao;

    @Autowired
    public FoodService(@Qualifier("fakeDao") FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    public  void addFood(Food food){
        foodDao.insertFood(food); ;
    }

    public List<Food> getAllFood(){
        return foodDao.selectAllFood();
    }
}
