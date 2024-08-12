package com.example.headsortails

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val spinButton = findViewById<Button>(R.id.spinBtn)
        val headsResult = findViewById<TextView>(R.id.headsResult)
        val tailsResult = findViewById<TextView>(R.id.tailsResult)
        val headsImage = findViewById<ImageView>(R.id.headsImage)

        var headsResultInt = 0      // Heads result counter
        var tailsResultInt = 0      // Tails result counter

        spinButton.setOnClickListener{
            val isHeads = Random.nextBoolean()

            if (isHeads) {
                headsImage.setImageResource(R.drawable.heads)
                headsResultInt += 1
                headsResult.text = headsResultInt.toString()
            } else {
                headsImage.setImageResource(R.drawable.tails)
                tailsResultInt += 1
                tailsResult.text = tailsResultInt.toString()
            }
        }
        }
    }