
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
    "uploaded_t",
    "sizes",
    "uploader"
})
public class _5 implements Serializable
{

    @JsonProperty("uploaded_t")
    private Long uploadedT;
    @JsonProperty("sizes")
    private Sizes____ sizes;
    @JsonProperty("uploader")
    private String uploader;
    private final static long serialVersionUID = 2702652978191304643L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public _5() {
    }

    /**
     * 
     * @param sizes
     * @param uploader
     * @param uploadedT
     */
    public _5(Long uploadedT, Sizes____ sizes, String uploader) {
        super();
        this.uploadedT = uploadedT;
        this.sizes = sizes;
        this.uploader = uploader;
    }

    @JsonProperty("uploaded_t")
    public Long getUploadedT() {
        return uploadedT;
    }

    @JsonProperty("uploaded_t")
    public void setUploadedT(Long uploadedT) {
        this.uploadedT = uploadedT;
    }

    @JsonProperty("sizes")
    public Sizes____ getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(Sizes____ sizes) {
        this.sizes = sizes;
    }

    @JsonProperty("uploader")
    public String getUploader() {
        return uploader;
    }

    @JsonProperty("uploader")
    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uploadedT", uploadedT).append("sizes", sizes).append("uploader", uploader).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sizes).append(uploader).append(uploadedT).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _5) == false) {
            return false;
        }
        _5 rhs = ((_5) other);
        return new EqualsBuilder().append(sizes, rhs.sizes).append(uploader, rhs.uploader).append(uploadedT, rhs.uploadedT).isEquals();
    }

}
