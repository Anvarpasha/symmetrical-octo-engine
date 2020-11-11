package com.anvarpasha.avtoqaraj_user_app.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.HomeFragment
import com.anvarpasha.avtoqaraj_user_app.ui.home.sparePart.SpareActivity
import com.anvarpasha.avtoqaraj_user_app.ui.profile.allproducts.Allproducts
import com.anvarpasha.avtoqaraj_user_app.ui.profile.personalInfo.PersonaInfo
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment() {
    companion object{
        @JvmStatic
        fun newInstance() =
            ProfileFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)


        // attach toolbar from XML to Kotlin code
        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)

        // set toolbar and avtoqaraj icon to toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.title = "Şəxsi məlumatlar"



        // transaction from profile -> personal info
        view.maincard.setOnClickListener {
            activity?.startActivity(
                Intent(activity, PersonaInfo::class.java)
            )
        }

        //transaction from profile -> all products
        view.allprodcard.setOnClickListener {
            activity?.startActivity(
                Intent(activity,Allproducts::class.java)
            )
        }



        // Inflate the layout for this fragment
        return view
    }


}