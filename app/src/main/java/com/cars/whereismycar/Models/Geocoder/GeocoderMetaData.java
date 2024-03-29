
package com.cars.whereismycar.Models.Geocoder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeocoderMetaData {

    @SerializedName("precision")
    @Expose
    private String precision;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("Address")
    @Expose
    private Address address;
    @SerializedName("AddressDetails")
    @Expose
    private AddressDetails addressDetails;

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

}
