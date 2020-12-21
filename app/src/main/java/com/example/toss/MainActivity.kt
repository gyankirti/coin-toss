package com.example.toss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.toss_button)


        btn.setOnClickListener{
            tosscoin()
        }

    }
    private fun tosscoin(){
        val coin_image = findViewById<ImageView>(R.id.imageView)

        val randomInt = Random.nextInt(2)+1

        val randomImg=when(randomInt){
            1->R.drawable.heads
            2->R.drawable.tails
            else->R.drawable.front

        }
        coin_image.setImageResource(randomImg)
        when(randomInt){
            1-> Toast.makeText(applicationContext,"YAY! you got Heads", Toast.LENGTH_SHORT).show()
            2->Toast.makeText(applicationContext,"YAY! you got TAILS ",Toast.LENGTH_SHORT).show()
        }

    }

}
