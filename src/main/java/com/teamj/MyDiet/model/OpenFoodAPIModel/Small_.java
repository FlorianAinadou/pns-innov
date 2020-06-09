
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
    "en"
})
public class Small_ implements Serializable
{

    @JsonProperty("en")
    private String en;
    private final static long serialVersionUID = 4982606279424985212L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Small_() {
    }

    /**
     * 
     * @param en
     */
    public Small_(String en) {
        super();
        this.en = en;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("en", en).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(en).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Small_) == false) {
            return false;
        }
        Small_ rhs = ((Small_) other);
        return new EqualsBuilder().append(en, rhs.en).isEquals();
    }

}
