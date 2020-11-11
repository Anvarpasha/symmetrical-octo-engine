package com.anvarpasha.avtoqaraj_user_app.ui.shop

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.AdapterIndividual
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.innerAnnounce.InnerAnnActivity
import com.anvarpasha.avtoqaraj_user_app.ui.shop.dillers.AdapterDillers
import com.anvarpasha.avtoqaraj_user_app.ui.shop.dillers.dillerViewPager.DillerInner
import com.anvarpasha.avtoqaraj_user_app.ui.shop.stores.AdapterShopStore
import kotlinx.android.synthetic.main.fragment_shop.view.*


class ShopFragment : Fragment() {





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

        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)

        (activity as AppCompatActivity?)!!.setSupportActionBar(toolbar)
        (activity as AppCompatActivity?)!!.supportActionBar?.setIcon(R.drawable.avtoqaraj)

        //for official dillers
        val recyclerDiller = view.findViewById<RecyclerView>(R.id.recyclerViewDillers)
        val dilAdapter = AdapterDillers(data.fillDiller(25))
        recyclerDiller.adapter=dilAdapter
        val dealerLayoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        recyclerDiller.layoutManager=dealerLayoutManager
        recyclerDiller.setHasFixedSize(true)


        // for shopStore
        val recyclerViewShops = view.findViewById<RecyclerView>(R.id.recyclerViewShops)
        val shopAdapter = AdapterShopStore(data.fillShops(100))
        recyclerViewShops.adapter = shopAdapter
        val shopLayoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        recyclerViewShops.layoutManager=shopLayoutManager
        recyclerViewShops.setHasFixedSize(true)

        // for individual announcements
        val recyclerViewIndividual=view.findViewById<RecyclerView>(R.id.recyclerViewIndividual)
        val indAdapter = AdapterIndividual(data.fillDetails(100))
        recyclerViewIndividual.adapter=indAdapter
        val individualLayoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        recyclerViewIndividual.layoutManager=individualLayoutManager
        recyclerViewIndividual.setHasFixedSize(true)


        //transaction to individual dealer profile from official dealers recycler View
        view.seeAllDillers.setOnClickListener {
            activity?.startActivity(
                Intent(activity, DillerInner::class.java)
            )
        }


        // transaction to individual announcement from individual announcement in shop screen

        view.seeAllAnnounce.setOnClickListener {
            activity?.startActivity(
                Intent(activity,InnerAnnActivity::class.java)
            )
        }





        // Inflate the layout for this fragment
        return view
    }


}