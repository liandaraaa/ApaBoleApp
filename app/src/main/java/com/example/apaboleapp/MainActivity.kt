package com.example.apaboleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTest = findViewById<Button>(R.id.btnTest)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnTest.setOnClickListener {
            val solution = ApaBoleSolution()
            tvResult.text = solution.printApaBole(100)

            Log.d("apabole", solution.printApaBole(100))
        }
    }
}