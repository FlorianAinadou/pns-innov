
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
    "energy_unit",
    "saturated-fat_100g",
    "fat_100g",
    "nutrition-score-fr_100g",
    "vitamin-a_100g",
    "vitamin-c",
    "sodium_100g",
    "saturated-fat",
    "vitamin-a_serving",
    "calcium_value",
    "fiber_100g",
    "proteins",
    "nova-group",
    "fat_unit",
    "iron_serving",
    "saturated-fat_value",
    "carbohydrates",
    "cholesterol_100g",
    "carbohydrates_unit",
    "iron",
    "trans-fat_value",
    "fiber_serving",
    "fiber_value",
    "energy_serving",
    "vitamin-c_unit",
    "energy-kcal_100g",
    "vitamin-a",
    "iron_unit",
    "sodium",
    "energy_100g",
    "fiber",
    "trans-fat_100g",
    "cholesterol_serving",
    "cholesterol_unit",
    "salt",
    "energy-kcal_unit",
    "trans-fat_unit",
    "fat",
    "salt_100g",
    "proteins_unit",
    "fat_value",
    "proteins_100g",
    "vitamin-c_serving",
    "nutrition-score-fr",
    "fruits-vegetables-nuts-estimate-from-ingredients_100g",
    "sodium_serving",
    "vitamin-c_100g",
    "vitamin-a_unit",
    "saturated-fat_serving",
    "calcium",
    "vitamin-a_value",
    "sugars_value",
    "salt_value",
    "calcium_100g",
    "fiber_unit",
    "fat_serving",
    "iron_100g",
    "calcium_unit",
    "sodium_value",
    "salt_unit",
    "carbohydrates_serving",
    "energy",
    "sugars_serving",
    "sodium_unit",
    "cholesterol_value",
    "sugars",
    "energy-kcal",
    "trans-fat_serving",
    "calcium_serving",
    "carbohydrates_value",
    "energy_value",
    "vitamin-c_value",
    "sugars_100g",
    "nova-group_serving",
    "nova-group_100g",
    "iron_value",
    "energy-kcal_value",
    "trans-fat",
    "carbohydrates_100g",
    "proteins_serving",
    "saturated-fat_unit",
    "sugars_unit",
    "energy-kcal_serving",
    "proteins_value",
    "salt_serving",
    "cholesterol"
})
public class Nutriments implements Serializable
{

    @JsonProperty("energy_unit")
    private String energyUnit;
    @JsonProperty("saturated-fat_100g")
    private Float saturatedFat100g;
    @JsonProperty("fat_100g")
    private Float fat100g;
    @JsonProperty("nutrition-score-fr_100g")
    private Long nutritionScoreFr100g;
    @JsonProperty("vitamin-a_100g")
    private Float vitaminA100g;
    @JsonProperty("vitamin-c")
    private Long vitaminC;
    @JsonProperty("sodium_100g")
    private Float sodium100g;
    @JsonProperty("saturated-fat")
    private Float saturatedFat;
    @JsonProperty("vitamin-a_serving")
    private Float vitaminAServing;
    @JsonProperty("calcium_value")
    private Long calciumValue;
    @JsonProperty("fiber_100g")
    private Float fiber100g;
    @JsonProperty("proteins")
    private Float proteins;
    @JsonProperty("nova-group")
    private Long novaGroup;
    @JsonProperty("fat_unit")
    private String fatUnit;
    @JsonProperty("iron_serving")
    private Float ironServing;
    @JsonProperty("saturated-fat_value")
    private Float saturatedFatValue;
    @JsonProperty("carbohydrates")
    private Float carbohydrates;
    @JsonProperty("cholesterol_100g")
    private Long cholesterol100g;
    @JsonProperty("carbohydrates_unit")
    private String carbohydratesUnit;
    @JsonProperty("iron")
    private Float iron;
    @JsonProperty("trans-fat_value")
    private Long transFatValue;
    @JsonProperty("fiber_serving")
    private Float fiberServing;
    @JsonProperty("fiber_value")
    private Float fiberValue;
    @JsonProperty("energy_serving")
    private Long energyServing;
    @JsonProperty("vitamin-c_unit")
    private String vitaminCUnit;
    @JsonProperty("energy-kcal_100g")
    private Long energyKcal100g;
    @JsonProperty("vitamin-a")
    private Float vitaminA;
    @JsonProperty("iron_unit")
    private String ironUnit;
    @JsonProperty("sodium")
    private Float sodium;
    @JsonProperty("energy_100g")
    private Long energy100g;
    @JsonProperty("fiber")
    private Float fiber;
    @JsonProperty("trans-fat_100g")
    private Long transFat100g;
    @JsonProperty("cholesterol_serving")
    private Long cholesterolServing;
    @JsonProperty("cholesterol_unit")
    private String cholesterolUnit;
    @JsonProperty("salt")
    private Float salt;
    @JsonProperty("energy-kcal_unit")
    private String energyKcalUnit;
    @JsonProperty("trans-fat_unit")
    private String transFatUnit;
    @JsonProperty("fat")
    private Float fat;
    @JsonProperty("salt_100g")
    private Float salt100g;
    @JsonProperty("proteins_unit")
    private String proteinsUnit;
    @JsonProperty("fat_value")
    private Float fatValue;
    @JsonProperty("proteins_100g")
    private Float proteins100g;
    @JsonProperty("vitamin-c_serving")
    private Long vitaminCServing;
    @JsonProperty("nutrition-score-fr")
    private Long nutritionScoreFr;
    @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    private Long fruitsVegetablesNutsEstimateFromIngredients100g;
    @JsonProperty("sodium_serving")
    private Float sodiumServing;
    @JsonProperty("vitamin-c_100g")
    private Long vitaminC100g;
    @JsonProperty("vitamin-a_unit")
    private String vitaminAUnit;
    @JsonProperty("saturated-fat_serving")
    private Float saturatedFatServing;
    @JsonProperty("calcium")
    private Float calcium;
    @JsonProperty("vitamin-a_value")
    private Long vitaminAValue;
    @JsonProperty("sugars_value")
    private Float sugarsValue;
    @JsonProperty("salt_value")
    private Long saltValue;
    @JsonProperty("calcium_100g")
    private Float calcium100g;
    @JsonProperty("fiber_unit")
    private String fiberUnit;
    @JsonProperty("fat_serving")
    private Long fatServing;
    @JsonProperty("iron_100g")
    private Float iron100g;
    @JsonProperty("calcium_unit")
    private String calciumUnit;
    @JsonProperty("sodium_value")
    private Long sodiumValue;
    @JsonProperty("salt_unit")
    private String saltUnit;
    @JsonProperty("carbohydrates_serving")
    private Long carbohydratesServing;
    @JsonProperty("energy")
    private Long energy;
    @JsonProperty("sugars_serving")
    private Long sugarsServing;
    @JsonProperty("sodium_unit")
    private String sodiumUnit;
    @JsonProperty("cholesterol_value")
    private Long cholesterolValue;
    @JsonProperty("sugars")
    private Float sugars;
    @JsonProperty("energy-kcal")
    private Long energyKcal;
    @JsonProperty("trans-fat_serving")
    private Long transFatServing;
    @JsonProperty("calcium_serving")
    private Float calciumServing;
    @JsonProperty("carbohydrates_value")
    private Float carbohydratesValue;
    @JsonProperty("energy_value")
    private Long energyValue;
    @JsonProperty("vitamin-c_value")
    private Long vitaminCValue;
    @JsonProperty("sugars_100g")
    private Float sugars100g;
    @JsonProperty("nova-group_serving")
    private Long novaGroupServing;
    @JsonProperty("nova-group_100g")
    private Long novaGroup100g;
    @JsonProperty("iron_value")
    private Float ironValue;
    @JsonProperty("energy-kcal_value")
    private Long energyKcalValue;
    @JsonProperty("trans-fat")
    private Long transFat;
    @JsonProperty("carbohydrates_100g")
    private Float carbohydrates100g;
    @JsonProperty("proteins_serving")
    private Long proteinsServing;
    @JsonProperty("saturated-fat_unit")
    private String saturatedFatUnit;
    @JsonProperty("sugars_unit")
    private String sugarsUnit;
    @JsonProperty("energy-kcal_serving")
    private Long energyKcalServing;
    @JsonProperty("proteins_value")
    private Float proteinsValue;
    @JsonProperty("salt_serving")
    private Float saltServing;
    @JsonProperty("cholesterol")
    private Long cholesterol;
    private final static long serialVersionUID = -7286813819656379288L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Nutriments() {
    }

