package com.anvarpasha.avtoqaraj_user_app.ui.profile.allproducts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import kotlinx.android.synthetic.main.fragment_allproducts_ins.*
import kotlinx.android.synthetic.main.fragment_popular_brand_ins.*


class AllproductsIns : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_allproducts_ins, container, false)

        val data = AllDatas()

        val productAdapter = AdapterProducts(data.fillproducts(25))
        recyclerPopularBrands.adapter=productAdapter
        val linearlayoutmanager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        recycProducts.layoutManager=linearlayoutmanager
        recycProducts.setHasFixedSize(true)


        // Inflate the layout for this fragment
        return view
    }
}