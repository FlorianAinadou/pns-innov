package com.teamj.MyDiet.controller;


import com.teamj.MyDiet.dao.FoodDao;
import com.teamj.MyDiet.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/v1/food")
@RestController
public class FoodController {
    private final FoodDao foodDao;

    @Autowired
    public FoodController(FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    @PostMapping
    public void addFood(@RequestBody Food food){
        foodDao.save(food);
    }

    @GetMapping(path = "all")
    public List<Food> getAllFood(){
        return foodDao.findAll();
    }

    @GetMapping(path = "{id}")
    public Optional<Food> getFoodById(@PathVariable("id") int id){
        return foodDao.findById(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteFoodById(@PathVariable("id") Food food){
        foodDao.delete(food);
    }


}