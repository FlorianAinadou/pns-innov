package com.teamj.MyDiet.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class DailyReport {
    private UUID UserID;
    private Date reportDate;
    private int weight;
    private int calories;
    private int proteins;
    private int carbohydrates;
    private int lipids;
    private List<Food> foods;

    public DailyReport(UUID userID, Date reportDate, int weight, int calories, int proteins, int carbohydrates, int lipids) {
        UserID = userID;
        this.reportDate = reportDate;
        this.weight = weight;
        this.calories = calories;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.lipids = lipids;
        foods=new ArrayList<>();
    }

    public DailyReport() {
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getLipids() {
        return lipids;
    }

    public void setLipids(int lipids) {
        this.lipids = lipids;
    }


    public UUID getUserID() {
        return UserID;
    }

    public void setUserID(UUID userID) {
        UserID = userID;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public int getWeight() {
        return weight;
    }
}
