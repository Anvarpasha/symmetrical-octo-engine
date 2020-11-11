package com.anvarpasha.avtoqaraj_user_app

import com.anvarpasha.avtoqaraj_user_app.ui.garage.DataGarage
import com.anvarpasha.avtoqaraj_user_app.ui.garage.newmark.DataaddedMark
import com.anvarpasha.avtoqaraj_user_app.ui.garage.specificCar.technique.DataTech
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.DataBrand
import com.anvarpasha.avtoqaraj_user_app.ui.home.categories.DataCategories
import com.anvarpasha.avtoqaraj_user_app.ui.profile.allproducts.DataProducts
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.DataIndividualAnn
import com.anvarpasha.avtoqaraj_user_app.ui.shop.announc.innerAnnounce.descDetail.DataDescribed
import com.anvarpasha.avtoqaraj_user_app.ui.shop.dillers.Datadillers
import com.anvarpasha.avtoqaraj_user_app.ui.shop.stores.DataShopStore

class AllDatas {
    // shop Store
    var allShopLogos = arrayOf(R.drawable.avtomed, R.drawable.avtoplanet, R.drawable.avtomed)
    var shopName = arrayOf("Avto Med","Avtoplanet","Avto Med")

   // TODO qiymetleri double et
    // individual announcement
    var allDetailImg = arrayOf(
       R.drawable.individualdetail,
       R.drawable.individualdetail,
       R.drawable.individualdetail
   )
    var allDetailName = arrayOf("Vakuum nasosu","Fara","Vakuum Nasosu")
    var discPrice = arrayOf("978AZN","323AZN","202AZN")
    var price = arrayOf("3030AZN","500AZN","399AZN")


    // categories
    var alldetail = arrayOf(R.drawable.seats, R.drawable.buffer, R.drawable.wheels)
    var detailNames = arrayOf("İnteryer aksessuarlar","Eksteryer aksessuarlar","Disklər və Təkərlər")

    // inner categories
    val allAccPics = arrayOf(
        R.drawable.speedometer,
        R.drawable.speedometer,
        R.drawable.speedometer,
    )
    val allAccNames = arrayOf("Mats","Speedometer","Seat covers","Steering wheels","Windshield sun shades","Trunk covers")


    // brands
    val allbrand= arrayOf(R.drawable.bmw, R.drawable.audi, R.drawable.hyundai)

    // dealers
    val dealerLogo = arrayOf(R.drawable.rectmercedes,R.drawable.rectmercedes,R.drawable.rectmercedes)
    var dealermap = arrayOf(R.drawable.map,R.drawable.map,R.drawable.map)
    var dealerName = arrayOf("Mercedes-Benz Abşeron Avtomobil Mərkəzi","Mercedes-Benz Abşeron Avtomobil Mərkəzi","Mercedes-Benz Abşeron Avtomobil Mərkəzi")
    var workHours = arrayOf("B.e – C: 09:00-18:00 ","B.e – C: 09:00-18:00 ","B.e – C: 09:00-18:00 ")

    // garageCars
    var cars = arrayOf(R.drawable.mercedesamg,R.drawable.aventador,R.drawable.carrera)
    var carnames = arrayOf("Mercedes", "Aventador", "Carrera")
    var carnamesBack = arrayOf("AMG","Lambo","Porch")
    var carlogos  = arrayOf(R.drawable.mercylogo,R.drawable.lambologo,R.drawable.porchlogo)
    var carRestyle = arrayOf("c219 [restyling] [2008-2010]","c219 [restyling] [2008-2010]","c219 [restyling] [2008-2010]")

    // addedMarks ins Garage
    var vehicleType = arrayOf(R.drawable.motorbike,R.drawable.motorbike,R.drawable.motorbike)
    var vehicleName = arrayOf("Motosikl","Motosikl","Motosikl")

    // added products in Profile
    var productImg = arrayOf(R.drawable.stupitsa,R.drawable.stupitsa)
    var response = arrayOf("Deaktiv","Aktiv","Təsdiq gözləyən")
    var category = arrayOf("Category- Eksteryer aksessuarlar","Category- Eksteryer aksessuarlar","Category- Eksteryer aksessuarlar")
    var prodName = arrayOf("Asqı qolu vtulkası ön alt Porsche Panamera 970","Asqı qolu vtulkası ön alt Porsche Panamera 970","Asqı qolu vtulkası")
    var prodprice = arrayOf("279.29AZN","279.29AZN","279.29AZN")
    var delivery  = arrayOf("(10 days)","(90 days)","(43 days)")

    // added tech indicators in Garage
    var type = arrayOf("Front track","Body type","Number of seater ","Trailer load (with brakes)")
    var info = arrayOf("1600kg","1405 mm","4686mm","Coupe")


    // added described detail in shop ->individual announcement
    var sort = arrayOf("Avtotəmir hissələri","Xodovoy","Stupitsa")


    // categories in home
    fun fillDataSource(count : Int): ArrayList<DataCategories>{
        var list = ArrayList<DataCategories>()

        //tanimladigimiz datalari for dongusunde elave edirik
        for(i in 0..count){
            val addedDetail = DataCategories(detailNames[i%alldetail.size],alldetail[i%alldetail.size])

            list.add(addedDetail)
        }
        return list
    }


    // brands in home
    fun fillDataSourceBrand(count: Int) : ArrayList<DataBrand>{
        val list = ArrayList<DataBrand>()

        for(i in 0..count){
            val addedBrand = DataBrand(allbrand[i%allbrand.size])

            list.add(addedBrand)
        }
        return list
    }


