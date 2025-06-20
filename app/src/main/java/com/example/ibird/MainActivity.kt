package com.example.ibird

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var sortSpinner: Spinner
    private lateinit var listView: ListView
    private lateinit var floatingActionButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        sortSpinner = findViewById(R.id.sortSpinner)
        listView = findViewById(R.id.listView)
        floatingActionButton = findViewById(R.id.floatingActionButton)

        // Spinner setup (replace with your sorting options)
        val sortingOptions = arrayOf("Sort by Name", "Sort by Rarity", "Sort by Date")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, sortingOptions)
        sortSpinner.adapter = adapter

        // Set the FloatingActionButton click listener
        floatingActionButton.setOnClickListener {
            fabClicked()
        }
    }

    private fun fabClicked() {
        // Handle FAB click event
    }
}
