package com.cs407.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.dynamic.SupportFragmentWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
..test

public class MainActivity extends AppCompatActivity {

    private GoogleMap mMap;
    private final LatLng mDestinationLatLng = new LatLng(43.07606304871629, -89.40359870422412);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_map);
        mapFragment.getMapAsync(googleMap -> {
            mMap = googleMap;
            //code to display mMap
            googleMap.addMarker(new MarkerOptions().position(mDestinationLatLng).title("Destination"));
        });
    }
}