    // brand inside in home
    fun fillPopularBrand(count: Int) : ArrayList<DataBrand>{
        val list = ArrayList<DataBrand>()

        for(i in 0..count){
            val addedPopBrand = DataBrand(allbrand[i%allbrand.size])

            list.add(addedPopBrand)
        }
        return list
    }


    // shop Store in shop
    fun fillShops(count : Int): ArrayList<DataShopStore>{

        val list = ArrayList<DataShopStore>()

        for(i in 0..count){
            val addedShops = DataShopStore(allShopLogos[i%3],shopName[i%3])

            list.add(addedShops)
        }
        return list
    }


     // individual Announcement in shop
     fun fillDetails(count: Int) : ArrayList<DataIndividualAnn>{
        val list = ArrayList<DataIndividualAnn>()

        for (i in 0..count){
            val addedDetail = DataIndividualAnn(allDetailImg[i%allDetailImg.size],allDetailName[i%allDetailImg.size],discPrice[i%allDetailImg.size],price[i%allDetailImg.size])

            list.add(addedDetail)
        }
        return list
    }


    // interior categories in home
    fun fillAccessoriesData(count: Int) : ArrayList<DataCategories>{
        val list=ArrayList<DataCategories>()
        for(i in 0..count){
            val addedAcc = DataCategories(allAccNames[i%allAccPics.size],allAccPics[i%allAccPics.size])

            list.add(addedAcc)
        }
        return list
    }


    // discounted details in dillers
    fun filldiscounted(count: Int) : ArrayList<DataIndividualAnn>{
        val list= ArrayList<DataIndividualAnn>()

        for (i in 0..count){

            val addedDetail = DataIndividualAnn(allDetailImg[i%allDetailImg.size],allDetailName[i%allDetailImg.size],discPrice[i%allDetailImg.size],price[i%allDetailImg.size])

            list.add(addedDetail)
        }
        return list
    }

    //dilers in shop fragment
    fun fillDiller(count: Int) : ArrayList<Datadillers>{
        val list = ArrayList<Datadillers>()

        for (i in 0..count){
            val addedDealer = Datadillers(dealermap[i%dealermap.size],dealerLogo[i%dealermap.size],dealerName[i%dealermap.size],workHours[i%dealermap.size])

            list.add(addedDealer)
        }
        return list
    }


    // garageCars in Garage
    fun fillGarageCars(count: Int) : ArrayList<DataGarage>{
        val list = ArrayList<DataGarage>()

        for(i in 0..count){
            val addedCars = DataGarage(cars[i%cars.size],carnamesBack[i%cars.size],carlogos[i%cars.size],carnames[i%cars.size],carRestyle[i%cars.size])

          list.add(addedCars)
        }
        return list
    }

    // addedMarks ins Garage
    fun fillMarks(count: Int) : ArrayList<DataaddedMark>{
        val list = ArrayList<DataaddedMark>()

        for(i in 0..count){
            val addedMarks = DataaddedMark(vehicleType[i%vehicleType.size],vehicleName[i%vehicleType.size])

            list.add(addedMarks)
        }
        return list
    }

    // products in profile
    fun fillproducts(count : Int) : ArrayList<DataProducts>{
        var list = ArrayList<DataProducts>()

        for(i in 0..count){
            val addedProds = DataProducts(productImg[i%productImg.size],response[i%productImg.size],category[i%productImg.size],prodName[i%productImg.size],prodprice[i%productImg.size],delivery[i%productImg.size])

            list.add(addedProds)
        }
        return list

    }


    // technique indicators in Garage
    fun fillTechs(count: Int) : ArrayList<DataTech>{
        var list = ArrayList<DataTech>()

        for(i in 0..count){
            val addedTechs = DataTech(type[i%type.size],info[i%type.size])

            list.add(addedTechs)
        }
        return list
    }

    // decribed details in  shop -> individual announcment
    fun fillDescribed(count: Int) : ArrayList<DataDescribed>{
        var list = ArrayList<DataDescribed>()

        for(i in 0..count){
            val addedDesc = DataDescribed(sort[i%sort.size])

            list.add(addedDesc)
        }
        return list
    }

    // search button in home fragment only individual w/out Categories
    fun fillsearch(count: Int) : ArrayList<DataIndividualAnn>{
        val list= ArrayList<DataIndividualAnn>()

        for (i in 0..count){

            val addedSearch = DataIndividualAnn(allDetailImg[i%allDetailImg.size],allDetailName[i%allDetailImg.size],discPrice[i%allDetailImg.size],price[i%allDetailImg.size])

            list.add(addedSearch)
        }
        return list
    }

    // searchCat icon(magnifier) - >  Categories
    fun searchCat(count : Int): ArrayList<DataCategories>{
        var list = ArrayList<DataCategories>()

        //tanimladigimiz datalari for dongusunde elave edirik
        for(i in 0..count){
            val addedDetail = DataCategories(detailNames[i%alldetail.size],alldetail[i%alldetail.size])

            list.add(addedDetail)
        }
        return list
    }


    // searchCat icon(magnifier)  - > Individual
    fun searchCatInd(count: Int) : ArrayList<DataIndividualAnn>{
        val list= ArrayList<DataIndividualAnn>()

        for (i in 0..count){

            val addedSearch = DataIndividualAnn(allDetailImg[i%allDetailImg.size],allDetailName[i%allDetailImg.size],discPrice[i%allDetailImg.size],price[i%allDetailImg.size])

            list.add(addedSearch)
        }
        return list
    }











}