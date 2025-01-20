package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class flexremotemoda2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flexremotemoda2)
        val flexmodaback: Button = findViewById(R.id.flexmodaback)


        flexmodaback.setOnClickListener {

            val backtomoda= Intent(this, modalityhelp::class.java)
            startActivity(backtomoda)
        }

        }
    }
