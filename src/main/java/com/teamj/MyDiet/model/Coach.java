package com.teamj.MyDiet.model;

import java.util.ArrayList;
import java.util.UUID;

public class Coach extends User {


    private ArrayList<UUID> clients;

    public Coach(UUID userID, String name, String email, String password,int age) {
        this.age = age;
        this.clients = new ArrayList<>();
        this.UserID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isCoach= true;
    }



    public ArrayList<UUID> getClients() {
        return clients;
    }

    public void addClient(UUID clientId){
        clients.add(clientId);
    }

    public void removeClient(UUID clientId){
        clients.remove(clientId);
    }

    public void setClients(ArrayList<UUID> clients) {
        this.clients = clients;
    }


}
