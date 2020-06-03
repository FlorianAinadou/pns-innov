package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.DailyReport;
import java.util.List;
import java.util.UUID;

public interface DailyDao {

    public List<DailyReport> getDailyReports(UUID id);

    public void save(DailyReport dailyReport);

}
