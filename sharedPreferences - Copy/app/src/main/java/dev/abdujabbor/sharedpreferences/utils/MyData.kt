package dev.abdujabbor.sharedpreferences.utils

import android.service.autofill.UserData
import dev.abdujabbor.sharedpreferences.modes.SectionFood

object MyData {
var list = mutableListOf<SectionFood>()

    fun addlist(){
        for ( i in 0..20){
            list.add(SectionFood("olma","i",""))
        }
    }
}