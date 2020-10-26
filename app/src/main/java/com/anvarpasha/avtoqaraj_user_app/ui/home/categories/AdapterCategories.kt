package com.anvarpasha.avtoqaraj_user_app.ui.home.categories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_categories.view.*

class AdapterCategories(private val allCategories: List<DataCategories>) : RecyclerView.Adapter<AdapterCategories.CategoriesViewHolder>() {


    // listde nece element oldugunu gosteren funksiyadir
    override fun getItemCount(): Int {
        return allCategories .size
    }

    // list olaraq tanimladigimiz cardViewu RecyclerView icine atiriq
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var listItemCategories =  inflater.inflate(R.layout.list_item_categories,parent,false)

        return CategoriesViewHolder(listItemCategories)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        var categories = allCategories[position]

        holder.detailName.text = categories.detail
        holder.detailImg.setImageResource(categories.detailPhoto)
    }


    class CategoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var listItemCategories = itemView as CardView
         var   detailImg : ImageView = listItemCategories.detailImg
         var detailName : TextView = listItemCategories.detailName
     }

}