    /**
     * 
     * @param sodiumUnit
     * @param vitaminCValue
     * @param sodium100g
     * @param calciumUnit
     * @param calcium100g
     * @param fatServing
     * @param fatValue
     * @param vitaminC100g
     * @param transFat
     * @param saturatedFatValue
     * @param energyServing
     * @param energyKcalUnit
     * @param carbohydrates100g
     * @param carbohydratesUnit
     * @param fruitsVegetablesNutsEstimateFromIngredients100g
     * @param fat100g
     * @param proteinsUnit
     * @param transFatServing
     * @param vitaminAUnit
     * @param fat
     * @param cholesterol
     * @param fiberUnit
     * @param sugars100g
     * @param carbohydratesServing
     * @param energy
     * @param carbohydrates
     * @param vitaminCServing
     * @param sugarsValue
     * @param fiber
     * @param sugars
     * @param vitaminC
     * @param vitaminAServing
     * @param saturatedFat100g
     * @param saltServing
     * @param proteins100g
     * @param fiberValue
     * @param saturatedFatServing
     * @param iron100g
     * @param calciumServing
     * @param cholesterolServing
     * @param sodium
     * @param novaGroupServing
     * @param vitaminA100g
     * @param saltValue
     * @param transFatValue
     * @param vitaminA
     * @param sugarsUnit
     * @param ironValue
     * @param saltUnit
     * @param salt100g
     * @param carbohydratesValue
     * @param novaGroup100g
     * @param transFat100g
     * @param transFatUnit
     * @param calciumValue
     * @param sugarsServing
     * @param ironServing
     * @param proteinsValue
     * @param vitaminAValue
     * @param proteins
     * @param energyValue
     * @param energy100g
     * @param cholesterolUnit
     * @param salt
     * @param calcium
     * @param cholesterol100g
     * @param energyKcalServing
     * @param energyKcal
     * @param cholesterolValue
     * @param sodiumServing
     * @param proteinsServing
     * @param ironUnit
     * @param saturatedFat
     * @param fatUnit
     * @param energyKcal100g
     * @param energyKcalValue
     * @param fiberServing
     * @param nutritionScoreFr100g
     * @param vitaminCUnit
     * @param sodiumValue
     * @param nutritionScoreFr
     * @param saturatedFatUnit
     * @param iron
     * @param fiber100g
     * @param energyUnit
     * @param novaGroup
     */
    public Nutriments(String energyUnit, Float saturatedFat100g, Float fat100g, Long nutritionScoreFr100g, Float vitaminA100g, Long vitaminC, Float sodium100g, Float saturatedFat, Float vitaminAServing, Long calciumValue, Float fiber100g, Float proteins, Long novaGroup, String fatUnit, Float ironServing, Float saturatedFatValue, Float carbohydrates, Long cholesterol100g, String carbohydratesUnit, Float iron, Long transFatValue, Float fiberServing, Float fiberValue, Long energyServing, String vitaminCUnit, Long energyKcal100g, Float vitaminA, String ironUnit, Float sodium, Long energy100g, Float fiber, Long transFat100g, Long cholesterolServing, String cholesterolUnit, Float salt, String energyKcalUnit, String transFatUnit, Float fat, Float salt100g, String proteinsUnit, Float fatValue, Float proteins100g, Long vitaminCServing, Long nutritionScoreFr, Long fruitsVegetablesNutsEstimateFromIngredients100g, Float sodiumServing, Long vitaminC100g, String vitaminAUnit, Float saturatedFatServing, Float calcium, Long vitaminAValue, Float sugarsValue, Long saltValue, Float calcium100g, String fiberUnit, Long fatServing, Float iron100g, String calciumUnit, Long sodiumValue, String saltUnit, Long carbohydratesServing, Long energy, Long sugarsServing, String sodiumUnit, Long cholesterolValue, Float sugars, Long energyKcal, Long transFatServing, Float calciumServing, Float carbohydratesValue, Long energyValue, Long vitaminCValue, Float sugars100g, Long novaGroupServing, Long novaGroup100g, Float ironValue, Long energyKcalValue, Long transFat, Float carbohydrates100g, Long proteinsServing, String saturatedFatUnit, String sugarsUnit, Long energyKcalServing, Float proteinsValue, Float saltServing, Long cholesterol) {
        super();
        this.energyUnit = energyUnit;
        this.saturatedFat100g = saturatedFat100g;
        this.fat100g = fat100g;
        this.nutritionScoreFr100g = nutritionScoreFr100g;
        this.vitaminA100g = vitaminA100g;
        this.vitaminC = vitaminC;
        this.sodium100g = sodium100g;
        this.saturatedFat = saturatedFat;
        this.vitaminAServing = vitaminAServing;
        this.calciumValue = calciumValue;
        this.fiber100g = fiber100g;
        this.proteins = proteins;
        this.novaGroup = novaGroup;
        this.fatUnit = fatUnit;
        this.ironServing = ironServing;
        this.saturatedFatValue = saturatedFatValue;
        this.carbohydrates = carbohydrates;
        this.cholesterol100g = cholesterol100g;
        this.carbohydratesUnit = carbohydratesUnit;
        this.iron = iron;
        this.transFatValue = transFatValue;
        this.fiberServing = fiberServing;
        this.fiberValue = fiberValue;
        this.energyServing = energyServing;
        this.vitaminCUnit = vitaminCUnit;
        this.energyKcal100g = energyKcal100g;
        this.vitaminA = vitaminA;
        this.ironUnit = ironUnit;
        this.sodium = sodium;
        this.energy100g = energy100g;
        this.fiber = fiber;
        this.transFat100g = transFat100g;
        this.cholesterolServing = cholesterolServing;
        this.cholesterolUnit = cholesterolUnit;
        this.salt = salt;
        this.energyKcalUnit = energyKcalUnit;
        this.transFatUnit = transFatUnit;
        this.fat = fat;
        this.salt100g = salt100g;
        this.proteinsUnit = proteinsUnit;
        this.fatValue = fatValue;
        this.proteins100g = proteins100g;
        this.vitaminCServing = vitaminCServing;
        this.nutritionScoreFr = nutritionScoreFr;
        this.fruitsVegetablesNutsEstimateFromIngredients100g = fruitsVegetablesNutsEstimateFromIngredients100g;
        this.sodiumServing = sodiumServing;
        this.vitaminC100g = vitaminC100g;
        this.vitaminAUnit = vitaminAUnit;
        this.saturatedFatServing = saturatedFatServing;
        this.calcium = calcium;
        this.vitaminAValue = vitaminAValue;
        this.sugarsValue = sugarsValue;
        this.saltValue = saltValue;
        this.calcium100g = calcium100g;
        this.fiberUnit = fiberUnit;
        this.fatServing = fatServing;
        this.iron100g = iron100g;
        this.calciumUnit = calciumUnit;
        this.sodiumValue = sodiumValue;
        this.saltUnit = saltUnit;
        this.carbohydratesServing = carbohydratesServing;
        this.energy = energy;
        this.sugarsServing = sugarsServing;
        this.sodiumUnit = sodiumUnit;
        this.cholesterolValue = cholesterolValue;
        this.sugars = sugars;
        this.energyKcal = energyKcal;
        this.transFatServing = transFatServing;
        this.calciumServing = calciumServing;
        this.carbohydratesValue = carbohydratesValue;
        this.energyValue = energyValue;
        this.vitaminCValue = vitaminCValue;
        this.sugars100g = sugars100g;
        this.novaGroupServing = novaGroupServing;
        this.novaGroup100g = novaGroup100g;
        this.ironValue = ironValue;
        this.energyKcalValue = energyKcalValue;
        this.transFat = transFat;
        this.carbohydrates100g = carbohydrates100g;
        this.proteinsServing = proteinsServing;
        this.saturatedFatUnit = saturatedFatUnit;
        this.sugarsUnit = sugarsUnit;
        this.energyKcalServing = energyKcalServing;
        this.proteinsValue = proteinsValue;
        this.saltServing = saltServing;
        this.cholesterol = cholesterol;
    }

