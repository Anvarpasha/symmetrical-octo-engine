package com.anvarpasha.avtoqaraj_user_app.ui

import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands.DataBrand
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.DataCategories
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.DataIndividualAnn
import com.anvarpasha.avtoqaraj_user_app.ui.shop.stores.DataShopStore

class AllDatas {
    var allShopLogos = arrayOf(R.drawable.avtomed, R.drawable.avtoplanet, R.drawable.avtomed)
    var shopName = arrayOf("Avto Med","Avtoplanet","Avto Med")

   // TODO qiymetleri double et
    var allDetailImg = arrayOf(
       R.drawable.individualdetail,
       R.drawable.individualdetail,
       R.drawable.individualdetail
   )
    var allDetailName = arrayOf("Vakuum nasosu","Fara","Vakuum Nasosu")
    var discPrice = arrayOf("978AZN","323AZN","202AZN")
    var price = arrayOf("3030AZN","500AZN","399AZN")

    var alldetail = arrayOf(R.drawable.seats, R.drawable.buffer, R.drawable.wheels)
    var detailNames = arrayOf("İnteryer aksessuarlar","Eksteryer aksessuarlar","Disklər və Təkərlər")

    val allbrand= arrayOf(R.drawable.bmw, R.drawable.audi, R.drawable.hyundai)


    fun fillShops(count : Int): ArrayList<DataShopStore>{

        val list = ArrayList<DataShopStore>()

        for(i in 0..count){
            val addedShops = DataShopStore(allShopLogos[i%3],shopName[i%3])

            list.add(addedShops)
        }
        return list
    }



     fun fillDetails(count: Int) : ArrayList<DataIndividualAnn>{
        val list = ArrayList<DataIndividualAnn>()

        for (i in 0..count){
            val addedDetail = DataIndividualAnn(allDetailImg[i%allDetailImg.size],allDetailName[i%allDetailImg.size],discPrice[i%allDetailImg.size],price[i%allDetailImg.size])

            list.add(addedDetail)
        }
        return list
    }



     fun fillDataSource(count : Int): ArrayList<DataCategories>{
        var list = ArrayList<DataCategories>()

        //tanimladigimiz datalari for dongusunde elave edirik
        for(i in 0..count){
            val addedDetail = DataCategories(detailNames[i%alldetail.size],alldetail[i%alldetail.size])

            list.add(addedDetail)
        }
        return list
    }


     fun fillDataSourceBrand(count: Int) : ArrayList<DataBrand>{
         var list = ArrayList<DataBrand>()

        for(i in 0..count){
            val addedBrand = DataBrand(allbrand[i%allbrand.size])

            list.add(addedBrand)
        }
        return list
    }





}