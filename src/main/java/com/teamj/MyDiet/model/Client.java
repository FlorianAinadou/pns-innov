package com.teamj.MyDiet.model;

import java.util.ArrayList;
import java.util.UUID;

public class Client {
    private final UUID UserID;
    private final String name;
    private final String email;
    private final String password;
    private int height;
    private int weight;
    private int Age;
    private ArrayList<DailyReport> reports;

    public Client(UUID userID, String name, String email, String password, int height, int weight, int age) {
        UserID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.height = height;
        this.weight = weight;
        Age = age;
    }

    public UUID getUserID() {
        return UserID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
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
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    void addDailyReport(DailyReport dailyReport){
        reports.add(dailyReport);
    }

    DailyReport getReport(int i){
        return reports.get(i);
    }
}
