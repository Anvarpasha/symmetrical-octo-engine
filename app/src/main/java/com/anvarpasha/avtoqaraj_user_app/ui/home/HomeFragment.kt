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
import com.anvarpasha.avtoqaraj_user_app.ui.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.AdapterBrand
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands.DataBrand
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.AdapterCategories
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.DataCategories
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.interior.InteriorActivity
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    var allCategories=ArrayList<DataCategories>()
    var allBrands = ArrayList<DataBrand>()


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

        val seeAllCat = seeAllCategories

        seeAllCat.setOnClickListener {
            val intent=Intent(activity, InteriorActivity::class.java)
            startActivity(intent)
        }


        //for categories
        val recyclerViewCategories = view.findViewById<RecyclerView>(R.id.recyclerViewCategories)
        val myAdapter = AdapterCategories(data.fillDataSource(100))
        recyclerViewCategories.adapter = myAdapter
        val linearLayoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        recyclerViewCategories.layoutManager=linearLayoutManager
        recyclerViewCategories.setHasFixedSize(true)



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