    @JsonProperty("energy_unit")
    public String getEnergyUnit() {
        return energyUnit;
    }

    @JsonProperty("energy_unit")
    public void setEnergyUnit(String energyUnit) {
        this.energyUnit = energyUnit;
    }

    @JsonProperty("saturated-fat_100g")
    public Float getSaturatedFat100g() {
        return saturatedFat100g;
    }

    @JsonProperty("saturated-fat_100g")
    public void setSaturatedFat100g(Float saturatedFat100g) {
        this.saturatedFat100g = saturatedFat100g;
    }

    @JsonProperty("fat_100g")
    public Float getFat100g() {
        return fat100g;
    }

    @JsonProperty("fat_100g")
    public void setFat100g(Float fat100g) {
        this.fat100g = fat100g;
    }

    @JsonProperty("nutrition-score-fr_100g")
    public Long getNutritionScoreFr100g() {
        return nutritionScoreFr100g;
    }

    @JsonProperty("nutrition-score-fr_100g")
    public void setNutritionScoreFr100g(Long nutritionScoreFr100g) {
        this.nutritionScoreFr100g = nutritionScoreFr100g;
    }

    @JsonProperty("vitamin-a_100g")
    public Float getVitaminA100g() {
        return vitaminA100g;
    }

    @JsonProperty("vitamin-a_100g")
    public void setVitaminA100g(Float vitaminA100g) {
        this.vitaminA100g = vitaminA100g;
    }

    @JsonProperty("vitamin-c")
    public Long getVitaminC() {
        return vitaminC;
    }

