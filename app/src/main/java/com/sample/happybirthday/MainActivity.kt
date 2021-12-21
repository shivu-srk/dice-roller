package com.sample.happybirthday

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Rolled!", Toast.LENGTH_SHORT).show()
            val result = findViewById<TextView>(R.id.textView)
            result.text = rollDice().toString()
        }
    }

    fun rollDice(): Int {
        return (1..6).random()
    }
}