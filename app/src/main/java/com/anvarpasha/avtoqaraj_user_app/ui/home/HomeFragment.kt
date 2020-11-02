package com.anvarpasha.avtoqaraj_user_app.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.AdapterBrand
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands.PopularBrands
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.AdapterCategories
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.interior.InteriorActivity
import com.anvarpasha.avtoqaraj_user_app.ui.home.openStore.OpenStoreActivity
import com.anvarpasha.avtoqaraj_user_app.ui.home.sparePart.SpareActivity
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {


    // TODO ne ise yarayir  ?
    companion object{
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val data = AllDatas()


        // transition to interior accessories from see all categories
        view.seeAllCategories.setOnClickListener {
            activity?.startActivity(
                Intent(activity,InteriorActivity::class.java)
            )
        }


        // transition to all popular brands from all brands

        view.seeAllBrands.setOnClickListener {
            activity?.startActivity(
                Intent(activity,PopularBrands::class.java)
            )
        }



        //transition to order spare part from spare part
        view.SparecardView.setOnClickListener {
            activity?.startActivity(
                Intent(activity,SpareActivity::class.java)
            )
        }

        //transition to openStore from "Do u wanna openStore?"
         view.storeCardView.setOnClickListener {
             activity?.startActivity(
                 Intent(activity,OpenStoreActivity::class.java)
             )
         }



        //for categories
        val recyclerViewCategories = view.findViewById<RecyclerView>(R.id.recyclerViewCategories)
        val myAdapter = AdapterCategories(data.fillDataSource(100))
        recyclerViewCategories.adapter = myAdapter
        val linearLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewCategories.layoutManager=linearLayoutManager
        recyclerViewCategories.setHasFixedSize(true)


        // for brands horizontal
        val recyclerViewBrands = view.findViewById<RecyclerView>(R.id.recyclerViewBrands)
        val brandAdapter = AdapterBrand(data.fillDataSourceBrand(100))
        recyclerViewBrands.adapter=brandAdapter
        val brandLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewBrands.layoutManager=brandLayoutManager
        recyclerViewBrands.setHasFixedSize(true)


        // Inflate the layout for this fragment
        return view
    }


}