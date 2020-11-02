package com.anvarpasha.avtoqaraj_user_app.ui.garage.specificCar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.SamplePagerAdapter
import me.relex.circleindicator.CircleIndicator

class SpecificCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specific_car)


        val viewpager: ViewPager = findViewById(R.id.viewpagerGarage)
        val indicator: CircleIndicator = findViewById(R.id.indicator)
        viewpager.adapter = SamplePagerAdapter()
        indicator.setViewPager(viewpager)
        viewpager.currentItem = 2




    }
}

