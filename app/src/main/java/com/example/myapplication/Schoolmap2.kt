package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SchoolMap2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_schoolmap2)


        val nextPageButton: Button = findViewById(R.id.schoolmapnext)


        nextPageButton.setOnClickListener {

            val intent = Intent(this, schoolmap3::class.java)
            startActivity(intent)
        }
        val backtomap: Button = findViewById(R.id.schoolmapprev)


        backtomap.setOnClickListener {

            val intentschoolmapprev = Intent(this, SchoolMap::class.java)
            startActivity(intentschoolmapprev)
        }
    }
}
