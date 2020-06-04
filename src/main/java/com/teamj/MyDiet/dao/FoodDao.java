package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FoodDao extends JpaRepository<Food,Integer> {



}