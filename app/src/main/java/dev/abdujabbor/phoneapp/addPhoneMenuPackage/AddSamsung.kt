package dev.abdujabbor.phoneapp.addPhoneMenuPackage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.phoneapp.databinding.ActivityAddSamsungBinding
import dev.abdujabbor.phoneapp.kesh.MySharedPreferancesofSamsug
import dev.abdujabbor.phoneapp.models.MyPhone


class AddSamsung : AppCompatActivity() {
    lateinit var binding: ActivityAddSamsungBinding
    lateinit var list:ArrayList<MyPhone>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddSamsungBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list  = MySharedPreferancesofSamsug.catchListofSamsung



    }
}