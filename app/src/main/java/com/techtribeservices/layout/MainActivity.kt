package com.techtribeservices.layout

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var myText: TextView
    lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        myText = findViewById(R.id.title)
        myText.setTextColor(Color.BLACK)
        myText.setText("This is a title")
        myText.setOnClickListener {
            myText.setTextColor(Color.RED)
        }

        myButton = findViewById(R.id.button)
        myButton.setOnClickListener {
            myText.setTextColor(Color.GREEN)
            myText.setText("Thank you")
        }
    }
}