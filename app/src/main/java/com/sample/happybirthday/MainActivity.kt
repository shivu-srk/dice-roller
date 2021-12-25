package com.sample.happybirthday

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceOne = findViewById<Button>(R.id.button)
        val diceTwo = findViewById<Button>(R.id.button2)
        diceOne.setOnClickListener {
            val intent = Intent(this,DiceOneActivity::class.java)
            startActivity(intent)
        }
        diceTwo.setOnClickListener {
            val intent = Intent(this,DiceTwoActivity::class.java)
            startActivity(intent)
        }
    }
}