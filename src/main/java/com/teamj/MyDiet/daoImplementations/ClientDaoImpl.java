package com.teamj.MyDiet.daoImplementations;

import com.teamj.MyDiet.dao.ClientDao;
import com.teamj.MyDiet.model.Client;
import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeClient")
public class ClientDaoImpl implements ClientDao{

    @Override
    public int insertClient(UUID userId, Client client) {
        UserDaoImpl.users.add(client);
        return 1;
    }


    @Override
    public List<User> selectAllClients() {
    ArrayList<User> clients= new ArrayList<>();
        for ( User user: UserDaoImpl.users ) {
            if (!user.isCoach()){
                clients.add(user);
            }
        }
        return clients;
    }

    @Override
    public Optional<User> selectClientById(UUID id) {
        return UserDaoImpl.users.stream()
                .filter(user -> user.getUserID().equals(id) && !user.isCoach())
                .findFirst();
    }

    @Override
    public int deleteClientById(UUID id) {
        Optional<User> user= selectClientById(id);
        if (user.isPresent()){
            UserDaoImpl.users.remove(user.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int updateClientById(UUID id, User client) {
        return selectClientById(id)
                .map(user -> {
                    int indexOfFoodToDelete = UserDaoImpl.users.indexOf(user);
                    if(indexOfFoodToDelete>=0){
                        UserDaoImpl.users.set(indexOfFoodToDelete, client);
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

    @Override
    public int chooseACoach(UUID userId, UUID coachId) {

    }


}
