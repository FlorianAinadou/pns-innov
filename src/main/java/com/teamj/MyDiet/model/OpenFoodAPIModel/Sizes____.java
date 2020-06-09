
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
public class Sizes____ implements Serializable
{

    @JsonProperty("100")
    private _100____ _100;
    @JsonProperty("400")
    private _400____ _400;
    @JsonProperty("full")
    private Full____ full;
    private final static long serialVersionUID = -5434302925310596835L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes____() {
    }

    /**
     * 
     * @param _100
     * @param _400
     * @param full
     */
    public Sizes____(_100____ _100, _400____ _400, Full____ full) {
        super();
        this._100 = _100;
        this._400 = _400;
        this.full = full;
    }

    @JsonProperty("100")
    public _100____ get100() {
        return _100;
    }

    @JsonProperty("100")
    public void set100(_100____ _100) {
        this._100 = _100;
    }

    @JsonProperty("400")
    public _400____ get400() {
        return _400;
    }

    @JsonProperty("400")
    public void set400(_400____ _400) {
        this._400 = _400;
    }

    @JsonProperty("full")
    public Full____ getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(Full____ full) {
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
        if ((other instanceof Sizes____) == false) {
            return false;
        }
        Sizes____ rhs = ((Sizes____) other);
        return new EqualsBuilder().append(_100, rhs._100).append(_400, rhs._400).append(full, rhs.full).isEquals();
    }

}
