package com.example.switchactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextBtn = findViewById<Button>(R.id.btnNext)
        nextBtn.setOnClickListener {
            val Intent = Intent(this, ActivitySecond::class.java)
            startActivity((Intent))
        }

    }
}