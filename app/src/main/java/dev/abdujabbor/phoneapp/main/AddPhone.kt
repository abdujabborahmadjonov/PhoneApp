package dev.abdujabbor.phoneapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.phoneapp.R
import dev.abdujabbor.phoneapp.databinding.ActivityAddPhoneBinding

class AddPhone : AppCompatActivity() {
    lateinit var binding: ActivityAddPhoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        

    }
}