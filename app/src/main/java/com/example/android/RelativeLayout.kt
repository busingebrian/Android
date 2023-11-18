package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RelativeLayout : AppCompatActivity() {
    private lateinit var loginButton: Button
    private lateinit var signUpCLButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        loginButton = findViewById(R.id.relative_layout_button)
        signUpCLButton = findViewById(R.id.relative_layout_signup)

        loginButton.setOnClickListener {
            Intent(this@RelativeLayout, NestedScrollView::class.java).also {
                startActivity(it)
            }
        }
signUpCLButton.setOnClickListener {
    Intent(this@RelativeLayout, ConstraintLayout::class.java).also {
        startActivity(it)
    }
}

    }
}