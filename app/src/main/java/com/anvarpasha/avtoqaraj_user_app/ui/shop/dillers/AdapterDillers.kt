package com.anvarpasha.avtoqaraj_user_app.ui.shop.dillers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_dillers.view.*

class AdapterDillers(private val dilers : List<Datadillers>) : RecyclerView.Adapter<AdapterDillers.DillersViewHolder>() {

    override fun getItemCount(): Int {
       return dilers.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DillersViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var listItemdilers = inflater.inflate(R.layout.list_item_dillers,parent,false)

        return DillersViewHolder(listItemdilers)
    }

    override fun onBindViewHolder(holder: DillersViewHolder, position: Int) {
        var Alldilers = dilers[position]

        holder.dilerMap.setImageResource(Alldilers.map)
        holder.dilerIcon.setImageResource(Alldilers.logo)
        holder.dilerName.text = Alldilers.dillerName
        holder.workhours.text = Alldilers.workHours
    }

     class  DillersViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
         var listItemDiler = itemView as CardView

         var dilerMap : ImageView = listItemDiler.map
         var dilerIcon : ImageView = listItemDiler.dilericon
         var dilerName: TextView = listItemDiler.dilerName
         var workhours : TextView = listItemDiler.workHours

     }

}