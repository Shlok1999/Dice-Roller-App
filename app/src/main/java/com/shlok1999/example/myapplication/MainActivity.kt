package com.shlok1999.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImg: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        diceImg = findViewById(R.id.dice_image)





    }

    fun rollDice(view: View) {
        val randInt= Random.nextInt(6)+1
        val anim: Animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
//        val diceImg: ImageView = findViewById(R.id.dice_image)
        diceImg.startAnimation(anim)

        val drawableResource = when (randInt) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }

        diceImg.setImageResource(drawableResource)



    }
}