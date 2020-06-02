package com.teamj.MyDiet.model;

import java.util.ArrayList;
import java.util.UUID;

public abstract class User {
     UUID UserID;
     String name ;
     String email ;
     String password ;
     Boolean isCoach ;
     int age;

    public Boolean getCoach() {
        return isCoach;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public boolean isCoach() {
        return isCoach;
    }

    public void setUserID(UUID userID) {
        UserID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCoach(Boolean coach) {
        isCoach = coach;
    }
}
