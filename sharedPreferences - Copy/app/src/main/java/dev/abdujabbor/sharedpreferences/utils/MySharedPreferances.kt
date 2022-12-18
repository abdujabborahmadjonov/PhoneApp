package dev.abdujabbor.sharedpreferences.utils

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.abdujabbor.sharedpreferences.modes.SectionFood

object MySharedPreferances {

    private const val NAME = "Android2"
    private const val MODE = Context.MODE_PRIVATE

    private lateinit var preferences: SharedPreferences

    fun init(context: Context){
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation:(SharedPreferences.Editor) -> Unit){
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var myName:String?
        get() = preferences.getString("count", "")
        set(value) = preferences.edit{
            if (value!=null){
                it.putString("count", value)
            }
        }

    var catchList:ArrayList<SectionFood>
        get() = gsonStringToArray(preferences.getString("keyList","[]")!!)
        set(value) = preferences.edit{
            if (value!=null){
                it.putString("keyList", arrayListToGsonString(value))
            }
        }

    fun arrayListToGsonString(list:ArrayList<SectionFood>):String{
        val gson = Gson()
        return gson.toJson(list)
    }

    fun gsonStringToArray(str:String):ArrayList<SectionFood>{
        val gson = Gson()
        val type = object :TypeToken<ArrayList<SectionFood>>(){}.type
        return gson.fromJson(str,type)
    }
}