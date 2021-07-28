package com.example.dicerollerapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var rollButton : Button
    lateinit var imageDice : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)

        rollButton.setOnClickListener(){
            roll()
        }
    }

    fun roll(){
        var numberRandom : Int = Random.nextInt(6) + 1
        var imageRandom  = when(numberRandom){
            1  -> R.drawable.dice_1
            2  -> R.drawable.dice_2
            3  -> R.drawable.dice_3
            4  -> R.drawable.dice_4
            5  -> R.drawable.dice_5
            else  -> R.drawable.dice_6
        }
        imageDice = findViewById(R.id.imageDice)
        imageDice.setImageResource(imageRandom)
    }
}