package com.teamj.MyDiet.controller;

import com.teamj.MyDiet.dao.RecoDao;
import com.teamj.MyDiet.model.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class RecommendationController {

    @Autowired
    RecoDao recoDao;

    @GetMapping(value = "api/v1/recommendation/{id}")
    public List<Recommendation> getCoachById(@PathVariable int id) {
        return recoDao.findAllByIdUserEquals(id);
    }

    @PostMapping(value = "api/v1/recommendation")
    public ResponseEntity<Void> save(@PathVariable int idUser, @RequestBody Recommendation recommendation){

        Recommendation recommendation1 = recoDao.save(recommendation);

        if(recommendation1 == null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(recommendation.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }
}
