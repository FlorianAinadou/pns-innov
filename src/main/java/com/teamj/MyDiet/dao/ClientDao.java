package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Client;
import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClientDao {

    int insertClient(UUID userId, Client client);

    default int insertClient(Client client){
        UUID userId= UUID.randomUUID();
        return insertClient(userId, client);
    }

    public List<User> selectAllClients();

    Optional<User> selectClientById(UUID id);

    int deleteClientById(UUID id);

    int updateClientById(UUID id, User client);

    int chooseACoach (UUID userId, UUID coachId);
}
