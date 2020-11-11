package com.anvarpasha.avtoqaraj_user_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private var images:List<Int>):RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

    inner class Pager2ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val itemImage:ImageView=itemView.findViewById(R.id.item_car)

        init {
            itemImage.setOnClickListener { v : View ->

                val position:Int=adapterPosition
                Toast.makeText(itemView.context,"Clicked",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.Pager2ViewHolder {

        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.car_item_page,parent,false))
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {

        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return images.size
    }

}