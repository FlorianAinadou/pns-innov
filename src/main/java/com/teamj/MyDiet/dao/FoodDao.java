package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.DailyReport;
import com.teamj.MyDiet.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface FoodDao extends JpaRepository<Food,Integer> {

    List<Food> findByIdDailyEquals(int id);


}