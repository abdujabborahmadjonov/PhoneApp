package dev.abdujabbor.phoneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.phoneapp.databinding.ActivityMainBinding
import dev.abdujabbor.phoneapp.phoneView.AddPhoneView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addPhone.setOnClickListener {
            val intent = Intent(this,AddPhoneView::class.java)
            startActivity(intent)
        }

    }
}