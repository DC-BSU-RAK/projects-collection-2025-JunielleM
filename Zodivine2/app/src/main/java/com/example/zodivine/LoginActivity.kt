package com.example.zodivine

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.zodivine.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        showWelcomePopup()  // Show popup on activity start

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            // Add actual login validation here if needed
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun showWelcomePopup() {
        AlertDialog.Builder(this)
            .setTitle("Welcome to Zodivine ✨")
            .setMessage("Discover insights and tips about your zodiac signs. Please log in to continue.")
            .setPositiveButton("OK", null)
            .show()
    }
}
