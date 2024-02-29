package com.cars.whereismycar.Models.Geocoder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeoObject {

    @SerializedName("metaDataProperty")
    @Expose
    private MetaDataProperty__1 metaDataProperty;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("boundedBy")
    @Expose
    private BoundedBy__1 boundedBy;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("Point")
    @Expose
    private Point__1 point;

    public MetaDataProperty__1 getMetaDataProperty() {
        return metaDataProperty;
    }

    public void setMetaDataProperty(MetaDataProperty__1 metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BoundedBy__1 getBoundedBy() {
        return boundedBy;
    }

    public void setBoundedBy(BoundedBy__1 boundedBy) {
        this.boundedBy = boundedBy;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Point__1 getPoint() {
        return point;
    }

    public void setPoint(Point__1 point) {
        this.point = point;
    }

}
