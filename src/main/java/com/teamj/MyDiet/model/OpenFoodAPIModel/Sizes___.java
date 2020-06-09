
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
public class Sizes___ implements Serializable
{

    @JsonProperty("100")
    private _100___ _100;
    @JsonProperty("400")
    private _400___ _400;
    @JsonProperty("full")
    private Full___ full;
    private final static long serialVersionUID = -2808400872685867302L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes___() {
    }

    /**
     * 
     * @param _100
     * @param _400
     * @param full
     */
    public Sizes___(_100___ _100, _400___ _400, Full___ full) {
        super();
        this._100 = _100;
        this._400 = _400;
        this.full = full;
    }

    @JsonProperty("100")
    public _100___ get100() {
        return _100;
    }

    @JsonProperty("100")
    public void set100(_100___ _100) {
        this._100 = _100;
    }

    @JsonProperty("400")
    public _400___ get400() {
        return _400;
    }

    @JsonProperty("400")
    public void set400(_400___ _400) {
        this._400 = _400;
    }

    @JsonProperty("full")
    public Full___ getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(Full___ full) {
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
        if ((other instanceof Sizes___) == false) {
            return false;
        }
        Sizes___ rhs = ((Sizes___) other);
        return new EqualsBuilder().append(_100, rhs._100).append(_400, rhs._400).append(full, rhs.full).isEquals();
    }

}
