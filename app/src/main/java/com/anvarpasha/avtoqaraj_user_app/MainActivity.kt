package com.anvarpasha.avtoqaraj_user_app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import com.anvarpasha.avtoqaraj_user_app.ui.home.HomeFragment
import com.anvarpasha.avtoqaraj_user_app.ui.shop.ShopFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    // TODO companion object ne ise yarayir? V

    companion object{
        const val PARAM_NAVIGATION_ID = "navigation_id"
        fun newInstance(context : Context, navigationId : Int)=
            Intent(context,MainActivity::class.java).apply{
                flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                putExtra(PARAM_NAVIGATION_ID,navigationId)
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        bottom_navigation.setOnNavigationItemSelectedListener(this)
        val navigationId = intent.getIntExtra(PARAM_NAVIGATION_ID,R.id.action_home)
        bottom_navigation.selectedItemId=navigationId

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        loadFragment(item)
        return true
    }

    private fun loadFragment(item: MenuItem) {
        val tag = item.itemId.toString()

        val fragment = supportFragmentManager.findFragmentByTag(tag) ?: when (item.itemId) {
            R.id.action_home -> {
                HomeFragment.newInstance()
            }
            R.id.action_shop -> {
                ShopFragment.newInstance()
            }
            else -> {
                null
            }
        }
        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container,fragment, tag)
                .commit()
        }
    }
}