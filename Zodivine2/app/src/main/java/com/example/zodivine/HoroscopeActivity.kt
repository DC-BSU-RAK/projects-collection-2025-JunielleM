package com.example.zodivine

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HoroscopeActivity : AppCompatActivity() {

    private val horoscopes = listOf(
        "✨ A new cosmic chapter is unfolding for you!",
        "🌙 Trust your intuition today — it's a celestial compass.",
        "🔥 Passion is igniting in unexpected ways. Lean in!",
        "💫 The stars say: it’s time to believe in your magic.",
        "🌟 A wish you've made is aligning with the universe.",
        "🪐 Cosmic clarity is coming. Be still and listen.",
        "💖 Love glows brighter under today’s skies.",
        "🌈 Joy is orbiting around you — reach out!",
        "🌞 You’re radiant. The world sees your light.",
        "🔮 Destiny is whispering. Are you paying attention?",
        "☀️ Confidence is your secret spell today.",
        "🌸 Breathe in calm, exhale cosmic clutter."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horoscope)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnGenerate = findViewById<Button>(R.id.btnGenerateHoroscope)
        val horoscopeText = findViewById<TextView>(R.id.horoscopeInfoText)

        btnBack.setOnClickListener {
            finish()
        }

        btnGenerate.setOnClickListener {
            val randomMessage = horoscopes.random()
            horoscopeText.text = randomMessage
        }
    }
}
