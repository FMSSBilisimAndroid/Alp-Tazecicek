package com.alptazecicek.roll_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var image: ImageView
    private lateinit var image2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        image = findViewById(R.id.imageView)
        image2 = findViewById(R.id.imageView2)
        /**
         *The code snippet could be used down bellow. But i prefered to declare 'rollDice' function as puclic and set
         onClick method at 'activity_main.xml' file.

        button.setOnClickListener{
            rollDice()
        }
        */
    }
    fun rollDices(view: View) {
        val randomInt = Random.nextInt(6)+1  //firstDice random Int
        val randomInt2 = Random.nextInt(6)+1 //secondDice random Int
        //Changing image resource of first dice according to random integer.
        val drawableResource = when(randomInt) {
            1 -> R.drawable.ic_dice1
            2 -> R.drawable.ic_dice2
            3 -> R.drawable.ic_dice3
            4 -> R.drawable.ic_dice4
            5 -> R.drawable.ic_dice5
            else -> R.drawable.ic_dice6
        }
        //Changing image resource of second dice according to random integer.
        val drawableResource2 = when(randomInt2) {
            1 -> R.drawable.ic_dice1
            2 -> R.drawable.ic_dice2
            3 -> R.drawable.ic_dice3
            4 -> R.drawable.ic_dice4
            5 -> R.drawable.ic_dice5
            else -> R.drawable.ic_dice6
        }
        image.setImageResource(drawableResource) //Sets changes to View
        image2.setImageResource(drawableResource2) //Sets changes to View
    }
}