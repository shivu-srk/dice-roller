package com.sample.happybirthday

import android.widget.ImageView

class DiceRoller {
     private fun rollDice(): Int {
        return (1..6).random()
    }

     fun resultImage(view: ImageView) {
        when (rollDice()) {
            1 -> view.setImageResource(R.drawable.dice_1)
            2 -> view.setImageResource(R.drawable.dice_2)
            3 -> view.setImageResource(R.drawable.dice_3)
            4 -> view.setImageResource(R.drawable.dice_4)
            5 -> view.setImageResource(R.drawable.dice_5)
            6 -> view.setImageResource(R.drawable.dice_6)
        }
    }
}