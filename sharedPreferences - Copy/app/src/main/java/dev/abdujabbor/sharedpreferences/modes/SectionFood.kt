package dev.abdujabbor.sharedpreferences.modes

data class SectionFood(var sectionName:String,var sectionThing:String,var sectionOrder:String){

    override fun toString(): String {
        return "$sectionName"
    }
}
