package com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_brands.view.*

class AdapterPopBrands(allPopBrands: ArrayList<DataBrand>) : RecyclerView.Adapter<AdapterPopBrands.PopBrandViewHolder>() {
    var popularBrands = allPopBrands

    class PopBrandViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var listitemPopBrand = itemView as CardView

        var popBrandLogo = listitemPopBrand.brandLogo

    }

    override fun getItemCount(): Int {
       return popularBrands.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PopBrandViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var listitemPopBrand = inflater.inflate(R.layout.list_item_brands,parent,false)

        return PopBrandViewHolder(listitemPopBrand)
    }

    override fun onBindViewHolder(holder: PopBrandViewHolder, position: Int) {
        holder.popBrandLogo.setImageResource(popularBrands[position].brandLogo)
    }

}