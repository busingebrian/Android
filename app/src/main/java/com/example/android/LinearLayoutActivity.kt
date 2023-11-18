package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class LinearLayoutActivity : AppCompatActivity() {
    private lateinit var nextButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
        nextButton = findViewById(R.id.next_button_linear)

        nextButton.setOnClickListener {
            Intent(this@LinearLayoutActivity, RelativeLayout::class.java).also {
                startActivity(it)
            }
        }
    }
}