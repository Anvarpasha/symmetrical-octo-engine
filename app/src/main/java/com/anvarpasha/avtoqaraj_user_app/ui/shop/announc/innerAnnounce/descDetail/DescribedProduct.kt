package com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.innerAnnounce.descDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.R

class DescribedProduct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_described_product)

        val data = AllDatas()

        // for described detail in shop -> individual announcement -> detail
        val recycdescDetail = findViewById<RecyclerView>(R.id.recycDetailDesc)
        val myAdapter = AdapterDescribed(data.fillDescribed(3))
        recycdescDetail.adapter = myAdapter
        val linearLayoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        recycdescDetail.layoutManager=linearLayoutManager
        recycdescDetail.setHasFixedSize(true)
    }
}