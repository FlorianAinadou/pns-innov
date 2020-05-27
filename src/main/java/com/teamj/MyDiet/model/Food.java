package com.teamj.MyDiet.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Food {
    private final int kcal;
    private final int protein;
    private final int carbohydrates;
    private final int lipids;
    private final String name;

    public Food(@JsonProperty("kcal") int kcal, @JsonProperty("protein")int protein, @JsonProperty("carbohydrates")int carbohydrates, @JsonProperty("lipids") int lipids, @JsonProperty("name") String name) {
        this.kcal = kcal;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.lipids = lipids;
        this.name = name;
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
