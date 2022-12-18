package dev.abdujabbor.phoneapp.phoneView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.phoneapp.databinding.ActivityMenuPhoneViewBinding

class MenuPhoneView : AppCompatActivity() {
    lateinit var binding: ActivityMenuPhoneViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuPhoneViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}