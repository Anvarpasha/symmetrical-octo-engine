package com.anvarpasha.avtoqaraj_user_app.ui.profile.chosenProduct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.AdapterIndividual
import kotlinx.android.synthetic.main.activity_chosen_prod.*

class ChosenProd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chosen_prod)

        val data = AllDatas()

        val chosenProd = AdapterIndividual(data.fillDetails(25))
        recycChosenProd.adapter = chosenProd
        val gridLayoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)
        recycChosenProd.layoutManager=gridLayoutManager
        gridLayoutManager.findLastVisibleItemPosition()
    }
}