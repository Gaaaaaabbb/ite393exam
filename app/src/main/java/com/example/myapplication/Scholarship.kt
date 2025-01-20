package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Scholarship : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scholarship)
        val backtoprof: Button = findViewById(R.id.profilebuttonscholarsec)


        backtoprof.setOnClickListener {

            val backtoprofile= Intent(this,profile_page::class.java)
            startActivity(backtoprofile)
        }
        val backtomappage: Button = findViewById(R.id.mapbtnscholarsec)


        backtomappage.setOnClickListener {

            val backtomapsec= Intent(this, SchoolMap::class.java)
            startActivity(backtomapsec)
        }
        val backtomodapage: Button = findViewById(R.id.modalitybtnscholarsec)


        backtomodapage.setOnClickListener {

            val backtomodasec= Intent(this, modalityhelp::class.java)
            startActivity(backtomodasec)
        }

        }
    }
