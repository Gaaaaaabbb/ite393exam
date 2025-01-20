package com.example.myapplication


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        val enterEmail: EditText = findViewById(R.id.enteremail)
        val enterPassword: EditText = findViewById(R.id.enterpassword)
        val loginButton: Button = findViewById(R.id.loginButton)


        val validEmails = listOf("03-1920-02023", "gaac.simon.up@phinmaed.com")
        val validPassword = "password123"

        loginButton.setOnClickListener {
            val email = enterEmail.text.toString().trim()
            val password = enterPassword.text.toString().trim()

            if (validEmails.contains(email) && password == validPassword) {

                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this, profile_page::class.java))
            } else {

                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
