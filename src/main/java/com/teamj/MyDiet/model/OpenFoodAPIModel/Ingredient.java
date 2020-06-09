
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
    "text",
    "percent_max",
    "id",
    "percent_min",
    "has_sub_ingredients",
    "rank",
    "vegan",
    "vegetarian"
})
public class Ingredient implements Serializable
{

    @JsonProperty("text")
    private String text;
    @JsonProperty("percent_max")
    private Float percentMax;
    @JsonProperty("id")
    private String id;
    @JsonProperty("percent_min")
    private Long percentMin;
    @JsonProperty("has_sub_ingredients")
    private String hasSubIngredients;
    @JsonProperty("rank")
    private Long rank;
    @JsonProperty("vegan")
    private String vegan;
    @JsonProperty("vegetarian")
    private String vegetarian;
    private final static long serialVersionUID = 8880476526844197663L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ingredient() {
    }

    /**
     * 
     * @param percentMin
     * @param percentMax
     * @param hasSubIngredients
     * @param vegetarian
     * @param rank
     * @param text
     * @param id
     * @param vegan
     */
    public Ingredient(String text, Float percentMax, String id, Long percentMin, String hasSubIngredients, Long rank, String vegan, String vegetarian) {
        super();
        this.text = text;
        this.percentMax = percentMax;
        this.id = id;
        this.percentMin = percentMin;
        this.hasSubIngredients = hasSubIngredients;
        this.rank = rank;
        this.vegan = vegan;
        this.vegetarian = vegetarian;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("percent_max")
    public Float getPercentMax() {
        return percentMax;
    }

    @JsonProperty("percent_max")
    public void setPercentMax(Float percentMax) {
        this.percentMax = percentMax;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("percent_min")
    public Long getPercentMin() {
        return percentMin;
    }

    @JsonProperty("percent_min")
    public void setPercentMin(Long percentMin) {
        this.percentMin = percentMin;
    }

    @JsonProperty("has_sub_ingredients")
    public String getHasSubIngredients() {
        return hasSubIngredients;
    }

    @JsonProperty("has_sub_ingredients")
    public void setHasSubIngredients(String hasSubIngredients) {
        this.hasSubIngredients = hasSubIngredients;
    }

    @JsonProperty("rank")
    public Long getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Long rank) {
        this.rank = rank;
    }

    @JsonProperty("vegan")
    public String getVegan() {
        return vegan;
    }

    @JsonProperty("vegan")
    public void setVegan(String vegan) {
        this.vegan = vegan;
    }

    @JsonProperty("vegetarian")
    public String getVegetarian() {
        return vegetarian;
    }

    @JsonProperty("vegetarian")
    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("text", text).append("percentMax", percentMax).append("id", id).append("percentMin", percentMin).append("hasSubIngredients", hasSubIngredients).append("rank", rank).append("vegan", vegan).append("vegetarian", vegetarian).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(percentMin).append(percentMax).append(hasSubIngredients).append(vegetarian).append(rank).append(text).append(id).append(vegan).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ingredient) == false) {
            return false;
        }
        Ingredient rhs = ((Ingredient) other);
        return new EqualsBuilder().append(percentMin, rhs.percentMin).append(percentMax, rhs.percentMax).append(hasSubIngredients, rhs.hasSubIngredients).append(vegetarian, rhs.vegetarian).append(rank, rhs.rank).append(text, rhs.text).append(id, rhs.id).append(vegan, rhs.vegan).isEquals();
    }

}
