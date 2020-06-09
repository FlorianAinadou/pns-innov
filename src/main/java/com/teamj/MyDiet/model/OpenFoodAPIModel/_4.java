
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
    "uploader",
    "sizes",
    "uploaded_t"
})
public class _4 implements Serializable
{

    @JsonProperty("uploader")
    private String uploader;
    @JsonProperty("sizes")
    private Sizes___ sizes;
    @JsonProperty("uploaded_t")
    private Long uploadedT;
    private final static long serialVersionUID = -1370612242658982601L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public _4() {
    }

    /**
     * 
     * @param sizes
     * @param uploader
     * @param uploadedT
     */
    public _4(String uploader, Sizes___ sizes, Long uploadedT) {
        super();
        this.uploader = uploader;
        this.sizes = sizes;
        this.uploadedT = uploadedT;
    }

    @JsonProperty("uploader")
    public String getUploader() {
        return uploader;
    }

    @JsonProperty("uploader")
    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    @JsonProperty("sizes")
    public Sizes___ getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(Sizes___ sizes) {
        this.sizes = sizes;
    }

    @JsonProperty("uploaded_t")
    public Long getUploadedT() {
        return uploadedT;
    }

    @JsonProperty("uploaded_t")
    public void setUploadedT(Long uploadedT) {
        this.uploadedT = uploadedT;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uploader", uploader).append("sizes", sizes).append("uploadedT", uploadedT).toString();
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
        if ((other instanceof _4) == false) {
            return false;
        }
        _4 rhs = ((_4) other);
        return new EqualsBuilder().append(sizes, rhs.sizes).append(uploader, rhs.uploader).append(uploadedT, rhs.uploadedT).isEquals();
    }

}
