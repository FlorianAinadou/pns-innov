package com.teamj.MyDiet.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Food {
    public void setId(int id) {
        this.id = id;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setLipids(int lipids) {
        this.lipids = lipids;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private  int id;
    private  int kcal;
    private  int protein;
    private  int carbohydrates;
    private  int lipids;
    private String name;

    public Food(){

    }


    public Food(int id, @JsonProperty("kcal") int kcal, @JsonProperty("protein") int protein, @JsonProperty("carbohydrates") int carbohydrates, @JsonProperty("lipids") int lipids, @JsonProperty("name") String name) {
        this.id = id;
        this.kcal = kcal;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.lipids = lipids;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public int getKcal() {
        return kcal;
    }

    public int getProtein() {
        return protein;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getLipids() {
        return lipids;
    }

    public String getName() {
        return name;
    }
}