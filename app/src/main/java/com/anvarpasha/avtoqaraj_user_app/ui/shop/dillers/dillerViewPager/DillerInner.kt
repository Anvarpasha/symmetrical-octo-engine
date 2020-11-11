package com.anvarpasha.avtoqaraj_user_app.ui.shop.dillers.dillerViewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.MyPagerAdapter
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands.PopularBrandIns
import com.anvarpasha.avtoqaraj_user_app.ui.shop.dillers.dillerViewPager.DiscDillers
import com.google.android.material.tabs.TabLayout

class DillerInner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diller_inner)

        val viewPager = findViewById<ViewPager>(R.id.viewPagerDiller)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutDiller)
        val toolar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolar)
        supportActionBar?.title="Geri"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        viewPager.adapter = setUpViewPager()
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun setUpViewPager(): MyPagerAdapter {

        val myPagerAdapter = MyPagerAdapter(supportFragmentManager)

        val fragment1 = DiscDillers()
        val fragment2 = DiscDillers()

        myPagerAdapter.addFragment(fragment1, "Endirimli məhsullar")
        myPagerAdapter.addFragment(fragment2, "Bütün məhsullar")

        return myPagerAdapter
    }
}