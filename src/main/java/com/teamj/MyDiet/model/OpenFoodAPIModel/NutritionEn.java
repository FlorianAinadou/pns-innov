
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
    "imgid",
    "normalize",
    "geometry",
    "white_magic",
    "rev"
})
public class NutritionEn implements Serializable
{

    @JsonProperty("sizes")
    private Sizes______ sizes;
    @JsonProperty("imgid")
    private String imgid;
    @JsonProperty("normalize")
    private String normalize;
    @JsonProperty("geometry")
    private String geometry;
    @JsonProperty("white_magic")
    private Object whiteMagic;
    @JsonProperty("rev")
    private String rev;
    private final static long serialVersionUID = -5111927358283771491L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NutritionEn() {
    }

    /**
     * 
     * @param rev
     * @param sizes
     * @param imgid
     * @param normalize
     * @param whiteMagic
     * @param geometry
     */
    public NutritionEn(Sizes______ sizes, String imgid, String normalize, String geometry, Object whiteMagic, String rev) {
        super();
        this.sizes = sizes;
        this.imgid = imgid;
        this.normalize = normalize;
        this.geometry = geometry;
        this.whiteMagic = whiteMagic;
        this.rev = rev;
    }

    @JsonProperty("sizes")
    public Sizes______ getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(Sizes______ sizes) {
        this.sizes = sizes;
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
    public String getNormalize() {
        return normalize;
    }

    @JsonProperty("normalize")
    public void setNormalize(String normalize) {
        this.normalize = normalize;
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

    @JsonProperty("rev")
    public String getRev() {
        return rev;
    }

    @JsonProperty("rev")
    public void setRev(String rev) {
        this.rev = rev;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sizes", sizes).append("imgid", imgid).append("normalize", normalize).append("geometry", geometry).append("whiteMagic", whiteMagic).append("rev", rev).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rev).append(sizes).append(imgid).append(normalize).append(whiteMagic).append(geometry).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NutritionEn) == false) {
            return false;
        }
        NutritionEn rhs = ((NutritionEn) other);
        return new EqualsBuilder().append(rev, rhs.rev).append(sizes, rhs.sizes).append(imgid, rhs.imgid).append(normalize, rhs.normalize).append(whiteMagic, rhs.whiteMagic).append(geometry, rhs.geometry).isEquals();
    }

}
