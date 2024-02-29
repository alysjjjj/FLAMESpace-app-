package com.example.flamespace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.ptc)
        button.setOnClickListener {
            val intent = Intent(this, PTC_Rooms::class.java)
            startActivity(intent)
        }

        val btnProfile = findViewById<ImageView>(R.id.profile)
        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val intent = Intent(this, Cma_room::class.java)
            startActivity(intent)
        }

        val btn3 = findViewById<Button>(R.id.button33)
        btn3.setOnClickListener {
            val intent = Intent(this, Mba_room::class.java)
            startActivity(intent)
        }

        val btn4 = findViewById<Button>(R.id.button4)
        btn4.setOnClickListener {
            val intent = Intent(this, Nh_room::class.java)
            startActivity(intent)
        }

        val btn5 = findViewById<Button>(R.id.button5)
        btn5.setOnClickListener {
            val intent = Intent(this, Cahs_rooms::class.java)
            startActivity(intent)
        }

        val btn6 = findViewById<Button>(R.id.button6)
        btn6.setOnClickListener {
            val intent = Intent(this, Be::class.java)
            startActivity(intent)
        }
    }
}
