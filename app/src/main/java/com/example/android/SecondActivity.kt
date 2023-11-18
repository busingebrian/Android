package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class SecondActivity : AppCompatActivity() {
    private lateinit var nextButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val toolbar : Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        nextButton = findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            Intent(this@SecondActivity, ThirdActivity::class.java).also {
                startActivity(it)
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.sample_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> {
                Toast.makeText(this@SecondActivity, "Item 1 clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.item2 -> {
                Toast.makeText(this@SecondActivity, "Item 2 clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.item3 -> {
                Toast.makeText(this@SecondActivity, "Item 3 clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menu_sub_item_1 -> {
                Toast.makeText(this@SecondActivity, "sub Item 1 clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menu_sub_item_2 -> {
                Toast.makeText(this@SecondActivity, "sub Item 2 clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }
}