
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
public class Sizes_ implements Serializable
{

    @JsonProperty("100")
    private _100_ _100;
    @JsonProperty("400")
    private _400_ _400;
    @JsonProperty("full")
    private Full_ full;
    private final static long serialVersionUID = -3461551377084444609L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes_() {
    }

    /**
     * 
     * @param _100
     * @param _400
     * @param full
     */
    public Sizes_(_100_ _100, _400_ _400, Full_ full) {
        super();
        this._100 = _100;
        this._400 = _400;
        this.full = full;
    }

    @JsonProperty("100")
    public _100_ get100() {
        return _100;
    }

    @JsonProperty("100")
    public void set100(_100_ _100) {
        this._100 = _100;
    }

    @JsonProperty("400")
    public _400_ get400() {
        return _400;
    }

    @JsonProperty("400")
    public void set400(_400_ _400) {
        this._400 = _400;
    }

    @JsonProperty("full")
    public Full_ getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(Full_ full) {
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
        if ((other instanceof Sizes_) == false) {
            return false;
        }
        Sizes_ rhs = ((Sizes_) other);
        return new EqualsBuilder().append(_100, rhs._100).append(_400, rhs._400).append(full, rhs.full).isEquals();
    }

}
