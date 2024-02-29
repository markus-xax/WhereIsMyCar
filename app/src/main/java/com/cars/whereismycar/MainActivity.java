package com.cars.whereismycar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.cars.whereismycar.Features.Permissions.GetPermissions;
import com.cars.whereismycar.HomeActivity.HomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetPermissions permissions = new GetPermissions();
        permissions.requestLocationPermission(this, this);

        new Thread(()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
        }).start();
    }
}