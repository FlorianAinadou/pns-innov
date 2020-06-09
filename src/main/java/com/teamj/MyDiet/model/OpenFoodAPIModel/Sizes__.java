
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
public class Sizes__ implements Serializable
{

    @JsonProperty("100")
    private _100__ _100;
    @JsonProperty("400")
    private _400__ _400;
    @JsonProperty("full")
    private Full__ full;
    private final static long serialVersionUID = -8565150967905929229L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes__() {
    }

    /**
     * 
     * @param _100
     * @param _400
     * @param full
     */
    public Sizes__(_100__ _100, _400__ _400, Full__ full) {
        super();
        this._100 = _100;
        this._400 = _400;
        this.full = full;
    }

    @JsonProperty("100")
    public _100__ get100() {
        return _100;
    }

    @JsonProperty("100")
    public void set100(_100__ _100) {
        this._100 = _100;
    }

    @JsonProperty("400")
    public _400__ get400() {
        return _400;
    }

    @JsonProperty("400")
    public void set400(_400__ _400) {
        this._400 = _400;
    }

    @JsonProperty("full")
    public Full__ getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(Full__ full) {
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
        if ((other instanceof Sizes__) == false) {
            return false;
        }
        Sizes__ rhs = ((Sizes__) other);
        return new EqualsBuilder().append(_100, rhs._100).append(_400, rhs._400).append(full, rhs.full).isEquals();
    }

}
