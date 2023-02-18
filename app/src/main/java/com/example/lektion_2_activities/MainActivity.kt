package com.example.lektion_2_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// it: View! (exclamation)
// File with all ID's 
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.myButton)

        myButton.setOnClickListener {
            println("I'm being clicked")
        }

    }

}