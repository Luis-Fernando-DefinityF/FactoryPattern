package com.example.factorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var generateRoll: Button
    private lateinit var generateSliceBread: Button
    private lateinit var generateBaguette: Button

    private val breadFactory: BreadFactory = BreadFactory()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generateRoll = findViewById(R.id.button)
        generateSliceBread = findViewById(R.id.button3)
        generateBaguette = findViewById(R.id.button2)

        generateRoll.setOnClickListener{
            AlertDialog.Builder(this).setMessage("Bread Type: " + breadFactory.getBread(BreadType.ROLL).name())
                .setCancelable(true).show()
        }

        generateBaguette.setOnClickListener{
            AlertDialog.Builder(this).setMessage("Bread Type: " + breadFactory.getBread(BreadType.BAGUETTE).name())
                .setCancelable(true).show()
        }

        generateSliceBread.setOnClickListener {
            AlertDialog.Builder(this).setMessage("Bread Type: " + breadFactory.getBread(BreadType.SLICE_BREAD).name())
                .setCancelable(true).show()
        }

    }
}