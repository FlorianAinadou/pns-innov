package com.teamj.MyDiet.daoImplementations;

import com.teamj.MyDiet.dao.DailyDao;
import com.teamj.MyDiet.model.DailyReport;
import com.teamj.MyDiet.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository("fakeDaily")
public class DailyDaoImpl implements DailyDao {

    public static List<DailyReport> dailyReports = new ArrayList<>();
    static {
        dailyReports.add(new DailyReport(UUID.fromString("9a874c4c-a577-11ea-bb37-0242ac130002"), new Date(), 100, 2500, 150, 300, 80));
        dailyReports.add(new DailyReport(UUID.fromString("9a874eb8-a577-11ea-bb37-0242ac130002"), new Date(), 99, 2300, 140, 230, 40));
        //dailyReports.add(new DailyReport(UUID.fromString("9a874fa8-a577-11ea-bb37-0242ac130002"), new Date(), 98, 2200, 155, 330, 20));
    }


    @Override
    public List<DailyReport> getDailyReports(UUID id) {
        List<DailyReport> dailies = new ArrayList<>();
        for (DailyReport u: dailyReports) {
            if(u.getUserID() == id){
                dailies.add(u);
            }
        }
        return dailies;
    }

    @Override
    public void save(DailyReport dailyReport) {
        dailyReports.add(dailyReport);
    }

}
