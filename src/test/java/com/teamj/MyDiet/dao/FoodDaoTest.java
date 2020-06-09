package com.teamj.MyDiet.dao;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teamj.MyDiet.model.Food;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodDaoTest {

    @Autowired
    private FoodDao foodDao;


    @Before
    public void setup(){
        Food food=new Food(1,50,10,20,10,"Viande");
        foodDao.save(food);
    }

    @Test
    public void getFoodById(){
        Optional<Food> food1=foodDao.findById(1);
        Food food2= food1.get();
        assertEquals(1, food2.getId());
    }

    @Test
    public void addFoodTest() throws Exception {

        Optional<Food> food1=foodDao.findById(1);
        Assert.assertNotNull(food1);
        Food food2= food1.get();
        Assert.assertEquals(food2.getName() ,"Viande");

    }

    @Test
    public void getAllFood() throws Exception {
        List<Food> foods= foodDao.findAll();
        Assert.assertEquals(foods.size(), 1);
    }

    @Test
    public void deleteFoodById() throws Exception{
        Optional<Food> food1=foodDao.findById(1);
        Assert.assertNotNull(food1);
        foodDao.deleteById(1);
        food1=foodDao.findById(1);
        Assert.assertFalse(food1.isPresent());
    }


}
