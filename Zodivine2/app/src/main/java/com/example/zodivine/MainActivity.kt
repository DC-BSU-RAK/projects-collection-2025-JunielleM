package com.example.zodivine

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHoroscope = findViewById<Button>(R.id.btnHoroscope)
        val btnLove = findViewById<Button>(R.id.btnLove)
        val btnPalm = findViewById<Button>(R.id.btnPalm)

        btnPalm.setOnClickListener {
            startActivity(Intent(this, PalmActivity::class.java))
        }

        btnHoroscope.setOnClickListener {
            startActivity(Intent(this, HoroscopeActivity::class.java))
        }

        btnLove.setOnClickListener {
            startActivity(Intent(this, LoveActivity::class.java))
        }

        // Zodiac sign button listeners
        findViewById<Button>(R.id.btnAries).setOnClickListener {
            showZodiacPopup("Aries ♈", "Bold and ambitious! Aries dives headfirst into every challenge.")
        }
        findViewById<Button>(R.id.btnTaurus).setOnClickListener {
            showZodiacPopup("Taurus ♉", "Grounded and graceful. You love luxury and loyalty!")
        }
        findViewById<Button>(R.id.btnGemini).setOnClickListener {
            showZodiacPopup("Gemini ♊", "Witty and curious, you’ve got a twin for every vibe!")
        }
        findViewById<Button>(R.id.btnCancer).setOnClickListener {
            showZodiacPopup("Cancer ♋", "Emotional and intuitive—your shell hides a soft heart 💖.")
        }
        findViewById<Button>(R.id.btnLeo).setOnClickListener {
            showZodiacPopup("Leo ♌", "Shine bright like the Sun! You’re bold, beautiful, and dramatic.")
        }
        findViewById<Button>(R.id.btnVirgo).setOnClickListener {
            showZodiacPopup("Virgo ♍", "Meticulous and kind. The zodiac’s perfectionist with a golden heart.")
        }
        findViewById<Button>(R.id.btnLibra).setOnClickListener {
            showZodiacPopup("Libra ♎", "Charming and balanced, you bring peace and aesthetic everywhere.")
        }
        findViewById<Button>(R.id.btnScorpio).setOnClickListener {
            showZodiacPopup("Scorpio ♏", "Mysterious and powerful—you love deeply and fiercely.")
        }
        findViewById<Button>(R.id.btnSagittarius).setOnClickListener {
            showZodiacPopup("Sagittarius ♐", "Adventure is your middle name! Wild, wise, and free.")
        }
        findViewById<Button>(R.id.btnCapricorn).setOnClickListener {
            showZodiacPopup("Capricorn ♑", "Ambitious mountain goat, climbing to success with style.")
        }
        findViewById<Button>(R.id.btnAquarius).setOnClickListener {
            showZodiacPopup("Aquarius ♒", "Rebel of the zodiac! Smart, quirky, and always ahead of the curve.")
        }
        findViewById<Button>(R.id.btnPisces).setOnClickListener {
            showZodiacPopup("Pisces ♓", "Dreamy and compassionate—your heart swims in deep waters 💫.")
        }
    }

    private fun showZodiacPopup(sign: String, message: String) {
        AlertDialog.Builder(this)
            .setTitle("$sign ✨")
            .setMessage(message)
            .setPositiveButton("Zodivine!", null)
            .show()
    }
}
