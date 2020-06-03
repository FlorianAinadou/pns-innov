package com.teamj.MyDiet.controller;

import com.teamj.MyDiet.model.DailyReport;
import com.teamj.MyDiet.services.DailiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/daily")
@RestController
public class DailyController {


    private final DailiesService dailiesService;

    @Autowired
    public DailyController(DailiesService dailiesService) {
        this.dailiesService = dailiesService;
    }

    @GetMapping(value = "{id}")
    public List<DailyReport> getDailyFromUser(@PathVariable UUID id) {
        return dailiesService.getDailyReports(id);
    }

    @PostMapping(value = "api/v1/daily")
    public void save(@RequestBody DailyReport dailyReport){
        dailiesService.save(dailyReport);
    }

}
