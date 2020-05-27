package com.teamj.MyDiet.controller;

import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping(path = "{id}")
    public Food getFoodById(@PathVariable("id") UUID id){
        return foodService.getFoodById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteFoodById(@PathVariable("id") UUID id){
        foodService.deleteFood(id);
    }

    @PutMapping(path = "{id}")
    public void updateFoodById(@PathVariable("id") UUID id, @RequestBody Food foodToUpdate){
        foodService.updateFood(id, foodToUpdate);
    }
}
