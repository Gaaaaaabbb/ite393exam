package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val startpage: ImageView = findViewById(R.id.pucu_logo)
        startpage.setOnClickListener {
            val pucuenter = Intent(this, LoginPage::class.java)
            startActivity(pucuenter)
        }
    }
}
