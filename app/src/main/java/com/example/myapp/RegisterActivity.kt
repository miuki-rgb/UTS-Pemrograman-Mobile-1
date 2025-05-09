package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerButton = findViewById<Button>(R.id.registerButton)
        val loginText = findViewById<TextView>(R.id.loginText)

        registerButton.setOnClickListener {
            Log.d("RegisterActivity", "Register button clicked")
            Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()

            // Navigate to Login after registration
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        loginText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}