
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
    "org-database-usda"
})
public class SourcesFields implements Serializable
{

    @JsonProperty("org-database-usda")
    private OrgDatabaseUsda orgDatabaseUsda;
    private final static long serialVersionUID = 1710747483712506164L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SourcesFields() {
    }

    /**
     * 
     * @param orgDatabaseUsda
     */
    public SourcesFields(OrgDatabaseUsda orgDatabaseUsda) {
        super();
        this.orgDatabaseUsda = orgDatabaseUsda;
    }

    @JsonProperty("org-database-usda")
    public OrgDatabaseUsda getOrgDatabaseUsda() {
        return orgDatabaseUsda;
    }

    @JsonProperty("org-database-usda")
    public void setOrgDatabaseUsda(OrgDatabaseUsda orgDatabaseUsda) {
        this.orgDatabaseUsda = orgDatabaseUsda;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("orgDatabaseUsda", orgDatabaseUsda).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(orgDatabaseUsda).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourcesFields) == false) {
            return false;
        }
        SourcesFields rhs = ((SourcesFields) other);
        return new EqualsBuilder().append(orgDatabaseUsda, rhs.orgDatabaseUsda).isEquals();
    }

}
