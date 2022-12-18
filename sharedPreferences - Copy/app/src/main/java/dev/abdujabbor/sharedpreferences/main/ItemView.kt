package dev.abdujabbor.sharedpreferences.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.abdujabbor.sharedpreferences.R
import dev.abdujabbor.sharedpreferences.databinding.ActivityItemViewBinding

class ItemView : AppCompatActivity() {
    lateinit var bindingItemView: ActivityItemViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingItemView = ActivityItemViewBinding.inflate(layoutInflater)
        setContentView(bindingItemView.root)

        var name = intent.getStringExtra("key")
        var thing = intent.getStringExtra("keything")
        var order = intent.getStringExtra("keyorder")

        bindingItemView.edtFoodName.text = name
        bindingItemView.edtFoodThings.text = thing
        bindingItemView.edtFoodOrder.text = order

        finish()

    }
}