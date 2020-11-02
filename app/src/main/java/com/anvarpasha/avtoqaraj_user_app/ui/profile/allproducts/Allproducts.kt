package com.anvarpasha.avtoqaraj_user_app.ui.profile.allproducts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.MyPagerAdapter
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands.PopularBrandIns
import com.google.android.material.tabs.TabLayout

class Allproducts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allproducts)

        val viewPager = findViewById<ViewPager>(R.id.prodViewPager)
        val tabLayout = findViewById<TabLayout>(R.id.productsTab)

        viewPager.adapter = setUpViewPager()
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun setUpViewPager(): MyPagerAdapter {

        val myPagerAdapter = MyPagerAdapter(supportFragmentManager)


        val fragment1 = AllproductsIns()
        val fragment2 = AllproductsIns()

        myPagerAdapter.addFragment(fragment1, "Təsdiq gözləyən")
        myPagerAdapter.addFragment(fragment2, "Bütün məhsullar")

        return myPagerAdapter
    }
}