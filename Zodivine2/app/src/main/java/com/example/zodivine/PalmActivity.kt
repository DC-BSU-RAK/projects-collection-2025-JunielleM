package com.example.zodivine

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class PalmActivity : AppCompatActivity() {

    private val palmReadings = listOf(
        "✨ Your heart line shows deep compassion — you love with your whole soul.",
        "🔮 Your life line is long and bold — you have a powerful destiny ahead.",
        "🌙 Your fate line suggests you're guided by intuition and cosmic energy.",
        "🔥 A strong head line means you're a natural leader with big ideas!",
        "🌿 Your palm reveals balance — you're in tune with both earth and spirit.",
        "💫 Your mounts are vibrant — expect fortune, creativity, and charisma!",
        "🌊 You’re a dreamer with a rich emotional world — don’t ignore your visions.",

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palm)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnGenerate = findViewById<Button>(R.id.btnGeneratePalm)
        val txtPalmInfo = findViewById<TextView>(R.id.palmInfoText)

        btnBack.setOnClickListener {
            finish()
        }

        btnGenerate.setOnClickListener {
            val message = palmReadings.random()
            txtPalmInfo.text = message
        }
    }
}
