package com.anvarpasha.avtoqaraj_user_app.ui.garage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.AdapterCategories
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.DataCategories
import kotlinx.android.synthetic.main.list_item_garage.view.*

class AdapterGarage(var allCars : List<DataGarage>, var onClickListener: OnClickListener) : RecyclerView.Adapter<AdapterGarage.GarageViewHolder>() {

    override fun getItemCount(): Int {
        return allCars.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GarageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listItemCars = inflater.inflate(R.layout.list_item_garage, parent, false)

        return GarageViewHolder(listItemCars)
    }

    override fun onBindViewHolder(holder: GarageViewHolder, position: Int) {
         val cars = allCars[position]

        // to set only one item in categories
        holder.itemView.setOnClickListener {
            onClickListener.onClick(cars)
        }


        holder.car.setImageResource(cars.car)
        holder.carlogo.setImageResource(cars.carLogo)
        holder.carname.text = cars.carname
        holder.carnameback.text = cars.carnameBack
        holder.carrestyling.text= cars.carrestyling

    }


    class GarageViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var listItemCars =  itemView as CardView

        var car : ImageView = listItemCars.car
        var carnameback : TextView = listItemCars.carnameback
        var carname : TextView = listItemCars.carname
        var carlogo : ImageView = listItemCars.carlogo
        var carrestyling : TextView = listItemCars.carrestyling

    }

    // We assign class called OnClickListener for the item in RecyclerView
    class OnClickListener(val clickListener: (model: DataGarage) -> Unit) {
        fun onClick(model: DataGarage) = clickListener(model)
    }
}