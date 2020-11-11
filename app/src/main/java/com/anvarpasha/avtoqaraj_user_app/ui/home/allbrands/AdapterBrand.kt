package com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.DataCategories
import kotlinx.android.synthetic.main.list_item_brands.view.*

class AdapterBrand(var allBrands : ArrayList<DataBrand>, var onClickListener : OnClickListener) : RecyclerView.Adapter<AdapterBrand.BrandViewHolder>() {

    var brands = allBrands

    class BrandViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var listitemBrands = itemView as CardView

        var brandLogo = listitemBrands.brandLogo

    }

    override fun getItemCount(): Int {
        return brands.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var listItemBrands = inflater.inflate(R.layout.list_item_brands,parent,false)

        return BrandViewHolder(listItemBrands)
    }

    override fun onBindViewHolder(holder: BrandViewHolder, position: Int) {
        val popbrands = allBrands[position]

        // to set only one item in categories
        holder.itemView.setOnClickListener {
            onClickListener.onClick(popbrands)
        }

        holder.brandLogo.setImageResource(brands[position].brandLogo)
    }


    // We assign class called OnClickListener for the item in RecyclerView
    class OnClickListener(val clickListener: (model: DataBrand) -> Unit) {
        fun onClick(model: DataBrand) = clickListener(model)
    }


}