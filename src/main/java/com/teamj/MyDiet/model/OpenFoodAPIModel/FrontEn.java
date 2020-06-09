
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
    "rev",
    "geometry",
    "white_magic",
    "imgid",
    "normalize"
})
public class FrontEn implements Serializable
{

    @JsonProperty("sizes")
    private Sizes________ sizes;
    @JsonProperty("rev")
    private String rev;
    @JsonProperty("geometry")
    private String geometry;
    @JsonProperty("white_magic")
    private Object whiteMagic;
    @JsonProperty("imgid")
    private String imgid;
    @JsonProperty("normalize")
    private Object normalize;
    private final static long serialVersionUID = -6296745738568567789L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FrontEn() {
    }

    /**
     * 
     * @param rev
     * @param sizes
     * @param imgid
     * @param whiteMagic
     * @param normalize
     * @param geometry
     */
    public FrontEn(Sizes________ sizes, String rev, String geometry, Object whiteMagic, String imgid, Object normalize) {
        super();
        this.sizes = sizes;
        this.rev = rev;
        this.geometry = geometry;
        this.whiteMagic = whiteMagic;
        this.imgid = imgid;
        this.normalize = normalize;
    }

    @JsonProperty("sizes")
    public Sizes________ getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(Sizes________ sizes) {
        this.sizes = sizes;
    }

    @JsonProperty("rev")
    public String getRev() {
        return rev;
    }

    @JsonProperty("rev")
    public void setRev(String rev) {
        this.rev = rev;
    }

    @JsonProperty("geometry")
    public String getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("white_magic")
    public Object getWhiteMagic() {
        return whiteMagic;
    }

    @JsonProperty("white_magic")
    public void setWhiteMagic(Object whiteMagic) {
        this.whiteMagic = whiteMagic;
    }

    @JsonProperty("imgid")
    public String getImgid() {
        return imgid;
    }

    @JsonProperty("imgid")
    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

    @JsonProperty("normalize")
    public Object getNormalize() {
        return normalize;
    }

    @JsonProperty("normalize")
    public void setNormalize(Object normalize) {
        this.normalize = normalize;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sizes", sizes).append("rev", rev).append("geometry", geometry).append("whiteMagic", whiteMagic).append("imgid", imgid).append("normalize", normalize).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rev).append(sizes).append(imgid).append(whiteMagic).append(normalize).append(geometry).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FrontEn) == false) {
            return false;
        }
        FrontEn rhs = ((FrontEn) other);
        return new EqualsBuilder().append(rev, rhs.rev).append(sizes, rhs.sizes).append(imgid, rhs.imgid).append(whiteMagic, rhs.whiteMagic).append(normalize, rhs.normalize).append(geometry, rhs.geometry).isEquals();
    }

}
