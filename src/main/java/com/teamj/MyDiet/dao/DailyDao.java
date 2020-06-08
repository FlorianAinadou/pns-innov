package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.DailyReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository

public interface DailyDao extends JpaRepository<DailyReport,Integer> {

    List<DailyReport> findByUserID(int UserId);

    List<DailyReport> findByUserIDAndReportDateGreaterThanEqual(int id, Date date);
}
