package com.anvarpasha.avtoqaraj_user_app.ui.home.categories.interior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.interior.AdapterAccessories
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.interior.DataAccessories
import kotlinx.android.synthetic.main.activity_interior.*

class InteriorActivity : AppCompatActivity() {
    private lateinit var gridLayoutManager: GridLayoutManager

    var allAccessories = ArrayList<DataAccessories>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interior)

        fillAccessoriesData()

        var accAdapter =  AdapterAccessories(allAccessories)

        gridLayoutManager = GridLayoutManager(this, 3)

        recyclerViewAccessories.adapter = accAdapter

        var gridLayoutManager = GridLayoutManager(applicationContext,3, GridLayoutManager.HORIZONTAL,false)

        recyclerViewAccessories.layoutManager=gridLayoutManager

        gridLayoutManager.findLastVisibleItemPosition()


    }
   fun fillAccessoriesData() : ArrayList<DataAccessories>{
       var allAccPics = arrayOf(
           R.drawable.speedometer,
           R.drawable.speedometer,
           R.drawable.speedometer,
           R.drawable.speedometer,
           R.drawable.speedometer,
           R.drawable.speedometer,
           R.drawable.speedometer,
           R.drawable.speedometer
       )
       var allAccNames = arrayOf("Mats","Speedometer","Seat covers","Steering wheels","Windshield sun shades","Trunk covers")

       for(i in 0..25){
         var addedAcc = DataAccessories(allAccPics[i],allAccNames[i])

           allAccessories.add(addedAcc)
       }

       return allAccessories
   }


}