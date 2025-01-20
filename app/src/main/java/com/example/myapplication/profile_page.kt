package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class profile_page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_page)

            val mapsection: Button = findViewById(R.id.mapbtn1)


            mapsection.setOnClickListener {

                val gotomap = Intent(this, SchoolMap::class.java)
                startActivity(gotomap)
            }
        val gotomodality: Button = findViewById(R.id.modalitybtnprofilesection)


        gotomodality.setOnClickListener {

            val intent = Intent(this, modalityhelp::class.java)
            startActivity(intent)
        }
        val gotoscholar: Button = findViewById(R.id.scholarbtnprofilesection)


        gotoscholar.setOnClickListener {

            val scholarpage= Intent(this, Scholarship::class.java)
            startActivity(scholarpage)
        }
        }
    }
