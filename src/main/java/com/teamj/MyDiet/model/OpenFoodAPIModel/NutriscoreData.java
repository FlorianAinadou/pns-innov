
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
    "score",
    "is_water",
    "fiber_points",
    "is_beverage",
    "sugars_value",
    "fruits_vegetables_nuts_colza_walnut_olive_oils_points",
    "positive_points",
    "proteins",
    "sugars_points",
    "saturated_fat_points",
    "proteins_points",
    "sodium_value",
    "negative_points",
    "sodium_points",
    "fiber_value",
    "energy_points",
    "energy",
    "grade",
    "saturated_fat_ratio",
    "sugars",
    "saturated_fat_ratio_value",
    "saturated_fat_ratio_points",
    "energy_value",
    "sodium",
    "fruits_vegetables_nuts_colza_walnut_olive_oils_value",
    "fiber",
    "fruits_vegetables_nuts_colza_walnut_olive_oils",
    "is_cheese",
    "saturated_fat_value",
    "is_fat",
    "saturated_fat",
    "proteins_value"
})
public class NutriscoreData implements Serializable
{

    @JsonProperty("score")
    private Long score;
    @JsonProperty("is_water")
    private Long isWater;
    @JsonProperty("fiber_points")
    private Long fiberPoints;
    @JsonProperty("is_beverage")
    private Long isBeverage;
    @JsonProperty("sugars_value")
    private Float sugarsValue;
    @JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils_points")
    private Long fruitsVegetablesNutsColzaWalnutOliveOilsPoints;
    @JsonProperty("positive_points")
    private Long positivePoints;
    @JsonProperty("proteins")
    private Float proteins;
    @JsonProperty("sugars_points")
    private Long sugarsPoints;
    @JsonProperty("saturated_fat_points")
    private Long saturatedFatPoints;
    @JsonProperty("proteins_points")
    private Long proteinsPoints;
    @JsonProperty("sodium_value")
    private Long sodiumValue;
    @JsonProperty("negative_points")
    private Long negativePoints;
    @JsonProperty("sodium_points")
    private Long sodiumPoints;
    @JsonProperty("fiber_value")
    private Float fiberValue;
    @JsonProperty("energy_points")
    private Long energyPoints;
    @JsonProperty("energy")
    private Long energy;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("saturated_fat_ratio")
    private Float saturatedFatRatio;
    @JsonProperty("sugars")
    private Float sugars;
    @JsonProperty("saturated_fat_ratio_value")
    private Long saturatedFatRatioValue;
    @JsonProperty("saturated_fat_ratio_points")
    private Long saturatedFatRatioPoints;
    @JsonProperty("energy_value")
    private Long energyValue;
    @JsonProperty("sodium")
    private Long sodium;
    @JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils_value")
    private Long fruitsVegetablesNutsColzaWalnutOliveOilsValue;
    @JsonProperty("fiber")
    private Float fiber;
    @JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils")
    private Long fruitsVegetablesNutsColzaWalnutOliveOils;
    @JsonProperty("is_cheese")
    private Long isCheese;
    @JsonProperty("saturated_fat_value")
    private Float saturatedFatValue;
    @JsonProperty("is_fat")
    private Long isFat;
    @JsonProperty("saturated_fat")
    private Float saturatedFat;
    @JsonProperty("proteins_value")
    private Float proteinsValue;
    private final static long serialVersionUID = -3082100359224899931L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NutriscoreData() {
    }

