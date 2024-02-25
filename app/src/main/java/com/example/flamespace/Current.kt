package com.example.flamespace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Current : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current)

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        //val cancelButton = findViewById<Button>(R.id.cancel_doneButton)

        // Assuming you have a variable called reservationStatus which holds the status of the reservation
        // when (reservationStatus) {
        //     "approval_process" -> cancelButton.setText(R.string.cancel)
        //     "ended" -> cancelButton.setText(R.string.done)
        //     else -> {
        //         // Handle other cases if needed
        //     }
        // }
    }
}
