package com.anvarpasha.avtoqaraj_user_app.ui.home.categories.interior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.AdapterCategories
import kotlinx.android.synthetic.main.activity_interior.*

class InteriorActivity : AppCompatActivity() {
    private lateinit var gridLayoutManager: GridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interior)

        val data = AllDatas()

        val accAdapter =  AdapterCategories(data.fillAccessoriesData(50))
        gridLayoutManager = GridLayoutManager(this, 3)
        recyclerViewAccessories.adapter = accAdapter
        val gridLayoutManager = GridLayoutManager(applicationContext,3, GridLayoutManager.VERTICAL,false)
        recyclerViewAccessories.layoutManager=gridLayoutManager
        gridLayoutManager.findLastVisibleItemPosition()

    }



}