package com.anvarpasha.avtoqaraj_user_app.ui.garage.newmark

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.garage.AdapterGarage
import kotlinx.android.synthetic.main.list_item_addedmark.view.*

class AdapterAddedMark(private val addedMark : List<DataaddedMark>) : RecyclerView.Adapter<AdapterAddedMark.AddedMarkViewHolder>(){
    override fun getItemCount(): Int {
        return addedMark.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AddedMarkViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listItemAddedMark =  inflater.inflate(R.layout.list_item_addedmark,parent,false)

        return AddedMarkViewHolder(listItemAddedMark)
    }

    override fun onBindViewHolder(holder: AddedMarkViewHolder, position: Int) {
        val addedMarks = addedMark[position]

        holder.vehicleIcon.setImageResource(addedMarks.vehicleIcon)
        holder.vehicleName.text = addedMarks.vehicleType

    }



    class AddedMarkViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var listItemAddedMark = itemView as CardView

        var vehicleIcon : ImageView = listItemAddedMark.vehicleIcon
        var vehicleName : TextView = listItemAddedMark.vehicleName

    }

}