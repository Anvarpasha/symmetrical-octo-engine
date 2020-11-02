package com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.AdapterBrand
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.DataBrand
import kotlinx.android.synthetic.main.fragment_popular_brand_ins.*


class PopularBrandIns : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_popular_brand_ins, container, false)

        val data = AllDatas()

        val recycPopBrands = view.findViewById<RecyclerView>(R.id.recyclerPopularBrands)
        val popBrandAdapter = AdapterBrand(data.fillPopularBrand(60))
        recycPopBrands.adapter=popBrandAdapter
        val gridlayoutmanager = GridLayoutManager(context,3, GridLayoutManager.VERTICAL,false)
        recycPopBrands.layoutManager=gridlayoutmanager
        recycPopBrands.setHasFixedSize(true)

        // Inflate the layout for this fragment
        return view
    }




}