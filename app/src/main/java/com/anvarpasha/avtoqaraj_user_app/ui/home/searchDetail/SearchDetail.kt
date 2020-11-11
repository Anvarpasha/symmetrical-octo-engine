package com.anvarpasha.avtoqaraj_user_app.ui.home.searchDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.MyPagerAdapter
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands.PopularBrandIns
import com.google.android.material.tabs.TabLayout

class SearchDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_detail)

        val viewPager = findViewById<ViewPager>(R.id.viewPagerSearch)
        val tabLayout = findViewById<TabLayout>(R.id.tablayoutsearch)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        viewPager.adapter = setUpViewPager()
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun setUpViewPager(): MyPagerAdapter {

        val myPagerAdapter = MyPagerAdapter(supportFragmentManager)

        val fragment1 =SearchDetailins()
        val fragment2 =SearchDetailins()
        val fragment3 =SearchDetailins()
        val fragment4 =SearchDetailins()

        myPagerAdapter.addFragment(fragment1, "Elanlar")
        myPagerAdapter.addFragment(fragment2, "Mağazalar")
        myPagerAdapter.addFragment(fragment3, "Aksesuarlar")
        myPagerAdapter.addFragment(fragment4, "Ehtiyyat hissələri")


        return myPagerAdapter
    }

}