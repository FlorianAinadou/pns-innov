
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
    "100",
    "400",
    "full"
})
public class Sizes implements Serializable
{

    @JsonProperty("100")
    private com.teamj.MyDiet.model.OpenFoodAPIModel._100 _100;
    @JsonProperty("400")
    private com.teamj.MyDiet.model.OpenFoodAPIModel._400 _400;
    @JsonProperty("full")
    private Full full;
    private final static long serialVersionUID = 5045098404918225178L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes() {
    }

    /**
     * 
     * @param _100
     * @param _400
     * @param full
     */
    public Sizes(com.teamj.MyDiet.model.OpenFoodAPIModel._100 _100, com.teamj.MyDiet.model.OpenFoodAPIModel._400 _400, Full full) {
        super();
        this._100 = _100;
        this._400 = _400;
        this.full = full;
    }

    @JsonProperty("100")
    public com.teamj.MyDiet.model.OpenFoodAPIModel._100 get100() {
        return _100;
    }

    @JsonProperty("100")
    public void set100(com.teamj.MyDiet.model.OpenFoodAPIModel._100 _100) {
        this._100 = _100;
    }

    @JsonProperty("400")
    public com.teamj.MyDiet.model.OpenFoodAPIModel._400 get400() {
        return _400;
    }

    @JsonProperty("400")
    public void set400(com.teamj.MyDiet.model.OpenFoodAPIModel._400 _400) {
        this._400 = _400;
    }

    @JsonProperty("full")
    public Full getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(Full full) {
        this.full = full;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("_100", _100).append("_400", _400).append("full", full).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_100).append(_400).append(full).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sizes) == false) {
            return false;
        }
        Sizes rhs = ((Sizes) other);
        return new EqualsBuilder().append(_100, rhs._100).append(_400, rhs._400).append(full, rhs.full).isEquals();
    }

}
