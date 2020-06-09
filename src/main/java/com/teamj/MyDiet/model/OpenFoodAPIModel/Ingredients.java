
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
    "imgid",
    "normalize",
    "geometry",
    "rev",
    "white_magic",
    "sizes"
})
public class Ingredients implements Serializable
{

    @JsonProperty("imgid")
    private String imgid;
    @JsonProperty("normalize")
    private String normalize;
    @JsonProperty("geometry")
    private String geometry;
    @JsonProperty("rev")
    private String rev;
    @JsonProperty("white_magic")
    private Object whiteMagic;
    @JsonProperty("sizes")
    private Sizes__________ sizes;
    private final static long serialVersionUID = 3755358250964327346L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ingredients() {
    }

    /**
     * 
     * @param rev
     * @param imgid
     * @param sizes
     * @param normalize
     * @param whiteMagic
     * @param geometry
     */
    public Ingredients(String imgid, String normalize, String geometry, String rev, Object whiteMagic, Sizes__________ sizes) {
        super();
        this.imgid = imgid;
        this.normalize = normalize;
        this.geometry = geometry;
        this.rev = rev;
        this.whiteMagic = whiteMagic;
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

    @JsonProperty("rev")
    public String getRev() {
        return rev;
    }

    @JsonProperty("rev")
    public void setRev(String rev) {
        this.rev = rev;
    }

    @JsonProperty("white_magic")
    public Object getWhiteMagic() {
        return whiteMagic;
    }

    @JsonProperty("white_magic")
    public void setWhiteMagic(Object whiteMagic) {
        this.whiteMagic = whiteMagic;
    }

    @JsonProperty("sizes")
    public Sizes__________ getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(Sizes__________ sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("imgid", imgid).append("normalize", normalize).append("geometry", geometry).append("rev", rev).append("whiteMagic", whiteMagic).append("sizes", sizes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rev).append(imgid).append(sizes).append(normalize).append(whiteMagic).append(geometry).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ingredients) == false) {
            return false;
        }
        Ingredients rhs = ((Ingredients) other);
        return new EqualsBuilder().append(rev, rhs.rev).append(imgid, rhs.imgid).append(sizes, rhs.sizes).append(normalize, rhs.normalize).append(whiteMagic, rhs.whiteMagic).append(geometry, rhs.geometry).isEquals();
    }

}
