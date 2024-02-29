
package com.cars.whereismycar.Models.Geocoder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoundedBy__1 {

    @SerializedName("Envelope")
    @Expose
    private Envelope__1 envelope;

    public Envelope__1 getEnvelope() {
        return envelope;
    }

    public void setEnvelope(Envelope__1 envelope) {
        this.envelope = envelope;
    }

}
