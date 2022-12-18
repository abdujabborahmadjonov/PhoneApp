package dev.abdujabbor.sharedpreferences.modes

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import dev.abdujabbor.sharedpreferences.R
import dev.abdujabbor.sharedpreferences.databinding.ItemListBinding
import dev.abdujabbor.sharedpreferences.utils.MySharedPreferances

class MySectionAdapter(context: Context,val list:ArrayList<SectionFood>)
    :ArrayAdapter<SectionFood>(context, R.layout.item_list,list)
{
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        itemView.tvName.text = list[position].sectionName
        return itemView.root
    }
}
