package com.example.zodivine

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView // ✅ Needed for the love result TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoveActivity : AppCompatActivity() {

    // ✅ Add a list of fun zodiac love matches
    private val loveMatches = listOf(
        "Aries ♈️ + Leo ♌️ = 92% 🔥 Explosive passion and adventure!",
        "Taurus ♉️ + Virgo ♍️ = 88% 🌿 Built on trust and harmony.",
        "Gemini ♊️ + Libra ♎️ = 85% 💬 Flirty and full of charm.",
        "Cancer ♋️ + Pisces ♓️ = 90% 🌊 Emotional soulmates.",
        "Leo ♌️ + Sagittarius ♐️ = 89% 🌟 Two stars shining bright.",
        "Virgo ♍️ + Capricorn ♑️ = 86% 📈 Grounded power duo.",
        "Libra ♎️ + Aquarius ♒️ = 82% 🧠 Brainy lovebirds.",
        "Scorpio ♏️ + Cancer ♋️ = 91% 💞 Deeply bonded hearts.",
        "Sagittarius ♐️ + Aries ♈️ = 87% 🏹 Wild and free spirits.",
        "Capricorn ♑️ + Taurus ♉️ = 89% 💼 A love built to last.",
        "Aquarius ♒️ + Gemini ♊️ = 84% 🌬️ Curious and clever minds.",
        "Pisces ♓️ + Scorpio ♏️ = 93% 🌀 Magical emotional fusion!"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_love)

        val rootView = findViewById<View>(R.id.love)
        rootView?.let {
            ViewCompat.setOnApplyWindowInsetsListener(it) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        // ✅ Find the new views
        val btnGenerateLove = findViewById<Button>(R.id.btnGenerateLove)
        val tvLoveResult = findViewById<TextView>(R.id.tvLoveResult)

        // ✅ Generate and display a random match
        btnGenerateLove.setOnClickListener {
            val match = loveMatches.random()
            tvLoveResult.text = match
        }
    }
}
