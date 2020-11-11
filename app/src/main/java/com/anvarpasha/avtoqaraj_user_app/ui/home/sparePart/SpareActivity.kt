package com.anvarpasha.avtoqaraj_user_app.ui.home.sparePart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anvarpasha.avtoqaraj_user_app.R

class SpareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sparepart)



        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Ehtiyyat hissəsi sifariş et"


    }
}