package com.anvarpasha.avtoqaraj_user_app.ui.home.searchDetail.searchCatDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.MyPagerAdapter
import com.anvarpasha.avtoqaraj_user_app.ui.home.searchDetail.SearchDetailins
import com.google.android.material.tabs.TabLayout

class SearchCatDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_cat_detail)

        val viewPager = findViewById<ViewPager>(R.id.vPagerSearchCat)
        val tabLayout = findViewById<TabLayout>(R.id.tabSearchCat)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        viewPager.adapter = setUpViewPager()
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun setUpViewPager(): MyPagerAdapter {

        val myPagerAdapter = MyPagerAdapter(supportFragmentManager)

        val fragment1 = CatDetailins()
        val fragment2 = CatDetailins()
        val fragment3 = CatDetailins()
        val fragment4 = CatDetailins()


        myPagerAdapter.addFragment(fragment1, "Elanlar")
        myPagerAdapter.addFragment(fragment2, "Mağazalar")
        myPagerAdapter.addFragment(fragment3, "Aksesuarlar")
        myPagerAdapter.addFragment(fragment4, "Ehtiyyat hissələri")


        return myPagerAdapter
    }
}