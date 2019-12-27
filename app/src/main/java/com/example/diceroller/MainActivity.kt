package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.R.id.add
//import com.example.diceroller.R.id.resultText
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var showImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

//        val rollC:Button = findViewById(R.id.count_up)
//        rollC.setOnClickListener{addUp()}
    }

    private fun rollDice(){
        //Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
        val randomInt = Random.nextInt(6)+1
        this.showImage= findViewById(R.id.resultImage)
        val draw=when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6

        }
        showImage.setImageResource(draw)
       // showImage.im=randomInt.toString()
    }

    private fun addUp(){
//        val addi:TextView = findViewById(resultText)
//        if (addi.text=="Hello World!") {
//            addi.text="1"
//        }
//        else{
//            var nT = addi.text.toString().toInt()
//            if(nT<6){
//                nT++
//                addi.text = nT.toString()
//            }
//        }
    }
}
