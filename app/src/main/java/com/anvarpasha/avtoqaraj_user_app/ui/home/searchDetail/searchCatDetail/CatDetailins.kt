package com.anvarpasha.avtoqaraj_user_app.ui.home.searchDetail.searchCatDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.AdapterBrand
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.AdapterCategories
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.AdapterIndividual

class CatDetailins : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view  = inflater.inflate(R.layout.fragment_cat_detailins, container, false)

        val data = AllDatas()

        // categories for search icon(magnifier)
        val recycSearchCat = view.findViewById<RecyclerView>(R.id.recycSearchCat)
        val searchCatAdapter = AdapterCategories(data.searchCat(25),AdapterCategories.OnClickListener {  })
        recycSearchCat.adapter=searchCatAdapter
        val linearLayoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        recycSearchCat.layoutManager=linearLayoutManager
        recycSearchCat.setHasFixedSize(true)

        // individual announcement for search icon(magnifier)
        val recycSearchInd = view.findViewById<RecyclerView>(R.id.recycSearchInd)
        val searchIndAdapter = AdapterIndividual(data.searchCatInd(25))
        recycSearchInd.adapter=searchIndAdapter
        val gridlayoutmanager = GridLayoutManager(context,2, GridLayoutManager.VERTICAL,false)
        recycSearchInd.layoutManager=gridlayoutmanager
        recycSearchInd.setHasFixedSize(true)



        // Inflate the layout for this fragment
        return view
    }

}