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
    DailyDao dailyDao;

    /**
     * @param id of user
     * @return the dailyreport list of the user
     */
    @GetMapping(value = "api/v1/dailys/{id}")
    public List<DailyReport> getDailysFromUser(@PathVariable int id) {
        return dailyDao.findByUserID(id);
    }


    /**
     * @param id of user
     * @return the today dailyreport of the user
     */
    @GetMapping(value = "api/v1/daily/{id}")
    public DailyReport getDailyFromUser(@PathVariable int id) {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return dailyDao.findByUserIDAndReportDateGreaterThanEqual(id, cal.getTime()).get(0);
    }



    /**
     * @param id of the user
     * @return the dailyreport list of the last 7 days of the user
     */
    @GetMapping(value = "api/v1/daily/week/{id}")
    public List<DailyReport> getDailysWeeksFromUser(@PathVariable int id) {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -6);
        return dailyDao.findByUserIDAndReportDateGreaterThanEqual(id, cal.getTime());
    }

    /**
     * @param id of the user
     * @return the dailyreport list of the last 30 days of the user
     */
    @GetMapping(value = "api/v1/daily/month/{id}")
    public List<DailyReport> getDailysMonthsFromUser(@PathVariable int id) {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -30);
        return dailyDao.findByUserIDAndReportDateGreaterThanEqual(id, cal.getTime());
    }

    /**
     * @param dailyReport to save in the database
     * @return the response of the server
     */
    @PostMapping(value = "api/v1/daily")
    public ResponseEntity<Void> addNewDaily(@RequestBody DailyReport dailyReport){
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
