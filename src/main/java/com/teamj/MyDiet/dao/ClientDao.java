package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Client;

import java.util.UUID;

public interface ClientDao {

    int insertClient(UUID userId, Client client);

    default int addClient(Client client){
        UUID userId= UUID.randomUUID();
        return insertClient(userId, client);
    }
}
