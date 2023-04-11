package com.example.slove_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

        val easy1=findViewById<Button>(R.id.easy)
        val midim=findViewById<Button>(R.id.intermediat)
        val hard=findViewById<Button>(R.id.hard)
        hard.setOnClickListener {
           val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        midim.setOnClickListener {
            val intent=Intent(this,midium::class.java)
            startActivity(intent)
        }
        easy1.setOnClickListener {
            val intent=Intent(this,easy::class.java)
            startActivity(intent)
        }
    }
}