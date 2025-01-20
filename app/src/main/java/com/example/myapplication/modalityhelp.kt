package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class modalityhelp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_modalityhelp)
        val backtoprofmodasec: Button = findViewById(R.id.profilebuttonmodasec)


        backtoprofmodasec.setOnClickListener {

            val intentbacktoprofmodasec = Intent(this, profile_page::class.java)
            startActivity(intentbacktoprofmodasec)

        }
        val backtomapmodasec: Button = findViewById(R.id.mapbtnmodasec)


        backtomapmodasec.setOnClickListener {

            val intentbacktomapmodasec = Intent(this, SchoolMap::class.java)
            startActivity(intentbacktomapmodasec)

        }
        val remotemodality: Button = findViewById(R.id.remotemoda)


        remotemodality.setOnClickListener {

            val intentremotemodality = Intent(this, flexremotemoda2::class.java)
            startActivity(intentremotemodality)
        }
        val flexmodality: Button = findViewById(R.id.modalityflex)


        flexmodality.setOnClickListener {

            val gotoflexmoda= Intent(this, Flexremotemoda::class.java)
            startActivity(gotoflexmoda)
        }
        val gotoscholarmoda: Button = findViewById(R.id.scholarbtnmodasec)


        gotoscholarmoda.setOnClickListener {

            val gotoscholarmodasec= Intent(this, Scholarship::class.java)
            startActivity(gotoscholarmodasec)
        }
    }
}
