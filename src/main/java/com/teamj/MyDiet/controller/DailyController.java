package com.teamj.MyDiet.controller;

import com.teamj.MyDiet.dao.DailyDao;
import com.teamj.MyDiet.model.DailyReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Calendar;
import java.util.List;

@RestController
public class DailyController {

    @Autowired
    private DailyDao dailyDao;

    @GetMapping(value = "api/v1/daily/{id}")
    public List<DailyReport> getDailysFromUser(@PathVariable int id) {
        return dailyDao.findByUserID(id);
    }

    @GetMapping(value = "api/v1/daily/week/{id}")
    public List<DailyReport> getDailysWeeksFromUser() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -6);
        return dailyDao.findByReportDateGreaterThanEqual(cal.getTime());
    }

    @PostMapping(value = "api/v1/daily")
    public ResponseEntity<Void> save(@RequestBody DailyReport dailyReport){
        DailyReport dailyReport1 = dailyDao.save(dailyReport);

        if(dailyReport == null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dailyReport1.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

}
