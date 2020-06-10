package com.teamj.MyDiet.controller;


import com.teamj.MyDiet.dao.DailyDao;
import com.teamj.MyDiet.dao.FoodDao;
import com.teamj.MyDiet.model.DailyReport;
import com.teamj.MyDiet.model.Food;
import com.teamj.MyDiet.model.OpenFoodAPIModel.ResponseFood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@RequestMapping("api/v1/food")
@RestController
public class FoodController {
    @Autowired
    private FoodDao foodDao;
    @Autowired
    private DailyDao dailyDao;


    /**
     * @param food to save in the database
     * @return the response of the server
     */
    @PostMapping
    public ResponseEntity<Void> addFood(@RequestBody Food food) {
        Food foodToSave = foodDao.save(food);

        if (foodToSave == null) {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(food.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping(path = "/code/{idUser}/{code}")
    public ResponseEntity<Void> addFoodByBarCode(@PathVariable("idUser") int idUser, @PathVariable("code") long code) {
        Food food = new Food();
        final String uri = "https://world.openfoodfacts.org/api/v0/product/" + code + ".json";

        RestTemplate restTemplate = new RestTemplate();
        ResponseFood result = restTemplate.getForObject(uri, ResponseFood.class);
        if (result != null && result.getProduct() != null &&
                result.getProduct().getNutriments() != null &&
                result.getProduct().getNutriments().getEnergyKcal100g() != null &&
                result.getProduct().getNutriments().getProteins100g() != null &&
                result.getProduct().getNutriments().getCarbohydrates100g() != null &&
                result.getProduct().getNutriments().getFat100g() != null &&
                result.getProduct().getProductName() != null) {

            // Find daily;
            final Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            DailyReport dailyReport = dailyDao.findByUserIDAndReportDateGreaterThanEqual(idUser, cal.getTime()).get(0);

            //Set food
            food.setKcal(result.getProduct().getNutriments().getEnergyKcal100g().intValue());
            food.setCarbohydrates(result.getProduct().getNutriments().getCarbohydrates100g().intValue());
            food.setLipids(result.getProduct().getNutriments().getFat100g().intValue());
            food.setProtein(result.getProduct().getNutriments().getProteins100g().intValue());
            food.setName(result.getProduct().getProductName());
            //food.setId((int)(Math.random()*1000000));

            if (dailyReport != null) {

                //Set Daily
                dailyReport.setCalorie(dailyReport.getCalorie() + food.getKcal());
                dailyReport.setLipide(dailyReport.getLipide() + food.getLipids());
                dailyReport.setProteine(dailyReport.getProteine() + food.getProtein());
                dailyReport.setGlucide(dailyReport.getGlucide() + food.getCarbohydrates());

                //save data
                dailyDao.save(dailyReport);
            }

            foodDao.save(food);
        } else {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/code/{id}")
                .buildAndExpand(food.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    /**
     * @return all the food of the database
     */
    @GetMapping(path = "/all")
    public List<Food> getAllFood() {
        return foodDao.findAll();
    }

    /**
     * @param id of the user
     * @return the food by the user from openfoodfact
     */
    @GetMapping(path = "/code/{id}")
    public Food getFoodByBarCode(@PathVariable("id") long id) {
        Food food = new Food();
        final String uri = "https://world.openfoodfacts.org/api/v0/product/" + id + ".json";

        RestTemplate restTemplate = new RestTemplate();
        ResponseFood result = restTemplate.getForObject(uri, ResponseFood.class);
        if (result != null && result.getProduct() != null &&
                result.getProduct().getNutriments() != null &&
                result.getProduct().getNutriments().getEnergyKcal100g() != null &&
                result.getProduct().getNutriments().getProteins100g() != null &&
                result.getProduct().getNutriments().getCarbohydrates100g() != null &&
                result.getProduct().getNutriments().getFat100g() != null &&
                result.getProduct().getProductName() != null) {
            food.setKcal(result.getProduct().getNutriments().getEnergyKcal100g().intValue());
            food.setCarbohydrates(result.getProduct().getNutriments().getCarbohydrates100g().intValue());
            food.setLipids(result.getProduct().getNutriments().getFat100g().intValue());
            food.setProtein(result.getProduct().getNutriments().getProteins100g().intValue());
            food.setName(result.getProduct().getProductName());
        } else {
            food.setName("error");
        }

        return food;

    }

    /**
     * @param id of the user
     * @return the list of the food by the user
     */
    @GetMapping(path = "{id}")
    public Optional<Food> getFoodById(@PathVariable("id") int id) {
        return foodDao.findById(id);
    }

    /**
     * @param food to delete
     */
    @DeleteMapping(path = "/{idUser}/{id}")
    public void deleteFoodById(@PathVariable("idUser") int idUser, @PathVariable("id") Food food) {
        // Find daily;
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        DailyReport dailyReport = dailyDao.findByUserIDAndReportDateGreaterThanEqual(idUser, cal.getTime()).get(0);

        if (dailyReport != null) {

            //Set Daily
            dailyReport.setCalorie(dailyReport.getCalorie() - food.getKcal());
            dailyReport.setLipide(dailyReport.getLipide() - food.getLipids());
            dailyReport.setProteine(dailyReport.getProteine() - food.getProtein());
            dailyReport.setGlucide(dailyReport.getGlucide() - food.getCarbohydrates());

            //save data
            dailyDao.save(dailyReport);
        }
        foodDao.delete(food);
    }


}