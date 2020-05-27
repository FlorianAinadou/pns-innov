package com.teamj.MyDiet.api;

import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/food")
@RestController
public class FoodController {
    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping
    public void addFood(@RequestBody Food food){
        foodService.addFood(food);
    }

    @GetMapping
    public List<Food> getAllFood(){
        return foodService.getAllFood();
    }
}
