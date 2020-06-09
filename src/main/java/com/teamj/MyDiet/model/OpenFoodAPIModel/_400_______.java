
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
    "w",
    "h"
})
public class _400_______ implements Serializable
{

    @JsonProperty("w")
    private Long w;
    @JsonProperty("h")
    private Long h;
    private final static long serialVersionUID = -7937803771937792121L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public _400_______() {
    }

    /**
     * 
     * @param w
     * @param h
     */
    public _400_______(Long w, Long h) {
        super();
        this.w = w;
        this.h = h;
    }

    @JsonProperty("w")
    public Long getW() {
        return w;
    }

    @JsonProperty("w")
    public void setW(Long w) {
        this.w = w;
    }

    @JsonProperty("h")
    public Long getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(Long h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("w", w).append("h", h).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(h).append(w).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _400_______) == false) {
            return false;
        }
        _400_______ rhs = ((_400_______) other);
        return new EqualsBuilder().append(h, rhs.h).append(w, rhs.w).isEquals();
    }

}
