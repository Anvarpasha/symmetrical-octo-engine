package com.anvarpasha.avtoqaraj_user_app.ui.garage.specificCar

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.size
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ViewPagerAdapter
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_specific_car.*
import me.relex.circleindicator.CircleIndicator
import me.relex.circleindicator.CircleIndicator3

class SpecificCar : AppCompatActivity() {
    private var imageList = mutableListOf<Int>()

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specific_car)

        postToList()

        var viewPager2 = findViewById<ViewPager2>(R.id.viewpagerGarage)

        viewPager2.adapter= ViewPagerAdapter(imageList)
        viewPager2.orientation= ViewPager2.ORIENTATION_HORIZONTAL

        val indicator :CircleIndicator3=findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(viewPager2)


        // set pie chart in XML
     /*   val pieChart = findViewById<PieChart>(R.id.piechart)

        val visitors = ArrayList <PieEntry>()

        visitors.add(PieEntry(500f))
        visitors.add(PieEntry(70f))
        visitors.add(PieEntry(320f))
        visitors.add(PieEntry(200f))
        visitors.add(PieEntry(123f)) */

        val pieChart = findViewById<PieChart> (R.id.piechart)

        val visitors = ArrayList<PieEntry>()

        visitors.add( PieEntry (20f, "2016"))
        visitors.add( PieEntry (20f, "2017"))
        visitors.add(PieEntry (20f, "2018"))
        visitors.add( PieEntry (20f, "2019"))
        visitors.add( PieEntry (20f, "2020"))

        val pieDataSet =PieDataSet(visitors, "visitors")
        pieDataSet.setColors(R.array.colors)
        pieDataSet.valueTextSize = 16f


        val pieData = PieData(pieDataSet)

        pieChart.data = pieData
        pieChart.description.isEnabled=false
        pieChart.centerText = "480 AZN"
        piechart.setCenterTextSize(30f)
            pieChart.animate().toString()













    }

    private fun addToList(title:String,image:Int){

        imageList.add(image)

    }
    private fun postToList(){

        for (i :Int in 1..3){

            addToList("Title",R.drawable.mercedesamg)
            addToList("Title ",R.drawable.aventador)
            addToList("Title ",R.drawable.carrera)
        }

    }
}


