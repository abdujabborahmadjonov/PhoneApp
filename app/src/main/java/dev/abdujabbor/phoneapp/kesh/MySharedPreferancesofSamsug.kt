package dev.abdujabbor.phoneapp.kesh

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.abdujabbor.phoneapp.models.MyPhone

object MySharedPreferancesofSamsug {


    private const val NAME = "Android10"
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

    var catchListofSamsung:ArrayList<MyPhone>
        get() = gsonStringToArray(preferences.getString("keyList","[]")!!)
        set(value) = preferences.edit{
            if (value!=null){
                it.putString("keyList", arrayListToGsonString(value))
            }
        }

    fun arrayListToGsonString(list:ArrayList<MyPhone>):String{
        val gson = Gson()
        return gson.toJson(list)
    }

    fun gsonStringToArray(str:String):ArrayList<MyPhone>{
        val gson = Gson()
        val type = object :TypeToken<ArrayList<MyPhone>>(){}.type
        return gson.fromJson(str,type)
    }
}