package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class schoolmap3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_schoolmap3)
        val backtoprofmap3sec: Button = findViewById(R.id.profilebuttonmap3sec)


        backtoprofmap3sec.setOnClickListener {

            val intentbacktoprofmap3sec = Intent(this, profile_page::class.java)
            startActivity(intentbacktoprofmap3sec)

        }
        val backtomapmap3sec: Button = findViewById(R.id.mapbtnmap3sec)


        backtomapmap3sec.setOnClickListener {

            val intentbacktomapmap3sec = Intent(this, SchoolMap::class.java)
            startActivity(intentbacktomapmap3sec)

        }
        val prevmap3sec: Button = findViewById(R.id.prevmapsec3)

        prevmap3sec.setOnClickListener {

            val intentprevmap3sec = Intent(this, SchoolMap2::class.java)
            startActivity(intentprevmap3sec)

        }

        val modalitysection: Button = findViewById(R.id.modalitybtnmap3sec)

        modalitysection.setOnClickListener {

            val intentmodalitysection = Intent(this, modalityhelp::class.java)
            startActivity(intentmodalitysection)

        }
        val gotoscholarmap3: Button = findViewById(R.id.scholarbtnmap3sec)


        gotoscholarmap3.setOnClickListener {

            val scholarmap3sec= Intent(this, Scholarship::class.java)
            startActivity(scholarmap3sec)
        }
    }
}