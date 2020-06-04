package com.teamj.MyDiet.dao;

import com.teamj.MyDiet.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecoDao extends JpaRepository<Recommendation,Integer> {
        List<Recommendation> findAllByIdUserEquals(int id);

}
