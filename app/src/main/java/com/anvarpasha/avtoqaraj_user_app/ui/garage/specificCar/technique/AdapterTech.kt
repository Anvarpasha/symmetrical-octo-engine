package com.anvarpasha.avtoqaraj_user_app.ui.garage.specificCar.technique

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_tech.view.*

class AdapterTech(private val allTechs : List<DataTech>) : RecyclerView.Adapter<AdapterTech.TechViewHolder>() {

    override fun getItemCount(): Int {
            return allTechs.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterTech.TechViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listitemTech =  inflater.inflate(R.layout.list_item_tech,parent,false)

        return AdapterTech.TechViewHolder(listitemTech)
    }

    override fun onBindViewHolder(holder: AdapterTech.TechViewHolder, position: Int) {
        val techfeatures = allTechs[position]

        holder.type.text = techfeatures.type
        holder.info.text = techfeatures.info
    }

    class TechViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
       var listitemTechs = itemView as CardView

        var type : TextView = listitemTechs.type
        var info : TextView = listitemTechs.info

    }




}