package com.anvarpasha.avtoqaraj_user_app.ui.garage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.garage.specificCar.SpecificCar
import kotlinx.android.synthetic.main.fragment_garage.view.*


class GarageFragment : Fragment() {

    companion object{
        @JvmStatic
        fun newInstance() =
            GarageFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_garage, container, false)

        val data = AllDatas()

        // attach toolbar from XML to Kotlin code
        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)

        // set toolbar and avtoqaraj icon to toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.setIcon(R.drawable.avtoqaraj)









        // for garageCars
        val recycGarage = view.findViewById<RecyclerView>(R.id.recycGarage)
        val myAdapter = AdapterGarage(data.fillGarageCars(50),AdapterGarage.OnClickListener{
            startActivity(Intent(activity,SpecificCar::class.java))
        })
        recycGarage.adapter = myAdapter
        val linearLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        recycGarage.layoutManager=linearLayoutManager
        recycGarage.setHasFixedSize(true)




        // Inflate the layout for this fragment
        return view
    }


}