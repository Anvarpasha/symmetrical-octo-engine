package com.anvarpasha.avtoqaraj_user_app.ui.home.categories

import android.app.Notification
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_categories.view.*


class AdapterCategories(var allCategories: List<DataCategories>, var onClickListener: OnClickListener ) : RecyclerView.Adapter<AdapterCategories.CategoriesViewHolder>() {


    // listde nece element oldugunu gosteren funksiyadir
    override fun getItemCount(): Int {
        return allCategories .size
    }

    // list olaraq tanimladigimiz cardViewu RecyclerView icine atiriq
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listItemCategories =  inflater.inflate(R.layout.list_item_categories, parent, false)

        return CategoriesViewHolder(listItemCategories)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val categories = allCategories[position]

        // to set only one item in categories
        holder.itemView.setOnClickListener {
            onClickListener.onClick(categories)
        }

        holder.detailName.text = categories.detail
        holder.detailImg.setImageResource(categories.detailPhoto)
    }


    class CategoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var listItemCategories = itemView as CardView
         var   detailImg : ImageView = listItemCategories.detailImg
         var detailName : TextView = listItemCategories.detailName
     }

    // We assign class called OnClickListener for the item in RecyclerView
    class OnClickListener(val clickListener: (model: DataCategories) -> Unit) {
        fun onClick(model: DataCategories) = clickListener(model)
    }


}