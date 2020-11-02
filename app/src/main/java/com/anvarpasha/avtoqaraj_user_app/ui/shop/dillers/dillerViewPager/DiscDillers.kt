package com.anvarpasha.avtoqaraj_user_app.ui.shop.dillers.dillerViewPager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.AdapterIndividual
import kotlinx.android.synthetic.main.fragment_disc_dillers.*


class DiscDillers : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_disc_dillers, container, false)

        val data = AllDatas()


        val recycDiscdillers = view.findViewById<RecyclerView>(R.id.recycDiscDillers)
        val discdillerAdapter = AdapterIndividual(data.filldiscounted(50))
        recycDiscdillers.adapter=discdillerAdapter
        val gridLayoutManager=GridLayoutManager(context,2,GridLayoutManager.VERTICAL,false)
        recycDiscdillers.layoutManager=gridLayoutManager
        recycDiscdillers.setHasFixedSize(true)

        // Inflate the layout for this fragment
        return view
    }


}