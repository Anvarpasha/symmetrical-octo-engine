package com.anvarpasha.avtoqaraj_user_app.ui.home.categories.interior

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_accessories.view.*

  class AdapterAccessories(allaccessories : ArrayList<DataAccessories>) : RecyclerView.Adapter<AdapterAccessories.AccessoriesViewHolder>() {

      var accesories = allaccessories

      override fun getItemCount(): Int {
          return accesories.size
      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccessoriesViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var listItemAccessories = inflater.inflate(R.layout.list_item_accessories,parent,false)

        return AccessoriesViewHolder(listItemAccessories)
    }

    override fun onBindViewHolder(holder: AccessoriesViewHolder, position: Int) {
        holder.accesoriesName.text=accesories[position].accessoriesName
        holder.accesoriesPic.setImageResource(accesories[position].accessoriesPic)
    }



    class AccessoriesViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var listItemAccessories = itemView as CardView

        var accesoriesPic = listItemAccessories.accesImg
        var accesoriesName = listItemAccessories.accesName
    }


}