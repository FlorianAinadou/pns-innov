
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
    "thumb",
    "display",
    "small"
})
public class Front_ implements Serializable
{

    @JsonProperty("thumb")
    private Thumb__ thumb;
    @JsonProperty("display")
    private Display__ display;
    @JsonProperty("small")
    private Small__ small;
    private final static long serialVersionUID = 2962803298079916206L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Front_() {
    }

    /**
     * 
     * @param small
     * @param thumb
     * @param display
     */
    public Front_(Thumb__ thumb, Display__ display, Small__ small) {
        super();
        this.thumb = thumb;
        this.display = display;
        this.small = small;
    }

    @JsonProperty("thumb")
    public Thumb__ getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(Thumb__ thumb) {
        this.thumb = thumb;
    }

    @JsonProperty("display")
    public Display__ getDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(Display__ display) {
        this.display = display;
    }

    @JsonProperty("small")
    public Small__ getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(Small__ small) {
        this.small = small;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("thumb", thumb).append("display", display).append("small", small).toString();
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
        if ((other instanceof Front_) == false) {
            return false;
        }
        Front_ rhs = ((Front_) other);
        return new EqualsBuilder().append(small, rhs.small).append(thumb, rhs.thumb).append(display, rhs.display).isEquals();
    }

}
