
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
    "small",
    "display",
    "thumb"
})
public class Nutrition_ implements Serializable
{

    @JsonProperty("small")
    private Small small;
    @JsonProperty("display")
    private Display display;
    @JsonProperty("thumb")
    private Thumb thumb;
    private final static long serialVersionUID = 3509032829313870406L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Nutrition_() {
    }

    /**
     * 
     * @param small
     * @param thumb
     * @param display
     */
    public Nutrition_(Small small, Display display, Thumb thumb) {
        super();
        this.small = small;
        this.display = display;
        this.thumb = thumb;
    }

    @JsonProperty("small")
    public Small getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(Small small) {
        this.small = small;
    }

    @JsonProperty("display")
    public Display getDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(Display display) {
        this.display = display;
    }

    @JsonProperty("thumb")
    public Thumb getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("small", small).append("display", display).append("thumb", thumb).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(small).append(thumb).append(display).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nutrition_) == false) {
            return false;
        }
        Nutrition_ rhs = ((Nutrition_) other);
        return new EqualsBuilder().append(small, rhs.small).append(thumb, rhs.thumb).append(display, rhs.display).isEquals();
    }

}
