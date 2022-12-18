package dev.abdujabbor.sharedpreferences.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.abdujabbor.sharedpreferences.databinding.ItemListBinding

class Item_List : AppCompatActivity() {
    lateinit var binding:ItemListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ItemListBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}