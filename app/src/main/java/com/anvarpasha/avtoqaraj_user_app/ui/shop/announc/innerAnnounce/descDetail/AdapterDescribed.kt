package com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.innerAnnounce.descDetail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_descdetail.view.*

class AdapterDescribed(private val addedDesc : List<DataDescribed>) : RecyclerView.Adapter<AdapterDescribed.DescribedViewHolder>(){

    override fun getItemCount(): Int {
        return addedDesc.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DescribedViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listItemDescribed=  inflater.inflate(R.layout.list_item_descdetail,parent,false)

        return DescribedViewHolder(listItemDescribed)
    }

    override fun onBindViewHolder(holder: DescribedViewHolder, position: Int) {
        val addedDesc = addedDesc[position]

        holder.sort.text = addedDesc.sort
    }



    class DescribedViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var listitemAddedDesc = itemView as CardView
         val sort : TextView = listitemAddedDesc.sort
    }
}