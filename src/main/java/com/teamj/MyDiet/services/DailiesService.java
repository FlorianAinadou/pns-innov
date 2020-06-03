package com.teamj.MyDiet.services;

import com.teamj.MyDiet.dao.DailyDao;
import com.teamj.MyDiet.model.DailyReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DailiesService {

    private final DailyDao dailyDao;

    @Autowired
    public DailiesService(@Qualifier("fakeDaily") DailyDao dailyDao) {
        this.dailyDao = dailyDao;
    }

    public List<DailyReport> getDailyReports(UUID id){
        return dailyDao.getDailyReports(id);
    }

    public void save(DailyReport dailyReport){
        dailyDao.save(dailyReport);
    }
}
