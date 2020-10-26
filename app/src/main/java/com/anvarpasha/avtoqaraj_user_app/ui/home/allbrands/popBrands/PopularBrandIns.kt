package com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.fragment_popular_brand_ins.*


class PopularBrandIns : Fragment() {

    var allPopBrands = ArrayList<DataBrand>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fillPopularBrand()

        var popBrandAdapter = AdapterPopBrands(allPopBrands)

        recyclerPopularBrands.adapter=popBrandAdapter

        var gridlayoutmanager = GridLayoutManager(context,3,
            GridLayoutManager.VERTICAL,false)

        recyclerPopularBrands.layoutManager=gridlayoutmanager

        recyclerPopularBrands.setHasFixedSize(true)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_brand_ins, container, false)
    }

    fun fillPopularBrand() : ArrayList<DataBrand>{
        var allPopBrand = arrayOf(R.drawable.bmw, R.drawable.audi, R.drawable.hyundai)

        for(element in allPopBrand){
            var addedPopBrand = DataBrand(element)

            allPopBrands.add(addedPopBrand)
        }
        return allPopBrands
    }


}