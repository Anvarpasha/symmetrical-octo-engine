package com.anvarpasha.avtoqaraj_user_app.ui.garage.newmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.AllDatas

class Newmark : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newmark)

        val data = AllDatas()

        // for addedMarks
        val recycAddedMark = findViewById<RecyclerView>(R.id.recycAddedMark)
        val myAdapter = AdapterAddedMark(data.fillMarks(20))
        recycAddedMark.adapter = myAdapter
        val linearLayoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        recycAddedMark.layoutManager=linearLayoutManager
        recycAddedMark.setHasFixedSize(true)

    }
}