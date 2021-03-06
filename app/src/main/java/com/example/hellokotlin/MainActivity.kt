package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var btnHello : Button //val 값이 정해진 변수 == final, const
        //btnHello = findViewById(R.id.btnHello)
        val btnHello = findViewById<Button>(R.id.btnHello)
        btnHello.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hello kotlin", Toast.LENGTH_LONG).show()
        }
    }
}