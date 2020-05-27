package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.DailyReport;
import java.util.List;

public interface DailyDao {

    public List<DailyReport> getDailyReports(int id);

    public void save(DailyReport dailyReport);

}
