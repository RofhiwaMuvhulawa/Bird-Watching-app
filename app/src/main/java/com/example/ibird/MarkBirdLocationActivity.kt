package com.example.ibird

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.gms.maps.SupportMapFragment

class MarkBirdLocationActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var mapFragment: SupportMapFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mark_bird_location)

        toolbar = findViewById(R.id.toolBar)
        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment

        mapFragment.getMapAsync { googleMap ->
            // Set up the Google map for marking bird locations
        }
    }
}
