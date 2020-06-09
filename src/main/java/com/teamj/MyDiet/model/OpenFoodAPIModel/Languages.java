
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
    "en:english"
})
public class Languages implements Serializable
{

    @JsonProperty("en:english")
    private Long enEnglish;
    private final static long serialVersionUID = -9005138951423593722L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Languages() {
    }

    /**
     * 
     * @param enEnglish
     */
    public Languages(Long enEnglish) {
        super();
        this.enEnglish = enEnglish;
    }

    @JsonProperty("en:english")
    public Long getEnEnglish() {
        return enEnglish;
    }

    @JsonProperty("en:english")
    public void setEnEnglish(Long enEnglish) {
        this.enEnglish = enEnglish;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enEnglish", enEnglish).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enEnglish).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Languages) == false) {
            return false;
        }
        Languages rhs = ((Languages) other);
        return new EqualsBuilder().append(enEnglish, rhs.enEnglish).isEquals();
    }

}
