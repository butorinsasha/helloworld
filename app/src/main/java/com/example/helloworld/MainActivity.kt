package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(
            /* context = */ this,
            /* text = */    "Can you see me?",
            /* duration = */Toast.LENGTH_SHORT
        ).show()

        Log.d(this.localClassName, "Done creating the app")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun topClick(v: View) {
        Toast
            .makeText(this, "Top button clicked", Toast.LENGTH_SHORT)
            .show()
        Log.i(this.localClassName, "The user clicked the top button")
    }

    fun bottomClick(v: View) {
        Toast
            .makeText(this, "Bottom button clicked", Toast.LENGTH_LONG)
            .show()
        Log.i(this.localClassName, "The user clicked the bottom button")
    }
}