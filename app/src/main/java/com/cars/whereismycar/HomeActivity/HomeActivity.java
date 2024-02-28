package com.cars.whereismycar.HomeActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cars.whereismycar.Env.Env;
import com.cars.whereismycar.R;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.layers.ObjectEvent;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.user_location.UserLocationObjectListener;
import com.yandex.mapkit.user_location.UserLocationView;

public class HomeActivity extends AppCompatActivity implements UserLocationObjectListener {

    private MapView mapView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapKitFactory.setApiKey(Env.MAPKIT_SDK_YANDEX_KEY);
        MapKitFactory.initialize(this);
        setContentView(R.layout.home_activiy);
        mapView = findViewById(R.id.mapview);
    }

    @Override
    public void onObjectAdded(@NonNull UserLocationView userLocationView) {

    }

    @Override
    public void onObjectRemoved(@NonNull UserLocationView userLocationView) {

    }

    @Override
    public void onObjectUpdated(@NonNull UserLocationView userLocationView, @NonNull ObjectEvent objectEvent) {

    }
}
