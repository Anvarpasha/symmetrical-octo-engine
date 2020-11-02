package com.anvarpasha.avtoqaraj_user_app

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import java.util.*

class SamplePagerAdapter : PagerAdapter {
    private val random = Random()
    private var mSize: Int

    constructor() {
        mSize = 5
    }

    constructor(count: Int) {
        mSize = count
    }

    override fun getCount(): Int {
        return mSize
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun destroyItem(view: ViewGroup, position: Int, `object`: Any) {
        view.removeView(`object` as View)
    }

    override fun instantiateItem(view: ViewGroup, position: Int): Any {
        val textView = TextView(view.context)
        textView.text = (position + 1).toString()
        textView.setBackgroundColor(-0x1000000 or random.nextInt(0x00ffffff))
        textView.gravity = Gravity.CENTER
        textView.setTextColor(Color.WHITE)
        textView.textSize = 48f
        view.addView(
            textView, ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        return textView
    }

    fun addItem() {
        mSize++
        notifyDataSetChanged()
    }

    fun removeItem() {
        mSize--
        mSize = if (mSize < 0) 0 else mSize
        notifyDataSetChanged()
    }
}