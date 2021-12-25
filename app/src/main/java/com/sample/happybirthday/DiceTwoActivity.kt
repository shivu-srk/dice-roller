package com.sample.happybirthday

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DiceTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_two)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val rollButton = findViewById<Button>(R.id.button3)
        val result1 = findViewById<ImageView>(R.id.dice1)
        val result2 = findViewById<ImageView>(R.id.dice2)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Rolled!", Toast.LENGTH_SHORT).show()
            val dice = DiceRoller()
            dice.resultImage(result1)
            dice.resultImage(result2)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}