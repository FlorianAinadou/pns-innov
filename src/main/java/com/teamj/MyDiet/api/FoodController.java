package com.teamj.MyDiet.api;

import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    public void addFood(Food food){
        foodService.addFood(food);
    }
}
