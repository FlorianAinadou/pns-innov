package com.teamj.MyDiet.model;

import java.util.Date;

public class DailyReport {
    private int UserID;
    private Date reportDate;
    private int weight;
    private int calorie;
    private int proteine;
    private int glucide;
    private int lipide;

    public DailyReport(int userID, Date reportDate, int weight, int calorie, int proteine, int glucide, int lipide) {
        UserID = userID;
        this.reportDate = reportDate;
        this.weight = weight;
        this.calorie = calorie;
        this.proteine = proteine;
        this.glucide = glucide;
        this.lipide = lipide;
    }

    public DailyReport() {
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getProteine() {
        return proteine;
    }

    public void setProteine(int proteine) {
        this.proteine = proteine;
    }

    public int getGlucide() {
        return glucide;
    }

    public void setGlucide(int glucide) {
        this.glucide = glucide;
    }

    public int getLipide() {
        return lipide;
    }

    public void setLipide(int lipide) {
        this.lipide = lipide;
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
