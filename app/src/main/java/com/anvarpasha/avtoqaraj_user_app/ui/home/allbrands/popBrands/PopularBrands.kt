package com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.MyPagerAdapter
import com.google.android.material.tabs.TabLayout

class PopularBrands : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popular_brands)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)


        viewPager.adapter = setUpViewPager()
        tabLayout.setupWithViewPager(viewPager)

    }

    private fun setUpViewPager(): MyPagerAdapter {

        val myPagerAdapter = MyPagerAdapter(supportFragmentManager)

        val fragment1 = PopularBrandIns()
        val fragment2 = PopularBrandIns()

        myPagerAdapter.addFragment(fragment1, "Popular Brands")
        myPagerAdapter.addFragment(fragment2, "All Brands")

        return myPagerAdapter
    }

}