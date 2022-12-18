package dev.abdujabbor.sharedpreferences.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ListView
import android.widget.Toast
import dev.abdujabbor.sharedpreferences.databinding.ActivityMenusBinding
import dev.abdujabbor.sharedpreferences.modes.MySectionAdapter
import dev.abdujabbor.sharedpreferences.modes.SectionFood
import dev.abdujabbor.sharedpreferences.utils.MySharedPreferances

class Menus : AppCompatActivity() {
    lateinit var mySectionAdapter: MySectionAdapter
    private lateinit var binding: ActivityMenusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MySharedPreferances.init(this)

        try {


            mySectionAdapter = MySectionAdapter(this, MySharedPreferances.catchList)
            binding.myLinear.adapter = mySectionAdapter


            binding.myLinear.setOnItemClickListener { view, _, position, _ ->

            val intent = Intent(this,ItemView::class.java)
                intent.putExtra("key",MySharedPreferances.catchList[position].sectionName)
                intent.putExtra("keything",MySharedPreferances.catchList[position].sectionThing)
                intent.putExtra("keyorder",MySharedPreferances.catchList[position].sectionOrder)
                Toast.makeText(this, MySharedPreferances.catchList[position].sectionThing.toString(), Toast.LENGTH_SHORT).show()
                startActivity(intent)


            }


        } catch (e: java.lang.Exception) {

        }


    }

}
