package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val registerText = findViewById<TextView>(R.id.registerText)

        loginButton.setOnClickListener {
            Log.d("LoginActivity", "Login button clicked")
            Toast.makeText(this, "Login button clicked", Toast.LENGTH_SHORT).show()

            // Navigate to Chat List
            val intent = Intent(this, ChatListActivity::class.java)
            startActivity(intent)
        }

        registerText.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}