package com.teamj.MyDiet.controller;

import com.teamj.MyDiet.dao.DailyDao;
import com.teamj.MyDiet.dao.UserDao;
import com.teamj.MyDiet.model.DailyReport;
import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DailyController {

    @Autowired
    private DailyDao dailyDao;

    @GetMapping(value = "api/v1/daily/{id}")
    public List<DailyReport> getDailysFromUser(@PathVariable int id) {
        return dailyDao.getDailyReports(id);
    }

    @PostMapping(value = "api/v1/daily")
    public void save(@RequestBody DailyReport dailyReport){
        dailyDao.save(dailyReport);
    }

}
