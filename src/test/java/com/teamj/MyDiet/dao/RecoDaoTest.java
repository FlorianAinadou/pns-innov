package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.DailyReport;
import com.teamj.MyDiet.model.Recommendation;
import com.teamj.MyDiet.model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.Instant;
import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class RecoDaoTest {
    @Autowired
    RecoDao recoDao;

    @Test
    void findAllByIdUserEquals() {
        List<Recommendation> recommendations = recoDao.findAllByIdUserEquals(0);
        assertEquals(2, recommendations.size());
    }


}