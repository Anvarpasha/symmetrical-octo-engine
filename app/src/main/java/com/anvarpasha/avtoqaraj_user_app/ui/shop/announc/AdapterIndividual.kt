package com.anvarpasha.avtoqaraj_user_app.ui.shop.announc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.list_item_individual.view.*

class AdapterIndividual(private val indDetail : List<DataIndividualAnn>) : RecyclerView.Adapter<AdapterIndividual.IndividualViewHolder>() {

    override fun getItemCount(): Int {
        return indDetail.size
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IndividualViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var listItemIndividual =  inflater.inflate(R.layout.list_item_individual,parent,false)

        return IndividualViewHolder(listItemIndividual)
    }

    override fun onBindViewHolder(holder: IndividualViewHolder, position: Int) {
          var allDetails = indDetail[position]

             holder.indDetailImg.setImageResource(allDetails.indDetImg)
             holder.indDetailName.text= allDetails.indDetName
             holder.discPrice.text = allDetails.discountedPrice
             holder.price.text=allDetails.price
    }


    class IndividualViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var listItemIndividual = itemView as CardView

        var indDetailImg : ImageView = listItemIndividual.indDetailImg
        var indDetailName : TextView = listItemIndividual.indDetailName
        var discPrice : TextView = listItemIndividual.discounted
        var price : TextView = listItemIndividual.price
    }
}