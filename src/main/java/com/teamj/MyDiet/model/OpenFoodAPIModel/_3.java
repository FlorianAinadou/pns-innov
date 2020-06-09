
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
    "sizes",
    "uploaded_t",
    "uploader"
})
public class _3 implements Serializable
{

    @JsonProperty("sizes")
    private Sizes__ sizes;
    @JsonProperty("uploaded_t")
    private Long uploadedT;
    @JsonProperty("uploader")
    private String uploader;
    private final static long serialVersionUID = 959134480023073470L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public _3() {
    }

    /**
     * 
     * @param sizes
     * @param uploader
     * @param uploadedT
     */
    public _3(Sizes__ sizes, Long uploadedT, String uploader) {
        super();
        this.sizes = sizes;
        this.uploadedT = uploadedT;
        this.uploader = uploader;
    }

    @JsonProperty("sizes")
    public Sizes__ getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(Sizes__ sizes) {
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
        return new ToStringBuilder(this).append("sizes", sizes).append("uploadedT", uploadedT).append("uploader", uploader).toString();
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
        if ((other instanceof _3) == false) {
            return false;
        }
        _3 rhs = ((_3) other);
        return new EqualsBuilder().append(sizes, rhs.sizes).append(uploader, rhs.uploader).append(uploadedT, rhs.uploadedT).isEquals();
    }

}
