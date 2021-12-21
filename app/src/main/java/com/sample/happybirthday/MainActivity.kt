package com.sample.happybirthday

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.button)
        val result = findViewById<ImageView>(R.id.imageView)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Rolled!", Toast.LENGTH_SHORT).show()
            val dice = rollDice()
            when (dice) {
                1 -> result.setImageResource(R.drawable.dice_1)
                2 -> result.setImageResource(R.drawable.dice_2)
                3 -> result.setImageResource(R.drawable.dice_3)
                4 -> result.setImageResource(R.drawable.dice_4)
                5 -> result.setImageResource(R.drawable.dice_5)
                6 -> result.setImageResource(R.drawable.dice_6)
            }
        }
    }

    private fun rollDice(): Int {
        return (1..6).random()
    }
}