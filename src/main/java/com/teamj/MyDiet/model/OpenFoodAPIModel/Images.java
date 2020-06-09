
package com.teamj.MyDiet.model.OpenFoodAPIModel;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "1",
    "2",
    "3",
    "4",
    "5",
    "nutrition",
    "nutrition_en",
    "ingredients_en",
    "front_en",
    "front",
    "ingredients"
})
public class Images implements Serializable
{

    @JsonProperty("1")
    private com.teamj.MyDiet.model.OpenFoodAPIModel._1 _1;
    @JsonProperty("2")
    private com.teamj.MyDiet.model.OpenFoodAPIModel._2 _2;
    @JsonProperty("3")
    private com.teamj.MyDiet.model.OpenFoodAPIModel._3 _3;
    @JsonProperty("4")
    private com.teamj.MyDiet.model.OpenFoodAPIModel._4 _4;
    @JsonProperty("5")
    private com.teamj.MyDiet.model.OpenFoodAPIModel._5 _5;
    @JsonProperty("nutrition")
    private Nutrition nutrition;
    @JsonProperty("nutrition_en")
    private NutritionEn nutritionEn;
    @JsonProperty("ingredients_en")
    private IngredientsEn ingredientsEn;
    @JsonProperty("front_en")
    private FrontEn frontEn;
    @JsonProperty("front")
    private Front front;
    @JsonProperty("ingredients")
    private Ingredients ingredients;
    private final static long serialVersionUID = -4484538054745239332L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Images() {
    }

    /**
     * 
     * @param _1
     * @param nutrition
     * @param _2
     * @param _3
     * @param _4
     * @param _5
     * @param frontEn
     * @param ingredientsEn
     * @param nutritionEn
     * @param ingredients
     * @param front
     */
    public Images(com.teamj.MyDiet.model.OpenFoodAPIModel._1 _1, com.teamj.MyDiet.model.OpenFoodAPIModel._2 _2, com.teamj.MyDiet.model.OpenFoodAPIModel._3 _3, com.teamj.MyDiet.model.OpenFoodAPIModel._4 _4, com.teamj.MyDiet.model.OpenFoodAPIModel._5 _5, Nutrition nutrition, NutritionEn nutritionEn, IngredientsEn ingredientsEn, FrontEn frontEn, Front front, Ingredients ingredients) {
        super();
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this.nutrition = nutrition;
        this.nutritionEn = nutritionEn;
        this.ingredientsEn = ingredientsEn;
        this.frontEn = frontEn;
        this.front = front;
        this.ingredients = ingredients;
    }

    @JsonProperty("1")
    public com.teamj.MyDiet.model.OpenFoodAPIModel._1 get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(com.teamj.MyDiet.model.OpenFoodAPIModel._1 _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public com.teamj.MyDiet.model.OpenFoodAPIModel._2 get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(com.teamj.MyDiet.model.OpenFoodAPIModel._2 _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public com.teamj.MyDiet.model.OpenFoodAPIModel._3 get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(com.teamj.MyDiet.model.OpenFoodAPIModel._3 _3) {
        this._3 = _3;
    }

    @JsonProperty("4")
    public com.teamj.MyDiet.model.OpenFoodAPIModel._4 get4() {
        return _4;
    }

    @JsonProperty("4")
    public void set4(com.teamj.MyDiet.model.OpenFoodAPIModel._4 _4) {
        this._4 = _4;
    }

    @JsonProperty("5")
    public com.teamj.MyDiet.model.OpenFoodAPIModel._5 get5() {
        return _5;
    }

    @JsonProperty("5")
    public void set5(com.teamj.MyDiet.model.OpenFoodAPIModel._5 _5) {
        this._5 = _5;
    }

    @JsonProperty("nutrition")
    public Nutrition getNutrition() {
        return nutrition;
    }

    @JsonProperty("nutrition")
    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    @JsonProperty("nutrition_en")
    public NutritionEn getNutritionEn() {
        return nutritionEn;
    }

    @JsonProperty("nutrition_en")
    public void setNutritionEn(NutritionEn nutritionEn) {
        this.nutritionEn = nutritionEn;
    }

    @JsonProperty("ingredients_en")
    public IngredientsEn getIngredientsEn() {
        return ingredientsEn;
    }

    @JsonProperty("ingredients_en")
    public void setIngredientsEn(IngredientsEn ingredientsEn) {
        this.ingredientsEn = ingredientsEn;
    }

    @JsonProperty("front_en")
    public FrontEn getFrontEn() {
        return frontEn;
    }

    @JsonProperty("front_en")
    public void setFrontEn(FrontEn frontEn) {
        this.frontEn = frontEn;
    }

    @JsonProperty("front")
    public Front getFront() {
        return front;
    }

    @JsonProperty("front")
    public void setFront(Front front) {
        this.front = front;
    }

    @JsonProperty("ingredients")
    public Ingredients getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("_1", _1).append("_2", _2).append("_3", _3).append("_4", _4).append("_5", _5).append("nutrition", nutrition).append("nutritionEn", nutritionEn).append("ingredientsEn", ingredientsEn).append("frontEn", frontEn).append("front", front).append("ingredients", ingredients).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_1).append(nutrition).append(_2).append(_3).append(_4).append(_5).append(frontEn).append(ingredientsEn).append(nutritionEn).append(ingredients).append(front).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Images) == false) {
            return false;
        }
        Images rhs = ((Images) other);
        return new EqualsBuilder().append(_1, rhs._1).append(nutrition, rhs.nutrition).append(_2, rhs._2).append(_3, rhs._3).append(_4, rhs._4).append(_5, rhs._5).append(frontEn, rhs.frontEn).append(ingredientsEn, rhs.ingredientsEn).append(nutritionEn, rhs.nutritionEn).append(ingredients, rhs.ingredients).append(front, rhs.front).isEquals();
    }

}
