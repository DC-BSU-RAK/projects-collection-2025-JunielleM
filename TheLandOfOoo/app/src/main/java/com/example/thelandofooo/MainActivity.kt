package com.example.thelandofooo

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var characterImage: ImageView
    private lateinit var weaponImage: ImageView
    private lateinit var resultText: TextView
    private lateinit var button: Button

    private val characters = listOf(
        R.drawable.finn, R.drawable.jake, R.drawable.iceking, R.drawable.princessbubblegum,
        R.drawable.ladyunicorn,  R.drawable.flameprincess, R.drawable.bmo, R.drawable.marceline
    )

    private val weapons = listOf(
        R.drawable.bmoblaster, R.drawable.bloodsword, R.drawable.icekingcrown,  R.drawable.stretch,
        R.drawable.electrodegun, R.drawable.guitar,  R.drawable.rainbowbeam,  R.drawable.flameprincess
    )

    private val messages = listOf(
        "You are brave!",
        "You are loyal!",
        "You are complex!",
        "You are smart!",
        "You are cool and powerful!",
        "You are quirky and clever!",
        "You are fiery and passionate!",
        "You are honest!",
        "You are spicy and reliable!",
        "You are dependent!"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        characterImage = findViewById(R.id.characterImage)
        weaponImage = findViewById(R.id.weaponImage)
        resultText = findViewById(R.id.resultText)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val randomCharacter = characters.random()
            val randomWeapon = weapons.random()
            val randomMessage = messages.random()

            characterImage.setImageResource(randomCharacter)
            weaponImage.setImageResource(randomWeapon)
            resultText.text = randomMessage
        }
    }
}
