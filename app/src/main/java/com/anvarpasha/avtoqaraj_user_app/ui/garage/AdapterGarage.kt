package com.anvarpasha.avtoqaraj_user_app.ui.garage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_garage.view.*

class AdapterGarage(private val allCars : List<DataGarage>) : RecyclerView.Adapter<AdapterGarage.GarageViewHolder>() {

    override fun getItemCount(): Int {
        return allCars.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterGarage.GarageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val listItemCars = inflater.inflate(R.layout.list_item_garage, parent, false)

        return AdapterGarage.GarageViewHolder(listItemCars)
    }

    override fun onBindViewHolder(holder: AdapterGarage.GarageViewHolder, position: Int) {
         val cars = allCars[position]

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
}