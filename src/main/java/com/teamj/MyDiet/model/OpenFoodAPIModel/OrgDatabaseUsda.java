
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
    "modified_date",
    "available_date",
    "fdc_category",
    "fdc_data_source",
    "fdc_id",
    "publication_date"
})
public class OrgDatabaseUsda implements Serializable
{

    @JsonProperty("modified_date")
    private String modifiedDate;
    @JsonProperty("available_date")
    private String availableDate;
    @JsonProperty("fdc_category")
    private String fdcCategory;
    @JsonProperty("fdc_data_source")
    private String fdcDataSource;
    @JsonProperty("fdc_id")
    private String fdcId;
    @JsonProperty("publication_date")
    private String publicationDate;
    private final static long serialVersionUID = -2636609779797738579L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrgDatabaseUsda() {
    }

    /**
     * 
     * @param fdcCategory
     * @param modifiedDate
     * @param availableDate
     * @param fdcId
     * @param publicationDate
     * @param fdcDataSource
     */
    public OrgDatabaseUsda(String modifiedDate, String availableDate, String fdcCategory, String fdcDataSource, String fdcId, String publicationDate) {
        super();
        this.modifiedDate = modifiedDate;
        this.availableDate = availableDate;
        this.fdcCategory = fdcCategory;
        this.fdcDataSource = fdcDataSource;
        this.fdcId = fdcId;
        this.publicationDate = publicationDate;
    }

    @JsonProperty("modified_date")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modified_date")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("available_date")
    public String getAvailableDate() {
        return availableDate;
    }

    @JsonProperty("available_date")
    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }

    @JsonProperty("fdc_category")
    public String getFdcCategory() {
        return fdcCategory;
    }

    @JsonProperty("fdc_category")
    public void setFdcCategory(String fdcCategory) {
        this.fdcCategory = fdcCategory;
    }

    @JsonProperty("fdc_data_source")
    public String getFdcDataSource() {
        return fdcDataSource;
    }

    @JsonProperty("fdc_data_source")
    public void setFdcDataSource(String fdcDataSource) {
        this.fdcDataSource = fdcDataSource;
    }

    @JsonProperty("fdc_id")
    public String getFdcId() {
        return fdcId;
    }

    @JsonProperty("fdc_id")
    public void setFdcId(String fdcId) {
        this.fdcId = fdcId;
    }

    @JsonProperty("publication_date")
    public String getPublicationDate() {
        return publicationDate;
    }

    @JsonProperty("publication_date")
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("modifiedDate", modifiedDate).append("availableDate", availableDate).append("fdcCategory", fdcCategory).append("fdcDataSource", fdcDataSource).append("fdcId", fdcId).append("publicationDate", publicationDate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fdcCategory).append(modifiedDate).append(availableDate).append(fdcId).append(publicationDate).append(fdcDataSource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrgDatabaseUsda) == false) {
            return false;
        }
        OrgDatabaseUsda rhs = ((OrgDatabaseUsda) other);
        return new EqualsBuilder().append(fdcCategory, rhs.fdcCategory).append(modifiedDate, rhs.modifiedDate).append(availableDate, rhs.availableDate).append(fdcId, rhs.fdcId).append(publicationDate, rhs.publicationDate).append(fdcDataSource, rhs.fdcDataSource).isEquals();
    }

}
