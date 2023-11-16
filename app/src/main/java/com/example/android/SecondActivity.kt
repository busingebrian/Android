package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.sample_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.item1 -> {
                 Toast.makeText(this@SecondActivity, "Item 1 clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.item2  -> {
                Toast.makeText(this@SecondActivity, "Item 2 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item3  -> {
                Toast.makeText(this@SecondActivity, "Item 3 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_sub_item_1  -> {
                Toast.makeText(this@SecondActivity, "sub Item 1 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_sub_item_2  -> {
                Toast.makeText(this@SecondActivity, "sub Item 2 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }
}