    /**
     * 
     * @param positivePoints
     * @param proteinsPoints
     * @param energyPoints
     * @param saturatedFatPoints
     * @param sodiumPoints
     * @param saturatedFatValue
     * @param proteinsValue
     * @param score
     * @param sugarsPoints
     * @param negativePoints
     * @param saturatedFatRatioPoints
     * @param saturatedFatRatioValue
     * @param proteins
     * @param energyValue
     * @param fruitsVegetablesNutsColzaWalnutOliveOilsPoints
     * @param energy
     * @param sugarsValue
     * @param fiber
     * @param sugars
     * @param fruitsVegetablesNutsColzaWalnutOliveOilsValue
     * @param isCheese
     * @param isBeverage
     * @param fiberValue
     * @param saturatedFatRatio
     * @param isWater
     * @param fiberPoints
     * @param sodium
     * @param saturatedFat
     * @param isFat
     * @param sodiumValue
     * @param grade
     * @param fruitsVegetablesNutsColzaWalnutOliveOils
     */
    public NutriscoreData(Long score, Long isWater, Long fiberPoints, Long isBeverage, Float sugarsValue, Long fruitsVegetablesNutsColzaWalnutOliveOilsPoints, Long positivePoints, Float proteins, Long sugarsPoints, Long saturatedFatPoints, Long proteinsPoints, Long sodiumValue, Long negativePoints, Long sodiumPoints, Float fiberValue, Long energyPoints, Long energy, String grade, Float saturatedFatRatio, Float sugars, Long saturatedFatRatioValue, Long saturatedFatRatioPoints, Long energyValue, Long sodium, Long fruitsVegetablesNutsColzaWalnutOliveOilsValue, Float fiber, Long fruitsVegetablesNutsColzaWalnutOliveOils, Long isCheese, Float saturatedFatValue, Long isFat, Float saturatedFat, Float proteinsValue) {
        super();
        this.score = score;
        this.isWater = isWater;
        this.fiberPoints = fiberPoints;
        this.isBeverage = isBeverage;
        this.sugarsValue = sugarsValue;
        this.fruitsVegetablesNutsColzaWalnutOliveOilsPoints = fruitsVegetablesNutsColzaWalnutOliveOilsPoints;
        this.positivePoints = positivePoints;
        this.proteins = proteins;
        this.sugarsPoints = sugarsPoints;
        this.saturatedFatPoints = saturatedFatPoints;
        this.proteinsPoints = proteinsPoints;
        this.sodiumValue = sodiumValue;
        this.negativePoints = negativePoints;
        this.sodiumPoints = sodiumPoints;
        this.fiberValue = fiberValue;
        this.energyPoints = energyPoints;
        this.energy = energy;
        this.grade = grade;
        this.saturatedFatRatio = saturatedFatRatio;
        this.sugars = sugars;
        this.saturatedFatRatioValue = saturatedFatRatioValue;
        this.saturatedFatRatioPoints = saturatedFatRatioPoints;
        this.energyValue = energyValue;
        this.sodium = sodium;
        this.fruitsVegetablesNutsColzaWalnutOliveOilsValue = fruitsVegetablesNutsColzaWalnutOliveOilsValue;
        this.fiber = fiber;
        this.fruitsVegetablesNutsColzaWalnutOliveOils = fruitsVegetablesNutsColzaWalnutOliveOils;
        this.isCheese = isCheese;
        this.saturatedFatValue = saturatedFatValue;
        this.isFat = isFat;
        this.saturatedFat = saturatedFat;
        this.proteinsValue = proteinsValue;
    }

