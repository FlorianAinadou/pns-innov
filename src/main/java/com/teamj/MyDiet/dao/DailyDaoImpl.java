package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.DailyReport;
import com.teamj.MyDiet.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class DailyDaoImpl implements DailyDao {

    public static List<DailyReport> dailyReports = new ArrayList<>();
    static {
        dailyReports.add(new DailyReport(0, new Date(), 100, 2500, 150, 300, 80));
        dailyReports.add(new DailyReport(0, new Date(), 99, 2300, 140, 230, 40));
        dailyReports.add(new DailyReport(0, new Date(), 98, 2200, 155, 330, 20));
    }


    @Override
    public List<DailyReport> getDailyReports(int id) {
        List<DailyReport> dailys = new ArrayList<>();
        for (DailyReport u: dailyReports) {
            if(u.getUserID() == id){
                dailys.add(u);
            }
        }
        return dailys;
    }

    @Override
    public void save(DailyReport dailyReport) {
        dailyReports.add(dailyReport);
    }

}
