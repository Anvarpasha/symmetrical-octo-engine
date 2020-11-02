package com.anvarpasha.avtoqaraj_user_app.ui.garage.specificCar.technique

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.R
import kotlinx.android.synthetic.main.activity_tech_indicators.*

class TechIndicators : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech_indicators)

        val data = AllDatas()

        val techAdapter = AdapterTech(data.fillTechs(25))
        recycTech.adapter=techAdapter
        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recycTech.layoutManager=linearLayoutManager
        recycTech.setHasFixedSize(true)


    }
}