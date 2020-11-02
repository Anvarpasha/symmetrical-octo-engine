package com.anvarpasha.avtoqaraj_user_app.ui.profile.allproducts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.garage.AdapterGarage
import kotlinx.android.synthetic.main.list_item_products.view.*

class AdapterProducts(private val allproducts: ArrayList<DataProducts>) :
    RecyclerView.Adapter<AdapterProducts.ProductsViewHolder>() {

    class ProductsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var listitemProd = itemView as CardView

        var productImg : ImageView = listitemProd.productImg
        var response : TextView = listitemProd.response
        var category : TextView = listitemProd.category
        var prodName : TextView = listitemProd.prodName
        var price : TextView = listitemProd.prodprice
        var delivery : TextView = listitemProd.delivery

    }

    override fun getItemCount(): Int {
        return allproducts.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterProducts.ProductsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listItemproducts = inflater.inflate(R.layout.list_item_products, parent, false)

        return AdapterProducts.ProductsViewHolder(listItemproducts)
    }

    override fun onBindViewHolder(holder: AdapterProducts.ProductsViewHolder, position: Int) {
       val products = allproducts[position]

        holder.productImg.setImageResource(products.productImg)
        holder.response.text = products.response
        holder.category.text = products.category
        holder.prodName.text = products.prodName
        holder.price.text = products.prodprice
        holder.delivery.text = products.delivery

    }


}