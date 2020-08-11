package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image_two)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton : Button = findViewById(R.id.count_button)

        rollButton.setOnClickListener { rollDice() }
        //countButton.setOnClickListener { countUp() }

    }

    private fun rollDice() {

        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())

    }

    private fun getRandomDiceImage(): Int{
        var randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    /*private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Roll"){
            resultText.text = "1"
            Toast.makeText(this, "Counted!", Toast.LENGTH_SHORT).show()
        } else {
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
                Toast.makeText(this, "Counted!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Can't Count!!", Toast.LENGTH_SHORT).show()
            }
        }
    }*/

}