package com.example.multiplerecyclerview.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecyclerview.Adapter.PopularAdapter
import com.example.multiplerecyclerview.Model.Popular
import com.example.multiplerecyclerview.R
import kotlinx.android.synthetic.main.fragment_popular.view.*

/**
 * A simple [Fragment] subclass.
 */
class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var Populars=ArrayList<Popular>()
        Populars.add(Popular("NEW","30 % off","Iphone 11 Pro Max","Apple",4.5,"2500000 KS","2000000 kS",R.drawable.iphone,true,true,true,true))
        Populars.add(Popular("NEW","40 % off","Ipad Pro 2018","Apple",4.0,"1000000 KS","900000 kS",R.drawable.ipad,false,true,false,false))
        Populars.add(Popular("NEW","50 % off","Nitendoo Switch","Nitendo",4.5,"700000 KS","500000 kS",R.drawable.nswitch,true,true,true,true))
        Populars.add(Popular("NEW","60 % off","Msi Rtx 2080Ti","MSI",4.2,"2200000 KS","2000000 kS",R.drawable.rtx,true,true,true,true))
        Populars.add(Popular("NEW","60 % off","Ps4 Pro","SONY",4.6,"850000 KS","800000 kS",R.drawable.ps4,false,true,false,false))
        var popularAdapter=PopularAdapter(Populars)
        var root= inflater.inflate(R.layout.fragment_popular, container, false)
        root.RecyclerPopular.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        root.RecyclerPopular.adapter=popularAdapter
        // Inflate the layout for this fragment
        return root
    }

}
