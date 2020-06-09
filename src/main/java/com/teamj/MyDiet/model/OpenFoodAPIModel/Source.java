
package com.teamj.MyDiet.model.OpenFoodAPIModel;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "fields",
    "import_t",
    "images",
    "url",
    "manufacturer",
    "name"
})
public class Source implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("fields")
    private List<String> fields = null;
    @JsonProperty("import_t")
    private Long importT;
    @JsonProperty("images")
    private List<Object> images = null;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("manufacturer")
    private Object manufacturer;
    @JsonProperty("name")
    private String name;
    private final static long serialVersionUID = -6897782106372656444L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Source() {
    }

    /**
     * 
     * @param importT
     * @param images
     * @param name
     * @param id
     * @param fields
     * @param url
     * @param manufacturer
     */
    public Source(String id, List<String> fields, Long importT, List<Object> images, Object url, Object manufacturer, String name) {
        super();
        this.id = id;
        this.fields = fields;
        this.importT = importT;
        this.images = images;
        this.url = url;
        this.manufacturer = manufacturer;
        this.name = name;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("fields")
    public List<String> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    @JsonProperty("import_t")
    public Long getImportT() {
        return importT;
    }

    @JsonProperty("import_t")
    public void setImportT(Long importT) {
        this.importT = importT;
    }

    @JsonProperty("images")
    public List<Object> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Object> images) {
        this.images = images;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    @JsonProperty("manufacturer")
    public Object getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(Object manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("fields", fields).append("importT", importT).append("images", images).append("url", url).append("manufacturer", manufacturer).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(importT).append(images).append(name).append(id).append(fields).append(url).append(manufacturer).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return new EqualsBuilder().append(importT, rhs.importT).append(images, rhs.images).append(name, rhs.name).append(id, rhs.id).append(fields, rhs.fields).append(url, rhs.url).append(manufacturer, rhs.manufacturer).isEquals();
    }

}
