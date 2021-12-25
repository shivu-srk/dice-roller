package com.sample.happybirthday

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DiceOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_one)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val rollButton = findViewById<Button>(R.id.button)
        val result = findViewById<ImageView>(R.id.imageView)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Rolled!", Toast.LENGTH_SHORT).show()
            val dice = DiceRoller()
            dice.resultImage(result)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}