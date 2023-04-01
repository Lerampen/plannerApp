package com.example.plannerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStarted : Button = findViewById(R.id.btnLetsStart)
        val etName : AppCompatEditText = findViewById(R.id.etName)

//        once the user clicks on the 'let's get started' button
//        check if they have entered their name if not display an error message
        btnStarted.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                etName.error = "Please enter your name"
            }
        }

    }
}