package com.teamj.MyDiet.model;

import java.util.ArrayList;
import java.util.UUID;

public class User {
    private int UserID;
    private String name;
    private String email;
    private String password;

    public int getUserID() {
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

    public User() {
    }

    public User(int userID, String name, String email, String password) {
        UserID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
