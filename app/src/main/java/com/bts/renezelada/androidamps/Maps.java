package com.bts.renezelada.androidamps;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by idsalcaja on 24/03/17.
 */

public class Maps extends FragmentActivity {

    static final LatLng Marker1 = new LatLng(22.353720, 114.101135);
    static final LatLng Marker2 = new LatLng(22.364848, 114.245738);
    static final LatLng Marker3 = new LatLng(22.371234, 114.314786);
    static final LatLng Marker4 = new LatLng(22.385366, 113.943092);
    static final LatLng Marker5 = new LatLng(22.315998, 113.932045);
    static final LatLng Marker6 = new LatLng(22.384079, 114.113329);
    static final LatLng Marker7 = new LatLng(22.352799, 114.102767);
    static final LatLng Marker8 = new LatLng(22.349270, 114.100653);


    Vibrator vibe;
    final float[] result = new float[1];
    float zoom = 10;

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);


        map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();

        map.setMyLocationEnabled(true);


        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);



     //   Location.distanceBetween((14.8792389), (-91.4570993), (14.909392), (-92.057936), result);

//here I declare the setoncamerachangelistener, these method detect the movement of the camera and I used to...
        map.setOnCameraChangeListener(new GoogleMap.OnCameraChangeListener() {
            @Override
            public void onCameraChange(CameraPosition cameraPosition) {
                zoom = map.getCameraPosition().zoom;//... detect the zoom scale, that help me to see if its near to my if statetments or no.
              // Toast.makeText(getApplicationContext(), Float.toString(zoom),
                 //       Toast.LENGTH_SHORT).show(); // here I print the scale.
                updateMapZoom(zoom); // here i call the funtion.

                }

        });








    }
public void updateMapZoom(float zoom)
{

    // here I put the markers, the map begin with a scale of 2.0 soo thats why i put only one.
    if (zoom == 2)
    {
        Marker marker = map.addMarker(new MarkerOptions().position(Marker1)
                .title("Hello")
                .snippet("I used google maps.")
        );
    }

    // if you continue zooming the map the markers will apper.
    else if ((zoom>=6)&&(zoom<=7))
    {  map.clear();
        Marker marker = map.addMarker(new MarkerOptions().position(Marker1)
                .title("Hello")
                .snippet("I used google maps.")
        );
        Marker marke = map.addMarker(new MarkerOptions()
                .position(Marker4)
                .title("How are you? ")
                .snippet("I used markers.")
        );
    }
    //if you are  zooming out I made a map.clear() to erase all the markers and only show one.
    else if (zoom<=5)
    {   map.clear();
        Marker m = map.addMarker(new MarkerOptions().position(Marker1)
                .title("Hello")
                .snippet("I made my own funtion")
        );
    }
    // if you continue zooming the map the markers will added.
    else if ((zoom>=7)&&(zoom<=8))
    {   map.clear();
        Marker marker = map.addMarker(new MarkerOptions().position(Marker1)
                .title("Hello")
                .snippet("I used google maps.")
        );
        Marker marke = map.addMarker(new MarkerOptions()
                .position(Marker4)
                .title("How are you? ")
                .snippet("I used markers.")
        );
        Marker m = map.addMarker(new MarkerOptions()
                .position(Marker5)
                .title("IF sentences")
                .snippet("The if is for the zooming it shows one or more")
        );
    }
    // there are all the markers that I added to the map.
   else  if((this.zoom >= 8)&&(this.zoom <= 9)){
        map.clear();
        Marker m = map.addMarker(new MarkerOptions().position(Marker1)
                .title("if")
                .snippet("if you zoom in it shows more.")
        );
        Marker ma = map.addMarker(new MarkerOptions().position(Marker2)
                .title("markers")
                .snippet("if you zoom out it shows less markers")
        );
        Marker mar = map.addMarker(new MarkerOptions().position(Marker3)
                .title("markers")
                .snippet("if you zoom out it shows less markers")

        );
        Marker marke = map.addMarker(new MarkerOptions()
                .position(Marker4)
                .title("How are you? ")
                .snippet("I used markers.")
        );
        Marker ma2 = map.addMarker(new MarkerOptions()
                .position(Marker5)
                .title("IF sentences")
                .snippet("The if is for the zooming it shows one or more")
        );

    }
    else  if((this.zoom >= 9)&&(this.zoom <= 11)){
        map.clear();
        Marker m = map.addMarker(new MarkerOptions().position(Marker1)
                .title("if")
                .snippet("if you zoom in it shows more.")
        );
        Marker ma = map.addMarker(new MarkerOptions().position(Marker2)
                .title("markers")
                .snippet("if you zoom out it shows less markers")
        );
        Marker mar = map.addMarker(new MarkerOptions().position(Marker3)
                .title("markers")
                .snippet("if you zoom out it shows less markers")

        );
        Marker marke = map.addMarker(new MarkerOptions()
                .position(Marker4)
                .title("How are you? ")
                .snippet("I used markers.")
        );
        Marker ma2 = map.addMarker(new MarkerOptions()
                .position(Marker5)
                .title("IF sentences")
                .snippet("The if is for the zooming it shows one or more")
        );
        Marker marke5 = map.addMarker(new MarkerOptions().position(Marker6)
                .title("markers")
                .snippet("More markers")
        );
    }
    else if((this.zoom >= 12)&&(this.zoom <= 15)){
        Marker marke = map.addMarker(new MarkerOptions().position(Marker7)
                .title("markers")
                .snippet("More markers")
        );
        Marker marke4 = map.addMarker(new MarkerOptions().position(Marker8)
                .title("markers")
                .snippet("More markers")
        );
    }

}
    }
