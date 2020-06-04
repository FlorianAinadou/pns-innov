package com.teamj.MyDiet.controller;


import com.teamj.MyDiet.dao.FoodDao;
import com.teamj.MyDiet.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    public ResponseEntity<Void> addFood(@RequestBody Food food){
        Food foodToSave= foodDao.save(food);

        if(foodToSave == null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(food.getId())
                .toUri();

        return ResponseEntity.created(location).build();
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