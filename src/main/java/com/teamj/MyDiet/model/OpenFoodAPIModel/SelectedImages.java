
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
    "nutrition",
    "ingredients",
    "front"
})
public class SelectedImages implements Serializable
{

    @JsonProperty("nutrition")
    private Nutrition_ nutrition;
    @JsonProperty("ingredients")
    private Ingredients_ ingredients;
    @JsonProperty("front")
    private Front_ front;
    private final static long serialVersionUID = 6348651819974836651L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SelectedImages() {
    }

    /**
     * 
     * @param nutrition
     * @param ingredients
     * @param front
     */
    public SelectedImages(Nutrition_ nutrition, Ingredients_ ingredients, Front_ front) {
        super();
        this.nutrition = nutrition;
        this.ingredients = ingredients;
        this.front = front;
    }

    @JsonProperty("nutrition")
    public Nutrition_ getNutrition() {
        return nutrition;
    }

    @JsonProperty("nutrition")
    public void setNutrition(Nutrition_ nutrition) {
        this.nutrition = nutrition;
    }

    @JsonProperty("ingredients")
    public Ingredients_ getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(Ingredients_ ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("front")
    public Front_ getFront() {
        return front;
    }

    @JsonProperty("front")
    public void setFront(Front_ front) {
        this.front = front;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nutrition", nutrition).append("ingredients", ingredients).append("front", front).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ingredients).append(nutrition).append(front).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SelectedImages) == false) {
            return false;
        }
        SelectedImages rhs = ((SelectedImages) other);
        return new EqualsBuilder().append(ingredients, rhs.ingredients).append(nutrition, rhs.nutrition).append(front, rhs.front).isEquals();
    }

}