    @JsonProperty("vitamin-c")
    public void setVitaminC(Long vitaminC) {
        this.vitaminC = vitaminC;
    }

    @JsonProperty("sodium_100g")
    public Float getSodium100g() {
        return sodium100g;
    }

    @JsonProperty("sodium_100g")
    public void setSodium100g(Float sodium100g) {
        this.sodium100g = sodium100g;
    }

    @JsonProperty("saturated-fat")
    public Float getSaturatedFat() {
        return saturatedFat;
    }

    @JsonProperty("saturated-fat")
    public void setSaturatedFat(Float saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    @JsonProperty("vitamin-a_serving")
    public Float getVitaminAServing() {
        return vitaminAServing;
    }

    @JsonProperty("vitamin-a_serving")
    public void setVitaminAServing(Float vitaminAServing) {
        this.vitaminAServing = vitaminAServing;
    }

    @JsonProperty("calcium_value")
    public Long getCalciumValue() {
        return calciumValue;
    }

    @JsonProperty("calcium_value")
    public void setCalciumValue(Long calciumValue) {
        this.calciumValue = calciumValue;
    }

    @JsonProperty("fiber_100g")
    public Float getFiber100g() {
        return fiber100g;
    }

    @JsonProperty("fiber_100g")
    public void setFiber100g(Float fiber100g) {
        this.fiber100g = fiber100g;
    }

    @JsonProperty("proteins")
    public Float getProteins() {
        return proteins;
    }

    @JsonProperty("proteins")
    public void setProteins(Float proteins) {
        this.proteins = proteins;
    }

    @JsonProperty("nova-group")
    public Long getNovaGroup() {
        return novaGroup;
    }

    @JsonProperty("nova-group")
    public void setNovaGroup(Long novaGroup) {
        this.novaGroup = novaGroup;
    }

    @JsonProperty("fat_unit")
    public String getFatUnit() {
        return fatUnit;
    }

    @JsonProperty("fat_unit")
    public void setFatUnit(String fatUnit) {
        this.fatUnit = fatUnit;
    }

    @JsonProperty("iron_serving")
    public Float getIronServing() {
        return ironServing;
    }

    @JsonProperty("iron_serving")
    public void setIronServing(Float ironServing) {
        this.ironServing = ironServing;
    }

    @JsonProperty("saturated-fat_value")
    public Float getSaturatedFatValue() {
        return saturatedFatValue;
    }

    @JsonProperty("saturated-fat_value")
    public void setSaturatedFatValue(Float saturatedFatValue) {
        this.saturatedFatValue = saturatedFatValue;
    }

    @JsonProperty("carbohydrates")
    public Float getCarbohydrates() {
        return carbohydrates;
    }

    @JsonProperty("carbohydrates")
    public void setCarbohydrates(Float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    @JsonProperty("cholesterol_100g")
    public Long getCholesterol100g() {
        return cholesterol100g;
    }

    @JsonProperty("cholesterol_100g")
    public void setCholesterol100g(Long cholesterol100g) {
        this.cholesterol100g = cholesterol100g;
    }

    @JsonProperty("carbohydrates_unit")
    public String getCarbohydratesUnit() {
        return carbohydratesUnit;
    }

    @JsonProperty("carbohydrates_unit")
    public void setCarbohydratesUnit(String carbohydratesUnit) {
        this.carbohydratesUnit = carbohydratesUnit;
    }

    @JsonProperty("iron")
    public Float getIron() {
        return iron;
    }

    @JsonProperty("iron")
    public void setIron(Float iron) {
        this.iron = iron;
    }

    @JsonProperty("trans-fat_value")
    public Long getTransFatValue() {
        return transFatValue;
    }

    @JsonProperty("trans-fat_value")
    public void setTransFatValue(Long transFatValue) {
        this.transFatValue = transFatValue;
    }

    @JsonProperty("fiber_serving")
    public Float getFiberServing() {
        return fiberServing;
    }

    @JsonProperty("fiber_serving")
    public void setFiberServing(Float fiberServing) {
        this.fiberServing = fiberServing;
    }

    @JsonProperty("fiber_value")
    public Float getFiberValue() {
        return fiberValue;
    }

    @JsonProperty("fiber_value")
    public void setFiberValue(Float fiberValue) {
        this.fiberValue = fiberValue;
    }

    @JsonProperty("energy_serving")
    public Long getEnergyServing() {
        return energyServing;
    }

    @JsonProperty("energy_serving")
    public void setEnergyServing(Long energyServing) {
        this.energyServing = energyServing;
    }

    @JsonProperty("vitamin-c_unit")
    public String getVitaminCUnit() {
        return vitaminCUnit;
    }

    @JsonProperty("vitamin-c_unit")
    public void setVitaminCUnit(String vitaminCUnit) {
        this.vitaminCUnit = vitaminCUnit;
    }

    @JsonProperty("energy-kcal_100g")
    public Long getEnergyKcal100g() {
        return energyKcal100g;
    }

    @JsonProperty("energy-kcal_100g")
    public void setEnergyKcal100g(Long energyKcal100g) {
        this.energyKcal100g = energyKcal100g;
    }

    @JsonProperty("vitamin-a")
    public Float getVitaminA() {
        return vitaminA;
    }

    @JsonProperty("vitamin-a")
    public void setVitaminA(Float vitaminA) {
        this.vitaminA = vitaminA;
    }

    @JsonProperty("iron_unit")
    public String getIronUnit() {
        return ironUnit;
    }

    @JsonProperty("iron_unit")
    public void setIronUnit(String ironUnit) {
        this.ironUnit = ironUnit;
    }

    @JsonProperty("sodium")
    public Float getSodium() {
        return sodium;
    }

    @JsonProperty("sodium")
    public void setSodium(Float sodium) {
        this.sodium = sodium;
    }

    @JsonProperty("energy_100g")
    public Long getEnergy100g() {
        return energy100g;
    }

    @JsonProperty("energy_100g")
    public void setEnergy100g(Long energy100g) {
        this.energy100g = energy100g;
    }

    @JsonProperty("fiber")
    public Float getFiber() {
        return fiber;
    }

    @JsonProperty("fiber")
    public void setFiber(Float fiber) {
        this.fiber = fiber;
    }

    @JsonProperty("trans-fat_100g")
    public Long getTransFat100g() {
        return transFat100g;
    }

    @JsonProperty("trans-fat_100g")
    public void setTransFat100g(Long transFat100g) {
        this.transFat100g = transFat100g;
    }

    @JsonProperty("cholesterol_serving")
    public Long getCholesterolServing() {
        return cholesterolServing;
    }

    @JsonProperty("cholesterol_serving")
    public void setCholesterolServing(Long cholesterolServing) {
        this.cholesterolServing = cholesterolServing;
    }

    @JsonProperty("cholesterol_unit")
    public String getCholesterolUnit() {
        return cholesterolUnit;
    }

    @JsonProperty("cholesterol_unit")
    public void setCholesterolUnit(String cholesterolUnit) {
        this.cholesterolUnit = cholesterolUnit;
    }

    @JsonProperty("salt")
    public Float getSalt() {
        return salt;
    }

    @JsonProperty("salt")
    public void setSalt(Float salt) {
        this.salt = salt;
    }

    @JsonProperty("energy-kcal_unit")
    public String getEnergyKcalUnit() {
        return energyKcalUnit;
    }

    @JsonProperty("energy-kcal_unit")
    public void setEnergyKcalUnit(String energyKcalUnit) {
        this.energyKcalUnit = energyKcalUnit;
    }

    @JsonProperty("trans-fat_unit")
    public String getTransFatUnit() {
        return transFatUnit;
    }

    @JsonProperty("trans-fat_unit")
    public void setTransFatUnit(String transFatUnit) {
        this.transFatUnit = transFatUnit;
    }

    @JsonProperty("fat")
    public Float getFat() {
        return fat;
    }

    @JsonProperty("fat")
    public void setFat(Float fat) {
        this.fat = fat;
    }

    @JsonProperty("salt_100g")
    public Float getSalt100g() {
        return salt100g;
    }

    @JsonProperty("salt_100g")
    public void setSalt100g(Float salt100g) {
        this.salt100g = salt100g;
    }

    @JsonProperty("proteins_unit")
    public String getProteinsUnit() {
        return proteinsUnit;
    }

    @JsonProperty("proteins_unit")
    public void setProteinsUnit(String proteinsUnit) {
        this.proteinsUnit = proteinsUnit;
    }

    @JsonProperty("fat_value")
    public Float getFatValue() {
        return fatValue;
    }

    @JsonProperty("fat_value")
    public void setFatValue(Float fatValue) {
        this.fatValue = fatValue;
    }

    @JsonProperty("proteins_100g")
    public Float getProteins100g() {
        return proteins100g;
    }

    @JsonProperty("proteins_100g")
    public void setProteins100g(Float proteins100g) {
        this.proteins100g = proteins100g;
    }

    @JsonProperty("vitamin-c_serving")
    public Long getVitaminCServing() {
        return vitaminCServing;
    }

    @JsonProperty("vitamin-c_serving")
    public void setVitaminCServing(Long vitaminCServing) {
        this.vitaminCServing = vitaminCServing;
    }

    @JsonProperty("nutrition-score-fr")
    public Long getNutritionScoreFr() {
        return nutritionScoreFr;
    }

    @JsonProperty("nutrition-score-fr")
    public void setNutritionScoreFr(Long nutritionScoreFr) {
        this.nutritionScoreFr = nutritionScoreFr;
    }

    @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    public Long getFruitsVegetablesNutsEstimateFromIngredients100g() {
        return fruitsVegetablesNutsEstimateFromIngredients100g;
    }

    @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    public void setFruitsVegetablesNutsEstimateFromIngredients100g(Long fruitsVegetablesNutsEstimateFromIngredients100g) {
        this.fruitsVegetablesNutsEstimateFromIngredients100g = fruitsVegetablesNutsEstimateFromIngredients100g;
    }

    @JsonProperty("sodium_serving")
    public Float getSodiumServing() {
        return sodiumServing;
    }

    @JsonProperty("sodium_serving")
    public void setSodiumServing(Float sodiumServing) {
        this.sodiumServing = sodiumServing;
    }

    @JsonProperty("vitamin-c_100g")
    public Long getVitaminC100g() {
        return vitaminC100g;
    }

    @JsonProperty("vitamin-c_100g")
    public void setVitaminC100g(Long vitaminC100g) {
        this.vitaminC100g = vitaminC100g;
    }

    @JsonProperty("vitamin-a_unit")
    public String getVitaminAUnit() {
        return vitaminAUnit;
    }

    @JsonProperty("vitamin-a_unit")
    public void setVitaminAUnit(String vitaminAUnit) {
        this.vitaminAUnit = vitaminAUnit;
    }

    @JsonProperty("saturated-fat_serving")
    public Float getSaturatedFatServing() {
        return saturatedFatServing;
    }

    @JsonProperty("saturated-fat_serving")
    public void setSaturatedFatServing(Float saturatedFatServing) {
        this.saturatedFatServing = saturatedFatServing;
    }

    @JsonProperty("calcium")
    public Float getCalcium() {
        return calcium;
    }

    @JsonProperty("calcium")
    public void setCalcium(Float calcium) {
        this.calcium = calcium;
    }

    @JsonProperty("vitamin-a_value")
    public Long getVitaminAValue() {
        return vitaminAValue;
    }

    @JsonProperty("vitamin-a_value")
    public void setVitaminAValue(Long vitaminAValue) {
        this.vitaminAValue = vitaminAValue;
    }

    @JsonProperty("sugars_value")
    public Float getSugarsValue() {
        return sugarsValue;
    }

    @JsonProperty("sugars_value")
    public void setSugarsValue(Float sugarsValue) {
        this.sugarsValue = sugarsValue;
    }

    @JsonProperty("salt_value")
    public Long getSaltValue() {
        return saltValue;
    }

    @JsonProperty("salt_value")
    public void setSaltValue(Long saltValue) {
        this.saltValue = saltValue;
    }

    @JsonProperty("calcium_100g")
    public Float getCalcium100g() {
        return calcium100g;
    }

    @JsonProperty("calcium_100g")
    public void setCalcium100g(Float calcium100g) {
        this.calcium100g = calcium100g;
    }

    @JsonProperty("fiber_unit")
    public String getFiberUnit() {
        return fiberUnit;
    }

    @JsonProperty("fiber_unit")
    public void setFiberUnit(String fiberUnit) {
        this.fiberUnit = fiberUnit;
    }

    @JsonProperty("fat_serving")
    public Long getFatServing() {
        return fatServing;
    }

    @JsonProperty("fat_serving")
    public void setFatServing(Long fatServing) {
        this.fatServing = fatServing;
    }

    @JsonProperty("iron_100g")
    public Float getIron100g() {
        return iron100g;
    }

    @JsonProperty("iron_100g")
    public void setIron100g(Float iron100g) {
        this.iron100g = iron100g;
    }

    @JsonProperty("calcium_unit")
    public String getCalciumUnit() {
        return calciumUnit;
    }

    @JsonProperty("calcium_unit")
    public void setCalciumUnit(String calciumUnit) {
        this.calciumUnit = calciumUnit;
    }

    @JsonProperty("sodium_value")
    public Long getSodiumValue() {
        return sodiumValue;
    }

    @JsonProperty("sodium_value")
    public void setSodiumValue(Long sodiumValue) {
        this.sodiumValue = sodiumValue;
    }

    @JsonProperty("salt_unit")
    public String getSaltUnit() {
        return saltUnit;
    }

    @JsonProperty("salt_unit")
    public void setSaltUnit(String saltUnit) {
        this.saltUnit = saltUnit;
    }

    @JsonProperty("carbohydrates_serving")
    public Long getCarbohydratesServing() {
        return carbohydratesServing;
    }

    @JsonProperty("carbohydrates_serving")
    public void setCarbohydratesServing(Long carbohydratesServing) {
        this.carbohydratesServing = carbohydratesServing;
    }

    @JsonProperty("energy")
    public Long getEnergy() {
        return energy;
    }

    @JsonProperty("energy")
    public void setEnergy(Long energy) {
        this.energy = energy;
    }

    @JsonProperty("sugars_serving")
    public Long getSugarsServing() {
        return sugarsServing;
    }

    @JsonProperty("sugars_serving")
    public void setSugarsServing(Long sugarsServing) {
        this.sugarsServing = sugarsServing;
    }

    @JsonProperty("sodium_unit")
    public String getSodiumUnit() {
        return sodiumUnit;
    }

    @JsonProperty("sodium_unit")
    public void setSodiumUnit(String sodiumUnit) {
        this.sodiumUnit = sodiumUnit;
    }

    @JsonProperty("cholesterol_value")
    public Long getCholesterolValue() {
        return cholesterolValue;
    }

    @JsonProperty("cholesterol_value")
    public void setCholesterolValue(Long cholesterolValue) {
        this.cholesterolValue = cholesterolValue;
    }

    @JsonProperty("sugars")
    public Float getSugars() {
        return sugars;
    }

    @JsonProperty("sugars")
    public void setSugars(Float sugars) {
        this.sugars = sugars;
    }

    @JsonProperty("energy-kcal")
    public Long getEnergyKcal() {
        return energyKcal;
    }

    @JsonProperty("energy-kcal")
    public void setEnergyKcal(Long energyKcal) {
        this.energyKcal = energyKcal;
    }

    @JsonProperty("trans-fat_serving")
    public Long getTransFatServing() {
        return transFatServing;
    }

    @JsonProperty("trans-fat_serving")
    public void setTransFatServing(Long transFatServing) {
        this.transFatServing = transFatServing;
    }

    @JsonProperty("calcium_serving")
    public Float getCalciumServing() {
        return calciumServing;
    }

    @JsonProperty("calcium_serving")
    public void setCalciumServing(Float calciumServing) {
        this.calciumServing = calciumServing;
    }

    @JsonProperty("carbohydrates_value")
    public Float getCarbohydratesValue() {
        return carbohydratesValue;
    }

    @JsonProperty("carbohydrates_value")
    public void setCarbohydratesValue(Float carbohydratesValue) {
        this.carbohydratesValue = carbohydratesValue;
    }

    @JsonProperty("energy_value")
    public Long getEnergyValue() {
        return energyValue;
    }

    @JsonProperty("energy_value")
    public void setEnergyValue(Long energyValue) {
        this.energyValue = energyValue;
    }

    @JsonProperty("vitamin-c_value")
    public Long getVitaminCValue() {
        return vitaminCValue;
    }

    @JsonProperty("vitamin-c_value")
    public void setVitaminCValue(Long vitaminCValue) {
        this.vitaminCValue = vitaminCValue;
    }

    @JsonProperty("sugars_100g")
    public Float getSugars100g() {
        return sugars100g;
    }

    @JsonProperty("sugars_100g")
    public void setSugars100g(Float sugars100g) {
        this.sugars100g = sugars100g;
    }

    @JsonProperty("nova-group_serving")
    public Long getNovaGroupServing() {
        return novaGroupServing;
    }

    @JsonProperty("nova-group_serving")
    public void setNovaGroupServing(Long novaGroupServing) {
        this.novaGroupServing = novaGroupServing;
    }

    @JsonProperty("nova-group_100g")
    public Long getNovaGroup100g() {
        return novaGroup100g;
    }

    @JsonProperty("nova-group_100g")
    public void setNovaGroup100g(Long novaGroup100g) {
        this.novaGroup100g = novaGroup100g;
    }

    @JsonProperty("iron_value")
    public Float getIronValue() {
        return ironValue;
    }

    @JsonProperty("iron_value")
    public void setIronValue(Float ironValue) {
        this.ironValue = ironValue;
    }

    @JsonProperty("energy-kcal_value")
    public Long getEnergyKcalValue() {
        return energyKcalValue;
    }

    @JsonProperty("energy-kcal_value")
    public void setEnergyKcalValue(Long energyKcalValue) {
        this.energyKcalValue = energyKcalValue;
    }

    @JsonProperty("trans-fat")
    public Long getTransFat() {
        return transFat;
    }

    @JsonProperty("trans-fat")
    public void setTransFat(Long transFat) {
        this.transFat = transFat;
    }

    @JsonProperty("carbohydrates_100g")
    public Float getCarbohydrates100g() {
        return carbohydrates100g;
    }

    @JsonProperty("carbohydrates_100g")
    public void setCarbohydrates100g(Float carbohydrates100g) {
        this.carbohydrates100g = carbohydrates100g;
    }

    @JsonProperty("proteins_serving")
    public Long getProteinsServing() {
        return proteinsServing;
    }

    @JsonProperty("proteins_serving")
    public void setProteinsServing(Long proteinsServing) {
        this.proteinsServing = proteinsServing;
    }

    @JsonProperty("saturated-fat_unit")
    public String getSaturatedFatUnit() {
        return saturatedFatUnit;
    }

    @JsonProperty("saturated-fat_unit")
    public void setSaturatedFatUnit(String saturatedFatUnit) {
        this.saturatedFatUnit = saturatedFatUnit;
    }

    @JsonProperty("sugars_unit")
    public String getSugarsUnit() {
        return sugarsUnit;
    }

    @JsonProperty("sugars_unit")
    public void setSugarsUnit(String sugarsUnit) {
        this.sugarsUnit = sugarsUnit;
    }

    @JsonProperty("energy-kcal_serving")
    public Long getEnergyKcalServing() {
        return energyKcalServing;
    }

    @JsonProperty("energy-kcal_serving")
    public void setEnergyKcalServing(Long energyKcalServing) {
        this.energyKcalServing = energyKcalServing;
    }

    @JsonProperty("proteins_value")
    public Float getProteinsValue() {
        return proteinsValue;
    }

    @JsonProperty("proteins_value")
    public void setProteinsValue(Float proteinsValue) {
        this.proteinsValue = proteinsValue;
    }

    @JsonProperty("salt_serving")
    public Float getSaltServing() {
        return saltServing;
    }

    @JsonProperty("salt_serving")
    public void setSaltServing(Float saltServing) {
        this.saltServing = saltServing;
    }

    @JsonProperty("cholesterol")
    public Long getCholesterol() {
        return cholesterol;
    }

    @JsonProperty("cholesterol")
    public void setCholesterol(Long cholesterol) {
        this.cholesterol = cholesterol;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("energyUnit", energyUnit).append("saturatedFat100g", saturatedFat100g).append("fat100g", fat100g).append("nutritionScoreFr100g", nutritionScoreFr100g).append("vitaminA100g", vitaminA100g).append("vitaminC", vitaminC).append("sodium100g", sodium100g).append("saturatedFat", saturatedFat).append("vitaminAServing", vitaminAServing).append("calciumValue", calciumValue).append("fiber100g", fiber100g).append("proteins", proteins).append("novaGroup", novaGroup).append("fatUnit", fatUnit).append("ironServing", ironServing).append("saturatedFatValue", saturatedFatValue).append("carbohydrates", carbohydrates).append("cholesterol100g", cholesterol100g).append("carbohydratesUnit", carbohydratesUnit).append("iron", iron).append("transFatValue", transFatValue).append("fiberServing", fiberServing).append("fiberValue", fiberValue).append("energyServing", energyServing).append("vitaminCUnit", vitaminCUnit).append("energyKcal100g", energyKcal100g).append("vitaminA", vitaminA).append("ironUnit", ironUnit).append("sodium", sodium).append("energy100g", energy100g).append("fiber", fiber).append("transFat100g", transFat100g).append("cholesterolServing", cholesterolServing).append("cholesterolUnit", cholesterolUnit).append("salt", salt).append("energyKcalUnit", energyKcalUnit).append("transFatUnit", transFatUnit).append("fat", fat).append("salt100g", salt100g).append("proteinsUnit", proteinsUnit).append("fatValue", fatValue).append("proteins100g", proteins100g).append("vitaminCServing", vitaminCServing).append("nutritionScoreFr", nutritionScoreFr).append("fruitsVegetablesNutsEstimateFromIngredients100g", fruitsVegetablesNutsEstimateFromIngredients100g).append("sodiumServing", sodiumServing).append("vitaminC100g", vitaminC100g).append("vitaminAUnit", vitaminAUnit).append("saturatedFatServing", saturatedFatServing).append("calcium", calcium).append("vitaminAValue", vitaminAValue).append("sugarsValue", sugarsValue).append("saltValue", saltValue).append("calcium100g", calcium100g).append("fiberUnit", fiberUnit).append("fatServing", fatServing).append("iron100g", iron100g).append("calciumUnit", calciumUnit).append("sodiumValue", sodiumValue).append("saltUnit", saltUnit).append("carbohydratesServing", carbohydratesServing).append("energy", energy).append("sugarsServing", sugarsServing).append("sodiumUnit", sodiumUnit).append("cholesterolValue", cholesterolValue).append("sugars", sugars).append("energyKcal", energyKcal).append("transFatServing", transFatServing).append("calciumServing", calciumServing).append("carbohydratesValue", carbohydratesValue).append("energyValue", energyValue).append("vitaminCValue", vitaminCValue).append("sugars100g", sugars100g).append("novaGroupServing", novaGroupServing).append("novaGroup100g", novaGroup100g).append("ironValue", ironValue).append("energyKcalValue", energyKcalValue).append("transFat", transFat).append("carbohydrates100g", carbohydrates100g).append("proteinsServing", proteinsServing).append("saturatedFatUnit", saturatedFatUnit).append("sugarsUnit", sugarsUnit).append("energyKcalServing", energyKcalServing).append("proteinsValue", proteinsValue).append("saltServing", saltServing).append("cholesterol", cholesterol).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sodiumUnit).append(vitaminCValue).append(sodium100g).append(calciumUnit).append(calcium100g).append(fatServing).append(fatValue).append(vitaminC100g).append(transFat).append(saturatedFatValue).append(energyServing).append(energyKcalUnit).append(carbohydrates100g).append(carbohydratesUnit).append(fruitsVegetablesNutsEstimateFromIngredients100g).append(fat100g).append(proteinsUnit).append(transFatServing).append(vitaminAUnit).append(fat).append(cholesterol).append(fiberUnit).append(sugars100g).append(carbohydratesServing).append(energy).append(carbohydrates).append(vitaminCServing).append(sugarsValue).append(fiber).append(sugars).append(vitaminC).append(vitaminAServing).append(saturatedFat100g).append(saltServing).append(proteins100g).append(fiberValue).append(saturatedFatServing).append(iron100g).append(calciumServing).append(cholesterolServing).append(sodium).append(novaGroupServing).append(vitaminA100g).append(saltValue).append(transFatValue).append(vitaminA).append(sugarsUnit).append(ironValue).append(saltUnit).append(salt100g).append(carbohydratesValue).append(novaGroup100g).append(transFat100g).append(transFatUnit).append(calciumValue).append(sugarsServing).append(ironServing).append(proteinsValue).append(vitaminAValue).append(proteins).append(energyValue).append(energy100g).append(cholesterolUnit).append(salt).append(calcium).append(cholesterol100g).append(energyKcalServing).append(energyKcal).append(cholesterolValue).append(sodiumServing).append(proteinsServing).append(ironUnit).append(saturatedFat).append(fatUnit).append(energyKcal100g).append(energyKcalValue).append(fiberServing).append(nutritionScoreFr100g).append(vitaminCUnit).append(sodiumValue).append(nutritionScoreFr).append(saturatedFatUnit).append(iron).append(fiber100g).append(energyUnit).append(novaGroup).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nutriments) == false) {
            return false;
        }
        Nutriments rhs = ((Nutriments) other);
        return new EqualsBuilder().append(sodiumUnit, rhs.sodiumUnit).append(vitaminCValue, rhs.vitaminCValue).append(sodium100g, rhs.sodium100g).append(calciumUnit, rhs.calciumUnit).append(calcium100g, rhs.calcium100g).append(fatServing, rhs.fatServing).append(fatValue, rhs.fatValue).append(vitaminC100g, rhs.vitaminC100g).append(transFat, rhs.transFat).append(saturatedFatValue, rhs.saturatedFatValue).append(energyServing, rhs.energyServing).append(energyKcalUnit, rhs.energyKcalUnit).append(carbohydrates100g, rhs.carbohydrates100g).append(carbohydratesUnit, rhs.carbohydratesUnit).append(fruitsVegetablesNutsEstimateFromIngredients100g, rhs.fruitsVegetablesNutsEstimateFromIngredients100g).append(fat100g, rhs.fat100g).append(proteinsUnit, rhs.proteinsUnit).append(transFatServing, rhs.transFatServing).append(vitaminAUnit, rhs.vitaminAUnit).append(fat, rhs.fat).append(cholesterol, rhs.cholesterol).append(fiberUnit, rhs.fiberUnit).append(sugars100g, rhs.sugars100g).append(carbohydratesServing, rhs.carbohydratesServing).append(energy, rhs.energy).append(carbohydrates, rhs.carbohydrates).append(vitaminCServing, rhs.vitaminCServing).append(sugarsValue, rhs.sugarsValue).append(fiber, rhs.fiber).append(sugars, rhs.sugars).append(vitaminC, rhs.vitaminC).append(vitaminAServing, rhs.vitaminAServing).append(saturatedFat100g, rhs.saturatedFat100g).append(saltServing, rhs.saltServing).append(proteins100g, rhs.proteins100g).append(fiberValue, rhs.fiberValue).append(saturatedFatServing, rhs.saturatedFatServing).append(iron100g, rhs.iron100g).append(calciumServing, rhs.calciumServing).append(cholesterolServing, rhs.cholesterolServing).append(sodium, rhs.sodium).append(novaGroupServing, rhs.novaGroupServing).append(vitaminA100g, rhs.vitaminA100g).append(saltValue, rhs.saltValue).append(transFatValue, rhs.transFatValue).append(vitaminA, rhs.vitaminA).append(sugarsUnit, rhs.sugarsUnit).append(ironValue, rhs.ironValue).append(saltUnit, rhs.saltUnit).append(salt100g, rhs.salt100g).append(carbohydratesValue, rhs.carbohydratesValue).append(novaGroup100g, rhs.novaGroup100g).append(transFat100g, rhs.transFat100g).append(transFatUnit, rhs.transFatUnit).append(calciumValue, rhs.calciumValue).append(sugarsServing, rhs.sugarsServing).append(ironServing, rhs.ironServing).append(proteinsValue, rhs.proteinsValue).append(vitaminAValue, rhs.vitaminAValue).append(proteins, rhs.proteins).append(energyValue, rhs.energyValue).append(energy100g, rhs.energy100g).append(cholesterolUnit, rhs.cholesterolUnit).append(salt, rhs.salt).append(calcium, rhs.calcium).append(cholesterol100g, rhs.cholesterol100g).append(energyKcalServing, rhs.energyKcalServing).append(energyKcal, rhs.energyKcal).append(cholesterolValue, rhs.cholesterolValue).append(sodiumServing, rhs.sodiumServing).append(proteinsServing, rhs.proteinsServing).append(ironUnit, rhs.ironUnit).append(saturatedFat, rhs.saturatedFat).append(fatUnit, rhs.fatUnit).append(energyKcal100g, rhs.energyKcal100g).append(energyKcalValue, rhs.energyKcalValue).append(fiberServing, rhs.fiberServing).append(nutritionScoreFr100g, rhs.nutritionScoreFr100g).append(vitaminCUnit, rhs.vitaminCUnit).append(sodiumValue, rhs.sodiumValue).append(nutritionScoreFr, rhs.nutritionScoreFr).append(saturatedFatUnit, rhs.saturatedFatUnit).append(iron, rhs.iron).append(fiber100g, rhs.fiber100g).append(energyUnit, rhs.energyUnit).append(novaGroup, rhs.novaGroup).isEquals();
    }

}
