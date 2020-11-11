package com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.popBrands

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anvarpasha.avtoqaraj_user_app.AllDatas
import com.anvarpasha.avtoqaraj_user_app.R
import com.anvarpasha.avtoqaraj_user_app.ui.home.allbrands.AdapterBrand
import com.anvarpasha.avtoqaraj_user_app.ui.home.searchDetail.SearchDetail


class PopularBrandIns : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_popular_brand_ins, container, false)

        val data = AllDatas()

        // for popular brands
        val recycPopBrands = view.findViewById<RecyclerView>(R.id.recyclerPopularBrands)
        val popBrandAdapter = AdapterBrand(data.fillPopularBrand(60),AdapterBrand.OnClickListener{

        })
        recycPopBrands.adapter = popBrandAdapter
        val gridlayoutmanager = GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
        recycPopBrands.layoutManager = gridlayoutmanager
        recycPopBrands.setHasFixedSize(true)

        // Inflate the layout for this fragment
        return view
    }

    // set icon to my toolbar
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.brand_menu, menu)
    }

    // set onclick to icons in toolbar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_srch -> {
                startActivity(Intent(context, SearchDetail::class.java))
            }
        }

        return true
    }

}