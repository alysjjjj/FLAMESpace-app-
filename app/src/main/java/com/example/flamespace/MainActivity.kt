package com.example.flamespace

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.flamespace.R.id.mainLogin
import com.example.flamespace.R.id.mainSignup

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(mainLogin)
        buttonClick.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        val btn = findViewById<Button>(mainSignup)
        btn.setOnClickListener {
            val intent = Intent(this, Sign_up::class.java)
            startActivity(intent)
        }
    }
}