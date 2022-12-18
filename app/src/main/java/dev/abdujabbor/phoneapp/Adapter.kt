package dev.abdujabbor.phoneapp


import ItemList
import android.annotation.SuppressLint
import android.content.Context
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import dev.abdujabbor.phoneapp.databinding.ItemListBinding
import dev.abdujabbor.phoneapp.models.MyPhone


class MySectionAdapter(context: Context,val list:ArrayList<MyPhone>)
    :ArrayAdapter<MyPhone>(context, R.layout.item_list,list)
{
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        itemView.tvName.text = list[position].name
        return itemView.root
    }
}