    @JsonProperty("score")
    public Long getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Long score) {
        this.score = score;
    }

    @JsonProperty("is_water")
    public Long getIsWater() {
        return isWater;
    }

    @JsonProperty("is_water")
    public void setIsWater(Long isWater) {
        this.isWater = isWater;
    }

    @JsonProperty("fiber_points")
    public Long getFiberPoints() {
        return fiberPoints;
    }

    @JsonProperty("fiber_points")
    public void setFiberPoints(Long fiberPoints) {
        this.fiberPoints = fiberPoints;
    }

    @JsonProperty("is_beverage")
    public Long getIsBeverage() {
        return isBeverage;
    }

    @JsonProperty("is_beverage")
    public void setIsBeverage(Long isBeverage) {
        this.isBeverage = isBeverage;
    }

    @JsonProperty("sugars_value")
    public Float getSugarsValue() {
        return sugarsValue;
    }

    @JsonProperty("sugars_value")
    public void setSugarsValue(Float sugarsValue) {
        this.sugarsValue = sugarsValue;
    }

    @JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils_points")
    public Long getFruitsVegetablesNutsColzaWalnutOliveOilsPoints() {
        return fruitsVegetablesNutsColzaWalnutOliveOilsPoints;
    }

    @JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils_points")
    public void setFruitsVegetablesNutsColzaWalnutOliveOilsPoints(Long fruitsVegetablesNutsColzaWalnutOliveOilsPoints) {
        this.fruitsVegetablesNutsColzaWalnutOliveOilsPoints = fruitsVegetablesNutsColzaWalnutOliveOilsPoints;
    }

    @JsonProperty("positive_points")
    public Long getPositivePoints() {
        return positivePoints;
    }

    @JsonProperty("positive_points")
    public void setPositivePoints(Long positivePoints) {
        this.positivePoints = positivePoints;
    }

    @JsonProperty("proteins")
    public Float getProteins() {
        return proteins;
    }

    @JsonProperty("proteins")
    public void setProteins(Float proteins) {
        this.proteins = proteins;
    }

    @JsonProperty("sugars_points")
    public Long getSugarsPoints() {
        return sugarsPoints;
    }

    @JsonProperty("sugars_points")
    public void setSugarsPoints(Long sugarsPoints) {
        this.sugarsPoints = sugarsPoints;
    }

    @JsonProperty("saturated_fat_points")
    public Long getSaturatedFatPoints() {
        return saturatedFatPoints;
    }

    @JsonProperty("saturated_fat_points")
    public void setSaturatedFatPoints(Long saturatedFatPoints) {
        this.saturatedFatPoints = saturatedFatPoints;
    }

    @JsonProperty("proteins_points")
    public Long getProteinsPoints() {
        return proteinsPoints;
    }

    @JsonProperty("proteins_points")
    public void setProteinsPoints(Long proteinsPoints) {
        this.proteinsPoints = proteinsPoints;
    }

    @JsonProperty("sodium_value")
    public Long getSodiumValue() {
        return sodiumValue;
    }

    @JsonProperty("sodium_value")
    public void setSodiumValue(Long sodiumValue) {
        this.sodiumValue = sodiumValue;
    }

    @JsonProperty("negative_points")
    public Long getNegativePoints() {
        return negativePoints;
    }

    @JsonProperty("negative_points")
    public void setNegativePoints(Long negativePoints) {
        this.negativePoints = negativePoints;
    }

    @JsonProperty("sodium_points")
    public Long getSodiumPoints() {
        return sodiumPoints;
    }

    @JsonProperty("sodium_points")
    public void setSodiumPoints(Long sodiumPoints) {
        this.sodiumPoints = sodiumPoints;
    }

    @JsonProperty("fiber_value")
    public Float getFiberValue() {
        return fiberValue;
    }

    @JsonProperty("fiber_value")
    public void setFiberValue(Float fiberValue) {
        this.fiberValue = fiberValue;
    }

    @JsonProperty("energy_points")
    public Long getEnergyPoints() {
        return energyPoints;
    }

    @JsonProperty("energy_points")
    public void setEnergyPoints(Long energyPoints) {
        this.energyPoints = energyPoints;
    }

    @JsonProperty("energy")
    public Long getEnergy() {
        return energy;
    }

    @JsonProperty("energy")
    public void setEnergy(Long energy) {
        this.energy = energy;
    }

    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @JsonProperty("saturated_fat_ratio")
    public Float getSaturatedFatRatio() {
        return saturatedFatRatio;
    }

    @JsonProperty("saturated_fat_ratio")
    public void setSaturatedFatRatio(Float saturatedFatRatio) {
        this.saturatedFatRatio = saturatedFatRatio;
    }

    @JsonProperty("sugars")
    public Float getSugars() {
        return sugars;
    }

    @JsonProperty("sugars")
    public void setSugars(Float sugars) {
        this.sugars = sugars;
    }

    @JsonProperty("saturated_fat_ratio_value")
    public Long getSaturatedFatRatioValue() {
        return saturatedFatRatioValue;
    }

    @JsonProperty("saturated_fat_ratio_value")
    public void setSaturatedFatRatioValue(Long saturatedFatRatioValue) {
        this.saturatedFatRatioValue = saturatedFatRatioValue;
    }

    @JsonProperty("saturated_fat_ratio_points")
    public Long getSaturatedFatRatioPoints() {
        return saturatedFatRatioPoints;
    }

    @JsonProperty("saturated_fat_ratio_points")
    public void setSaturatedFatRatioPoints(Long saturatedFatRatioPoints) {
        this.saturatedFatRatioPoints = saturatedFatRatioPoints;
    }

    @JsonProperty("energy_value")
    public Long getEnergyValue() {
        return energyValue;
    }

    @JsonProperty("energy_value")
    public void setEnergyValue(Long energyValue) {
        this.energyValue = energyValue;
    }

    @JsonProperty("sodium")
    public Long getSodium() {
        return sodium;
    }

    @JsonProperty("sodium")
    public void setSodium(Long sodium) {
        this.sodium = sodium;
    }

    @JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils_value")
    public Long getFruitsVegetablesNutsColzaWalnutOliveOilsValue() {
        return fruitsVegetablesNutsColzaWalnutOliveOilsValue;
    }

    @JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils_value")
    public void setFruitsVegetablesNutsColzaWalnutOliveOilsValue(Long fruitsVegetablesNutsColzaWalnutOliveOilsValue) {
        this.fruitsVegetablesNutsColzaWalnutOliveOilsValue = fruitsVegetablesNutsColzaWalnutOliveOilsValue;
    }

    @JsonProperty("fiber")
    public Float getFiber() {
        return fiber;
    }

    @JsonProperty("fiber")
    public void setFiber(Float fiber) {
        this.fiber = fiber;
    }

    @JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils")
    public Long getFruitsVegetablesNutsColzaWalnutOliveOils() {
        return fruitsVegetablesNutsColzaWalnutOliveOils;
    }

    @JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils")
    public void setFruitsVegetablesNutsColzaWalnutOliveOils(Long fruitsVegetablesNutsColzaWalnutOliveOils) {
        this.fruitsVegetablesNutsColzaWalnutOliveOils = fruitsVegetablesNutsColzaWalnutOliveOils;
    }

    @JsonProperty("is_cheese")
    public Long getIsCheese() {
        return isCheese;
    }

    @JsonProperty("is_cheese")
    public void setIsCheese(Long isCheese) {
        this.isCheese = isCheese;
    }

    @JsonProperty("saturated_fat_value")
    public Float getSaturatedFatValue() {
        return saturatedFatValue;
    }

    @JsonProperty("saturated_fat_value")
    public void setSaturatedFatValue(Float saturatedFatValue) {
        this.saturatedFatValue = saturatedFatValue;
    }

    @JsonProperty("is_fat")
    public Long getIsFat() {
        return isFat;
    }

    @JsonProperty("is_fat")
    public void setIsFat(Long isFat) {
        this.isFat = isFat;
    }

    @JsonProperty("saturated_fat")
    public Float getSaturatedFat() {
        return saturatedFat;
    }

    @JsonProperty("saturated_fat")
    public void setSaturatedFat(Float saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    @JsonProperty("proteins_value")
    public Float getProteinsValue() {
        return proteinsValue;
    }

    @JsonProperty("proteins_value")
    public void setProteinsValue(Float proteinsValue) {
        this.proteinsValue = proteinsValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("score", score).append("isWater", isWater).append("fiberPoints", fiberPoints).append("isBeverage", isBeverage).append("sugarsValue", sugarsValue).append("fruitsVegetablesNutsColzaWalnutOliveOilsPoints", fruitsVegetablesNutsColzaWalnutOliveOilsPoints).append("positivePoints", positivePoints).append("proteins", proteins).append("sugarsPoints", sugarsPoints).append("saturatedFatPoints", saturatedFatPoints).append("proteinsPoints", proteinsPoints).append("sodiumValue", sodiumValue).append("negativePoints", negativePoints).append("sodiumPoints", sodiumPoints).append("fiberValue", fiberValue).append("energyPoints", energyPoints).append("energy", energy).append("grade", grade).append("saturatedFatRatio", saturatedFatRatio).append("sugars", sugars).append("saturatedFatRatioValue", saturatedFatRatioValue).append("saturatedFatRatioPoints", saturatedFatRatioPoints).append("energyValue", energyValue).append("sodium", sodium).append("fruitsVegetablesNutsColzaWalnutOliveOilsValue", fruitsVegetablesNutsColzaWalnutOliveOilsValue).append("fiber", fiber).append("fruitsVegetablesNutsColzaWalnutOliveOils", fruitsVegetablesNutsColzaWalnutOliveOils).append("isCheese", isCheese).append("saturatedFatValue", saturatedFatValue).append("isFat", isFat).append("saturatedFat", saturatedFat).append("proteinsValue", proteinsValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(positivePoints).append(proteinsPoints).append(energyPoints).append(saturatedFatPoints).append(sodiumPoints).append(saturatedFatValue).append(proteinsValue).append(score).append(sugarsPoints).append(negativePoints).append(saturatedFatRatioPoints).append(saturatedFatRatioValue).append(proteins).append(energyValue).append(fruitsVegetablesNutsColzaWalnutOliveOilsPoints).append(energy).append(sugarsValue).append(fiber).append(sugars).append(fruitsVegetablesNutsColzaWalnutOliveOilsValue).append(isCheese).append(isBeverage).append(fiberValue).append(saturatedFatRatio).append(isWater).append(fiberPoints).append(sodium).append(saturatedFat).append(isFat).append(sodiumValue).append(grade).append(fruitsVegetablesNutsColzaWalnutOliveOils).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NutriscoreData) == false) {
            return false;
        }
        NutriscoreData rhs = ((NutriscoreData) other);
        return new EqualsBuilder().append(positivePoints, rhs.positivePoints).append(proteinsPoints, rhs.proteinsPoints).append(energyPoints, rhs.energyPoints).append(saturatedFatPoints, rhs.saturatedFatPoints).append(sodiumPoints, rhs.sodiumPoints).append(saturatedFatValue, rhs.saturatedFatValue).append(proteinsValue, rhs.proteinsValue).append(score, rhs.score).append(sugarsPoints, rhs.sugarsPoints).append(negativePoints, rhs.negativePoints).append(saturatedFatRatioPoints, rhs.saturatedFatRatioPoints).append(saturatedFatRatioValue, rhs.saturatedFatRatioValue).append(proteins, rhs.proteins).append(energyValue, rhs.energyValue).append(fruitsVegetablesNutsColzaWalnutOliveOilsPoints, rhs.fruitsVegetablesNutsColzaWalnutOliveOilsPoints).append(energy, rhs.energy).append(sugarsValue, rhs.sugarsValue).append(fiber, rhs.fiber).append(sugars, rhs.sugars).append(fruitsVegetablesNutsColzaWalnutOliveOilsValue, rhs.fruitsVegetablesNutsColzaWalnutOliveOilsValue).append(isCheese, rhs.isCheese).append(isBeverage, rhs.isBeverage).append(fiberValue, rhs.fiberValue).append(saturatedFatRatio, rhs.saturatedFatRatio).append(isWater, rhs.isWater).append(fiberPoints, rhs.fiberPoints).append(sodium, rhs.sodium).append(saturatedFat, rhs.saturatedFat).append(isFat, rhs.isFat).append(sodiumValue, rhs.sodiumValue).append(grade, rhs.grade).append(fruitsVegetablesNutsColzaWalnutOliveOils, rhs.fruitsVegetablesNutsColzaWalnutOliveOils).isEquals();
    }

}
