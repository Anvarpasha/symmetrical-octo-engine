package com.anvarpasha.avtoqaraj_user_app.ui.garage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.garage.specificCar.SpecificCar
import kotlinx.android.synthetic.main.fragment_garage.view.*


class GarageFragment : Fragment() {

    // TODO ne ise yarayir  ?
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

        // TODO bunu sil
        view.recycGarage.setOnClickListener {
            activity?.startActivity(
                Intent(activity,SpecificCar::class.java)
            )
        }


        // for garageCars
        val recycGarage = view.findViewById<RecyclerView>(R.id.recycGarage)
        val myAdapter = AdapterGarage(data.fillGarageCars(50))
        recycGarage.adapter = myAdapter
        val linearLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        recycGarage.layoutManager=linearLayoutManager
        recycGarage.setHasFixedSize(true)




        // Inflate the layout for this fragment
        return view
    }


}