package com.cars.whereismycar.Features.Permissions;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public interface Permissions {

    /**
     * Integer static param. Exposes specific request code
     */
    int PERMISSIONS_REQUEST_FINE_LOCATION = 1;

    /**
     * Requesting permission to location on phone.
     *
     * @param context  context,
     * @param activity activity
     */
    void requestLocationPermission(Context context, Activity activity);

}
