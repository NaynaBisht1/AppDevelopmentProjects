package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import java.util.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
//        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
//            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }


    }

    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6) + 1
//        resultText.text = "Dice Rolled !"
        resultText.text = randomInt.toString()
    }
}
