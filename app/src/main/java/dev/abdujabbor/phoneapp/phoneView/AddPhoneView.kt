package dev.abdujabbor.phoneapp.phoneView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.phoneapp.addPhoneMenuPackage.AddSamsung
import dev.abdujabbor.phoneapp.databinding.ActivityAddPhoneViewBinding


class AddPhoneView : AppCompatActivity() {
    lateinit var binding: ActivityAddPhoneViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPhoneViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.samsung.setOnClickListener{
            val  intent = Intent(this@AddPhoneView, AddSamsung::class.java)
            startActivity(intent)
        }
    }
}