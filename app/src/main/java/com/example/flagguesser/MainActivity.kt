package com.example.flagguesser

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var topButton: Button
    lateinit var midButton: Button
    lateinit var botButton: Button

    var flags = mutableListOf<String>("Estonia", "France", "Germany", "Ireland", "Italy", "Monaco", "Nigeria", "Poland", "Russia", "Spain", "UK", "US")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topButton = findViewById(R.id.top_button)
        midButton = findViewById(R.id.mid_button)
        botButton = findViewById(R.id.bot_button)

        startGame()
    }

    private fun startGame() {
        // Shuffle list of flags
        flags.shuffle()

        // Access first 3 countries
        val topCountry = flags[0]
        val midCountry = flags[1]
        val botCountry = flags[2]

        // Set drawables
        val topFlag = when (topCountry) {
            "Estonia" -> getDrawable(R.drawable.estonia)
            "France" -> getDrawable(R.drawable.france)
            "Germany" -> getDrawable(R.drawable.germany)
            "Ireland" -> getDrawable(R.drawable.ireland)
            "Italy" -> getDrawable(R.drawable.italy)
            "Monaco" -> getDrawable(R.drawable.monaco)
            "Nigeria" -> getDrawable(R.drawable.nigeria)
            "Poland" -> getDrawable(R.drawable.poland)
            "Russia" -> getDrawable(R.drawable.russia)
            "Spain" -> getDrawable(R.drawable.spain)
            "UK" -> getDrawable(R.drawable.uk)
            else -> getDrawable(R.drawable.us)
        }
        val midFlag = when (midCountry) {
            "Estonia" -> getDrawable(R.drawable.estonia)
            "France" -> getDrawable(R.drawable.france)
            "Germany" -> getDrawable(R.drawable.germany)
            "Ireland" -> getDrawable(R.drawable.ireland)
            "Italy" -> getDrawable(R.drawable.italy)
            "Monaco" -> getDrawable(R.drawable.monaco)
            "Nigeria" -> getDrawable(R.drawable.nigeria)
            "Poland" -> getDrawable(R.drawable.poland)
            "Russia" -> getDrawable(R.drawable.russia)
            "Spain" -> getDrawable(R.drawable.spain)
            "UK" -> getDrawable(R.drawable.uk)
            else -> getDrawable(R.drawable.us)
        }

        val botFlag = when (botCountry) {
            "Estonia" -> getDrawable(R.drawable.estonia)
            "France" -> getDrawable(R.drawable.france)
            "Germany" -> getDrawable(R.drawable.germany)
            "Ireland" -> getDrawable(R.drawable.ireland)
            "Italy" -> getDrawable(R.drawable.italy)
            "Monaco" -> getDrawable(R.drawable.monaco)
            "Nigeria" -> getDrawable(R.drawable.nigeria)
            "Poland" -> getDrawable(R.drawable.poland)
            "Russia" -> getDrawable(R.drawable.russia)
            "Spain" -> getDrawable(R.drawable.spain)
            "UK" -> getDrawable(R.drawable.uk)
            else -> getDrawable(R.drawable.us)
        }

        // Set backgrounds
        topButton.background = topFlag
        midButton.background = midFlag
        botButton.background = botFlag


    }
}
