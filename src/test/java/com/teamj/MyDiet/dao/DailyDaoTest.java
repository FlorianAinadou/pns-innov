package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.DailyReport;
import com.teamj.MyDiet.model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.Instant;
import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class DailyDaoTest {
    @Autowired
    DailyDao dailyDao;

    @Test
    void findByUserID() {
        User user= new User(1, 0,false,"Florian","email","ratp","No description");
        DailyReport dailyReport=new DailyReport(1,1, Date.from(Instant.now()),20,150,10,15,5);
        dailyDao.save(dailyReport);
        List<DailyReport> usersDaily=dailyDao.findByUserID(1);
        assertEquals(usersDaily.size(), 1);
        assertEquals(usersDaily.get(0).getId(), 1);
    }

    @Test
    void findByReportDateGreaterThanEqual() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -6);
        List<DailyReport> dailys = dailyDao.findByUserIDAndReportDateGreaterThanEqual(0, cal.getTime());
        assertEquals(3, dailys.size());

    }


}