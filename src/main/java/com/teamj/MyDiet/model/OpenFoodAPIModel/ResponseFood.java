
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
    "status_verbose",
    "code",
    "product",
    "status"
})
public class ResponseFood implements Serializable
{

    @JsonProperty("status_verbose")
    private String statusVerbose;
    @JsonProperty("code")
    private String code;
    @JsonProperty("product")
    private Product product;
    @JsonProperty("status")
    private Long status;
    private final static long serialVersionUID = 4775521407801330033L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseFood() {
    }

    /**
     * 
     * @param product
     * @param code
     * @param statusVerbose
     * @param status
     */
    public ResponseFood(String statusVerbose, String code, Product product, Long status) {
        super();
        this.statusVerbose = statusVerbose;
        this.code = code;
        this.product = product;
        this.status = status;
    }

    @JsonProperty("status_verbose")
    public String getStatusVerbose() {
        return statusVerbose;
    }

    @JsonProperty("status_verbose")
    public void setStatusVerbose(String statusVerbose) {
        this.statusVerbose = statusVerbose;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonProperty("status")
    public Long getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statusVerbose", statusVerbose).append("code", code).append("product", product).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(product).append(code).append(statusVerbose).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseFood) == false) {
            return false;
        }
        ResponseFood rhs = ((ResponseFood) other);
        return new EqualsBuilder().append(product, rhs.product).append(code, rhs.code).append(statusVerbose, rhs.statusVerbose).append(status, rhs.status).isEquals();
    }

}
