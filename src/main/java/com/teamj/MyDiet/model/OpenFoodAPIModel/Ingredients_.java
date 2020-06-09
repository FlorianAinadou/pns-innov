
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
public class Ingredients_ implements Serializable
{

    @JsonProperty("small")
    private Small_ small;
    @JsonProperty("display")
    private Display_ display;
    @JsonProperty("thumb")
    private Thumb_ thumb;
    private final static long serialVersionUID = -4998606713047052511L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ingredients_() {
    }

    /**
     * 
     * @param small
     * @param thumb
     * @param display
     */
    public Ingredients_(Small_ small, Display_ display, Thumb_ thumb) {
        super();
        this.small = small;
        this.display = display;
        this.thumb = thumb;
    }

    @JsonProperty("small")
    public Small_ getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(Small_ small) {
        this.small = small;
    }

    @JsonProperty("display")
    public Display_ getDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(Display_ display) {
        this.display = display;
    }

    @JsonProperty("thumb")
    public Thumb_ getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(Thumb_ thumb) {
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
        if ((other instanceof Ingredients_) == false) {
            return false;
        }
        Ingredients_ rhs = ((Ingredients_) other);
        return new EqualsBuilder().append(small, rhs.small).append(thumb, rhs.thumb).append(display, rhs.display).isEquals();
    }

}
