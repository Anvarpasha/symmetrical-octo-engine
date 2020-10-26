package com.anvarpasha.avtoqaraj_user_app.ui.shop.stores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_shops.view.*

class AdapterShopStore(private val shopStores : List<DataShopStore>) : RecyclerView.Adapter<AdapterShopStore.ShopStoreViewHolder>(){

    override fun getItemCount(): Int {
         return shopStores.size
     }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ShopStoreViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var listItemShopStore =  inflater.inflate(R.layout.list_item_shops,parent,false)

        return ShopStoreViewHolder(listItemShopStore)
    }

    override fun onBindViewHolder(holder: ShopStoreViewHolder, position: Int) {
        var allShopStores = shopStores[position]

        holder.ShopName.text = allShopStores.shopName
        holder.ShopImg.setImageResource(allShopStores.shopLogo)
    }


    class ShopStoreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var listItemShopsStores = itemView as CardView

        var   ShopImg : ImageView = listItemShopsStores.shopLogo
        var ShopName : TextView = listItemShopsStores.shopName
    }


}