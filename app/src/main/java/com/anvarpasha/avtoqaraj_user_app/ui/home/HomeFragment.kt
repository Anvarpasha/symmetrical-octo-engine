package com.anvarpasha.avtoqaraj_user_app.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.AdapterBrand
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands.PopularBrands
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.AdapterCategories
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.interior.CategoriesActivity
import com.anvarpasha.avtoqaraj_user_app.ui.home.openStore.OpenStoreActivity
import com.anvarpasha.avtoqaraj_user_app.ui.home.placeAd.PlaceAds
import com.anvarpasha.avtoqaraj_user_app.ui.home.searchDetail.SearchDetail
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

        // attach toolbar from XML to Kotlin code
        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)

        // set toolbar and avtoqaraj icon to toolbar
        (activity as AppCompatActivity?)!!.setSupportActionBar(toolbar)
        (activity as AppCompatActivity?)!!.supportActionBar?.setIcon(R.drawable.avtoqaraj)


        //for categories
        val recyclerViewCategories = view.findViewById<RecyclerView>(R.id.recyclerViewCategories)

        // we set onclicklistener to one item in recyclerview in homescreeen
        val myAdapter = AdapterCategories(data.fillDataSource(100), AdapterCategories.OnClickListener {
            Toast.makeText(activity,"${it.detail}",Toast.LENGTH_LONG).show()
            startActivity(Intent(activity,CategoriesActivity::class.java))
        })
        recyclerViewCategories.adapter = myAdapter
        val linearLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewCategories.layoutManager=linearLayoutManager
        recyclerViewCategories.setHasFixedSize(true)


        // for brands horizontal
        val recyclerViewBrands = view.findViewById<RecyclerView>(R.id.recyclerViewBrands)

        // we set onclicklistener to one item in brand recycView in homescreen
        val brandAdapter = AdapterBrand(data.fillDataSourceBrand(100), AdapterBrand.OnClickListener{
            startActivity(Intent(activity,PopularBrands::class.java))
        })
        recyclerViewBrands.adapter=brandAdapter
        val brandLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewBrands.layoutManager=brandLayoutManager
        recyclerViewBrands.setHasFixedSize(true)



        // transition to interior accessories from see all categories
        view.seeAllCategories.setOnClickListener {
            activity?.startActivity(
                Intent(activity, CategoriesActivity::class.java)
            )
        }





        // transition to all popular brands from all brands
        view.seeAllBrands.setOnClickListener {
            activity?.startActivity(
                Intent(activity, PopularBrands::class.java)
            )
        }



        //transition to order spare part from spare part
        view.SparecardView.setOnClickListener {
            activity?.startActivity(
                Intent(activity, SpareActivity::class.java)
            )
        }

        //transition to openStore from "Do u wanna openStore?"
        view.storeCardView.setOnClickListener {
            activity?.startActivity(
                Intent(activity, OpenStoreActivity::class.java)
            )
        }


        // action button in toolbar ( search button )


        setHasOptionsMenu(true)

        // Inflate the layout for this fragment
        return view
    }





    // set icon to my toolbar
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.home_menu, menu)

    }

    // set onclick to icons in toolbar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when(item.itemId){
            R.id.action_search -> {
                startActivity(Intent(context,SearchDetail::class.java))
            }
            R.id.action_add -> {
                startActivity(Intent(context,PlaceAds::class.java))
            }
        }

        return true
    }



}
