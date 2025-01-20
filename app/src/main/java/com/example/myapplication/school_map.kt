package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SchoolMap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_school_map)

        val viewmap: Button = findViewById(R.id.viewschoolmap)

        viewmap.setOnClickListener {

            val intent = Intent(this, SchoolMap2::class.java)
            startActivity(intent)
        }
        val backPageButton: Button = findViewById(R.id.backbtnmapsection)

        backPageButton.setOnClickListener {

            val intent1 = Intent(this, profile_page::class.java)
            startActivity(intent1)
        }
        val profilebuttonmapsec: Button = findViewById(R.id.profilebuttonmapsection)


        profilebuttonmapsec.setOnClickListener {

            val gotoprofilemapsec = Intent(this, profile_page::class.java)
            startActivity(gotoprofilemapsec)
        }
        val modalitybtnmapsec: Button = findViewById(R.id.modalitybtnmapsection)


        modalitybtnmapsec.setOnClickListener {

            val gotomodalitymapsec = Intent(this, modalityhelp::class.java)
            startActivity(gotomodalitymapsec)
        }
        val gotoscholarpage: Button = findViewById(R.id.scholarbtnmapsection)


        gotoscholarpage.setOnClickListener {

            val scholarsecmap= Intent(this, Scholarship::class.java)
            startActivity(scholarsecmap)
        }
    }
}

