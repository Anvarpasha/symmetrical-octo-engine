package com.anvarpasha.avtoqaraj_user_app.ui.home.searchDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.AdapterBrand
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.AdapterIndividual


class SearchDetailins : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search_detail_ins, container, false)

        val data = AllDatas()


       // for searched products
        val recycSearch = view.findViewById<RecyclerView>(R.id.recycSearc)
        val SearchAdapter = AdapterIndividual(data.fillsearch(25))
        recycSearch.adapter=SearchAdapter
        val gridlayoutmanager = GridLayoutManager(context,2, GridLayoutManager.VERTICAL,false)
        recycSearch.layoutManager=gridlayoutmanager
        recycSearch.setHasFixedSize(true)






        // Inflate the layout for this fragment
        return view
    }


}