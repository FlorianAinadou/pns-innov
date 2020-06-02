package com.teamj.MyDiet.model;

import java.util.ArrayList;
import java.util.UUID;

public class Client extends User {


    private int height;
    private int weight;
    private int age;
    private ArrayList<DailyReport> reports;

    public Client(UUID userID, String name, String email, String password, int height, int weight, int age) {
        this.UserID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.isCoach=false;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void addDailyReport(DailyReport dailyReport){
        reports.add(dailyReport);
    }

    DailyReport getReport(int i){
        return reports.get(i);
    }


}
