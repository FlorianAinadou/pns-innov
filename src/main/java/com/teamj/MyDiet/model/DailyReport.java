package com.teamj.MyDiet.model;

import java.util.Date;

public class DailyReport {
    private int UserID;
    private final Date reportDate;
    private final int weight;

    public DailyReport(int userID, Date reportDate, int weight) {
        UserID = userID;
        this.reportDate = reportDate;
        this.weight = weight;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public int getWeight() {
        return weight;
    }
}
