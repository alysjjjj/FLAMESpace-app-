package com.example.flamespace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.flamespace.R.id.currentbtn

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val buttonClick = findViewById<ImageView>(R.id.backButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val btnn = findViewById<ImageView>(currentbtn)
        btnn.setOnClickListener {
            val intent = Intent(this, Current::class.java)
            startActivity(intent)
        }
    }
}