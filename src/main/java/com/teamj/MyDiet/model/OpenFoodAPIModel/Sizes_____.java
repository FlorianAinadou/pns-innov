
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
    "200",
    "400",
    "full"
})
public class Sizes_____ implements Serializable
{

    @JsonProperty("100")
    private _100_____ _100;
    @JsonProperty("200")
    private com.teamj.MyDiet.model.OpenFoodAPIModel._200 _200;
    @JsonProperty("400")
    private _400_____ _400;
    @JsonProperty("full")
    private Full_____ full;
    private final static long serialVersionUID = -5223164912582883745L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes_____() {
    }

    /**
     * 
     * @param _200
     * @param _100
     * @param _400
     * @param full
     */
    public Sizes_____(_100_____ _100, com.teamj.MyDiet.model.OpenFoodAPIModel._200 _200, _400_____ _400, Full_____ full) {
        super();
        this._100 = _100;
        this._200 = _200;
        this._400 = _400;
        this.full = full;
    }

    @JsonProperty("100")
    public _100_____ get100() {
        return _100;
    }

    @JsonProperty("100")
    public void set100(_100_____ _100) {
        this._100 = _100;
    }

    @JsonProperty("200")
    public com.teamj.MyDiet.model.OpenFoodAPIModel._200 get200() {
        return _200;
    }

    @JsonProperty("200")
    public void set200(com.teamj.MyDiet.model.OpenFoodAPIModel._200 _200) {
        this._200 = _200;
    }

    @JsonProperty("400")
    public _400_____ get400() {
        return _400;
    }

    @JsonProperty("400")
    public void set400(_400_____ _400) {
        this._400 = _400;
    }

    @JsonProperty("full")
    public Full_____ getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(Full_____ full) {
        this.full = full;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("_100", _100).append("_200", _200).append("_400", _400).append("full", full).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_200).append(_100).append(_400).append(full).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sizes_____) == false) {
            return false;
        }
        Sizes_____ rhs = ((Sizes_____) other);
        return new EqualsBuilder().append(_200, rhs._200).append(_100, rhs._100).append(_400, rhs._400).append(full, rhs.full).isEquals();
    }

}
