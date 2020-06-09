
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
    "sugars",
    "fat",
    "saturated-fat",
    "salt"
})
public class NutrientLevels implements Serializable
{

    @JsonProperty("sugars")
    private String sugars;
    @JsonProperty("fat")
    private String fat;
    @JsonProperty("saturated-fat")
    private String saturatedFat;
    @JsonProperty("salt")
    private String salt;
    private final static long serialVersionUID = -7948214646364358256L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NutrientLevels() {
    }

    /**
     * 
     * @param saturatedFat
     * @param sugars
     * @param salt
     * @param fat
     */
    public NutrientLevels(String sugars, String fat, String saturatedFat, String salt) {
        super();
        this.sugars = sugars;
        this.fat = fat;
        this.saturatedFat = saturatedFat;
        this.salt = salt;
    }

    @JsonProperty("sugars")
    public String getSugars() {
        return sugars;
    }

    @JsonProperty("sugars")
    public void setSugars(String sugars) {
        this.sugars = sugars;
    }

    @JsonProperty("fat")
    public String getFat() {
        return fat;
    }

    @JsonProperty("fat")
    public void setFat(String fat) {
        this.fat = fat;
    }

    @JsonProperty("saturated-fat")
    public String getSaturatedFat() {
        return saturatedFat;
    }

    @JsonProperty("saturated-fat")
    public void setSaturatedFat(String saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    @JsonProperty("salt")
    public String getSalt() {
        return salt;
    }

    @JsonProperty("salt")
    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sugars", sugars).append("fat", fat).append("saturatedFat", saturatedFat).append("salt", salt).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fat).append(saturatedFat).append(sugars).append(salt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NutrientLevels) == false) {
            return false;
        }
        NutrientLevels rhs = ((NutrientLevels) other);
        return new EqualsBuilder().append(fat, rhs.fat).append(saturatedFat, rhs.saturatedFat).append(sugars, rhs.sugars).append(salt, rhs.salt).isEquals();
    }

}
