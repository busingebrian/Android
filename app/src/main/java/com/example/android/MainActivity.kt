package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var buttonGoTo : Button
    private lateinit var nameTextView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGoTo = findViewById(R.id.button_go_to)
        nameTextView = findViewById(R.id.nameTextView)

        buttonGoTo.setOnClickListener {
            Intent(this@MainActivity, MenuAndToolBarActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}