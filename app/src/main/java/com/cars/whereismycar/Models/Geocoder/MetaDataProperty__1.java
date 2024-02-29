
package com.cars.whereismycar.Models.Geocoder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetaDataProperty__1 {

    @SerializedName("GeocoderMetaData")
    @Expose
    private GeocoderMetaData geocoderMetaData;

    public GeocoderMetaData getGeocoderMetaData() {
        return geocoderMetaData;
    }

    public void setGeocoderMetaData(GeocoderMetaData geocoderMetaData) {
        this.geocoderMetaData = geocoderMetaData;
    }

}
