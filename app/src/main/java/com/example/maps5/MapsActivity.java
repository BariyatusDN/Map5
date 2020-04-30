package com.example.maps5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng rm1 = new LatLng(-7.2802383, 112.2033921);
        mMap.addMarker(new MarkerOptions().position(rm1).title("Warung Mbak Ernik"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rm1));

        LatLng rm2 = new LatLng(-7.2820546, 112.2089615);
        mMap.addMarker(new MarkerOptions().position(rm2).title("Quick Chicken Ngimbang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rm2));

        LatLng rm3 = new LatLng(-7.2867175, 112.2132039);
        mMap.addMarker(new MarkerOptions().position(rm3).title("Warung LA Mania"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rm3));

        LatLng pasar = new LatLng(-7.2809155, 112.2135311);
        mMap.addMarker(new MarkerOptions().position(pasar).title("Pasar Ngimbang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pasar));

        LatLng sd1 = new LatLng(-7.281387, 112.2137043);
        mMap.addMarker(new MarkerOptions().position(sd1).title("SDN Sendangrejo I"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sd1));

        LatLng sd2 = new LatLng(-7.2821346, 112.2113438);
        mMap.addMarker(new MarkerOptions().position(sd2).title("SDN NGIMBANG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sd2));





    }
}
