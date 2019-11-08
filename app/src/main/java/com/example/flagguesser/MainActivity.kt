package com.example.flagguesser

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var topButton: Button
    lateinit var midButton: Button
    lateinit var botButton: Button
    lateinit var countryText: TextView
    lateinit var scoreText: TextView

    var score = 0
    var flags = mutableListOf<String>("Estonia", "France", "Germany", "Ireland", "Italy", "Monaco", "Nigeria", "Poland", "Russia", "Spain", "UK", "US")

    // Access first 3 countries
    val topCountry = flags[0]
    val midCountry = flags[1]
    val botCountry = flags[2]

    // Set the provided country
    val randomNum = Random.nextInt(0,3)
    val givenCountry = flags[randomNum]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topButton = findViewById(R.id.top_button)
        midButton = findViewById(R.id.mid_button)
        botButton = findViewById(R.id.bot_button)
        countryText = findViewById(R.id.provided_text_view)
        scoreText = findViewById(R.id.score_view)

        startGame()

        topButton.setOnClickListener {
            if (givenCountry == topCountry) {
                incrementScore()
            } else {
                decrementScore()
            }
        }

        midButton.setOnClickListener {
            if (givenCountry == midCountry) {
                incrementScore()
            } else {
                decrementScore()
            }
        }

        botButton.setOnClickListener {
            if (givenCountry == botCountry) {
                incrementScore()
            } else {
                decrementScore()
            }
        }

    }

    private fun startGame() {
        // Shuffle list of flags
        flags.shuffle()

        // Show provided country
        countryText.text = getString(R.string.provided_string, givenCountry)


        // Set score text
        scoreText.text = getString(R.string.score_string, score)

        // Set drawables
        val topFlag = setDrawable(topCountry)
        val midFlag = setDrawable(midCountry)
        val botFlag = setDrawable(botCountry)

        // Set backgrounds
        topButton.background = topFlag
        midButton.background = midFlag
        botButton.background = botFlag


    }

    private fun incrementScore() {
        score += 1
        startGame()
    }

    private fun decrementScore() {
        score -= 1
        startGame()
    }

    private fun setDrawable(country: String): Drawable {
        val flag = when (country) {
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

        return flag!!
    }
}
