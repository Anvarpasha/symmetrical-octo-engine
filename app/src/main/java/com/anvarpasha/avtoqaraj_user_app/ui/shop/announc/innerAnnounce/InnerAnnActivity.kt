package com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.innerAnnounce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.AdapterCategories
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.AdapterIndividual

class InnerAnnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inner_ann)

        val data = AllDatas()

        // TODO bir fillData birden cox recyclerviewda istifade ede bilerik ?

        // shop -> individual announcement -> individual announcement inner page categories recyclerView
        val recycindAnn = findViewById<RecyclerView>(R.id.recycCategories)
        val indAdapter = AdapterCategories(data.fillDataSource(25),AdapterCategories.OnClickListener {  })
        recycindAnn.adapter = indAdapter
        val linearLayoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.HORIZONTAL,false)
        recycindAnn.layoutManager=linearLayoutManager
        recycindAnn.setHasFixedSize(true)


        // shop -> individual announcement - > individual announcment innner page - > details
        val recycindDet = findViewById<RecyclerView>(R.id.recycindDet)
        val detAdapter = AdapterIndividual(data.fillDetails(25))
        recycindDet.adapter=detAdapter
        val gridLayoutManager = GridLayoutManager(this,3,GridLayoutManager.VERTICAL,false)
        recycindDet.layoutManager=gridLayoutManager
        recycindDet.setHasFixedSize(true)
    }
}