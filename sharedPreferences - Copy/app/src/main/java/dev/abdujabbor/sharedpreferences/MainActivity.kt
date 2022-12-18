package dev.abdujabbor.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.sharedpreferences.main.AddMeat
import dev.abdujabbor.sharedpreferences.main.Menus
import dev.abdujabbor.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menus.setOnClickListener {
            val intent = Intent(this,Menus::class.java)
            startActivity(intent)
        }
        binding.addFood.setOnClickListener {
            val intent = Intent(this,AddMeat::class.java)
            startActivity(intent)
        }
    }
}