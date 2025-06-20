package com.example.ibird

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DetailsActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var nameEditText: EditText
    private lateinit var notesEditText: EditText
    private lateinit var uploadImageView: ImageView
    private lateinit var uploadImageButton: Button
    private lateinit var markBirdButton: Button
    private lateinit var btnAdd: Button
    private lateinit var btnUpdate: Button
    private lateinit var btnDelete: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        toolbar = findViewById(R.id.toolBar)
        nameEditText = findViewById(R.id.nameEditText)
        notesEditText = findViewById(R.id.notesEditText)
        uploadImageView = findViewById(R.id.uploadImageView)
        uploadImageButton = findViewById(R.id.uploadImageButton)
        markBirdButton = findViewById(R.id.markBirdButton)
        btnAdd = findViewById(R.id.btnAdd)
        btnUpdate = findViewById(R.id.btnUpdate)
        btnDelete = findViewById(R.id.btnDelete)

        uploadImageButton.setOnClickListener {
            // Handle image upload logic
        }

        markBirdButton.setOnClickListener {
            setBirdMarker()
        }

        btnAdd.setOnClickListener {
            add()
        }

        btnUpdate.setOnClickListener {
            update()
        }

        btnDelete.setOnClickListener {
            delete()
        }
    }

    private fun setBirdMarker() {
        // Handle setting bird marker logic
    }

    private fun add() {
        // Handle adding bird details logic
    }

    private fun update() {
        // Handle updating bird details logic
    }

    private fun delete() {
        // Handle deleting bird details logic
    }
}
