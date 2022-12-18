package dev.abdujabbor.sharedpreferences.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.abdujabbor.sharedpreferences.MainActivity
import dev.abdujabbor.sharedpreferences.databinding.ActivityAddMeatBinding
import dev.abdujabbor.sharedpreferences.modes.SectionFood
import dev.abdujabbor.sharedpreferences.utils.MySharedPreferances

class AddMeat : AppCompatActivity() {
    lateinit var binding: ActivityAddMeatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddMeatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MySharedPreferances.init(this)

        val foodName = binding.edtFoodName.text.toString()
        binding.edtFoodName.setHint("Food Name")
        binding.edtFoodThings.setHint("Food Things")
        binding.edtFoodOrder.setHint("Food Order")


        binding.btnFoodSave.setOnClickListener {
            if (
                binding.edtFoodName.text.isNotEmpty()&&
                binding.edtFoodThings.text.isNotEmpty()&&
                binding.edtFoodOrder.text.isNotEmpty()

            ) {
                finish()
                var list = MySharedPreferances.catchList
                list.add(SectionFood(
                    binding.edtFoodName.text.toString(),
                    binding.edtFoodThings.text.toString(),
                    binding.edtFoodOrder.text.toString()
                ))
                MySharedPreferances.catchList = list
            }else{
                Toast.makeText(this, "Complete your Data", Toast.LENGTH_SHORT).show()
            }
    }

    }
}