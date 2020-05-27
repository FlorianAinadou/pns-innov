package com.teamj.MyDiet.model;

public class Food {
    private final int kcal;
    private final int protein;
    private final int carbohydrates;
    private final int lipids;
    private final String name;

    public Food(int kcal, int protein, int carbohydrates, int lipids, String name) {
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
