package com.anvarpasha.avtoqaraj_user_app.ui.home.placeAd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anvarpasha.avtoqaraj_user_app.R

class PlaceAds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_ads)


        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)


        setSupportActionBar(toolbar)
        supportActionBar?.title = "Elan yerləşdir"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



    }
}