package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Flexremotemoda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flexremotemoda)
        val gobacktomoda: Button = findViewById(R.id.backtomoda)


        gobacktomoda.setOnClickListener {

            val gotomoda2 = Intent(this, modalityhelp::class.java)
            startActivity(gotomoda2)
        }
        }
    }
