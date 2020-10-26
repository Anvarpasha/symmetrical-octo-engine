package com.anvarpasha.avtoqaraj_user_app.ui.shop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.AdapterIndividual
import com.anvarpasha.avtoqaraj_user_app.ui.shop.stores.AdapterShopStore


class ShopFragment : Fragment() {




    // TODO ne ise yarayir  ?
    companion object{
        @JvmStatic
        fun newInstance() =
            ShopFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_shop, container, false)

        val data = AllDatas()

        // TODO home fragmentde de ele bunlari

        // for shopStore
        val recyclerViewShops = view.findViewById<RecyclerView>(R.id.recyclerViewShops)
        val shopAdapter = AdapterShopStore(data.fillShops(100))
        recyclerViewShops.adapter = shopAdapter
        val shopLayoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        recyclerViewShops.layoutManager=shopLayoutManager
        recyclerViewShops.setHasFixedSize(true)

        // for individiualDetail
        val recyclerViewIndividual=view.findViewById<RecyclerView>(R.id.recyclerViewIndividual)
        val indAdapter = AdapterIndividual(data.fillDetails(100))
        recyclerViewIndividual.adapter=indAdapter
        val individualLayoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        recyclerViewIndividual.layoutManager=individualLayoutManager
        recyclerViewIndividual.setHasFixedSize(true)



        // Inflate the layout for this fragment
        return view
    }


}