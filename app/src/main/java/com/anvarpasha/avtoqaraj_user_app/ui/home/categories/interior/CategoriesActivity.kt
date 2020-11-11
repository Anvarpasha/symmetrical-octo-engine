package com.anvarpasha.avtoqaraj_user_app.ui.home.categories.interior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.AdapterCategories
import kotlinx.android.synthetic.main.activity_categories.*

class CategoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val toolbar  = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)
        supportActionBar?.title = "Interior accessories"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        val data = AllDatas()

        // interior categories in home screen
        val accAdapter =  AdapterCategories(data.fillAccessoriesData(50), AdapterCategories.OnClickListener {})
        recyclerViewAccessories.adapter = accAdapter
        val gridLayoutManager = GridLayoutManager(applicationContext,3, GridLayoutManager.VERTICAL,false)
        recyclerViewAccessories.layoutManager=gridLayoutManager
        gridLayoutManager.findLastVisibleItemPosition()

    }
}