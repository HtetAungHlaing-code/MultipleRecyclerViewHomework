package com.example.multiplerecyclerview.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecyclerview.Adapter.ArrivalsAdapter
import com.example.multiplerecyclerview.Model.Latest_Arrivals
import com.example.multiplerecyclerview.R
import kotlinx.android.synthetic.main.fragment_latest.view.*

/**
 * A simple [Fragment] subclass.
 */
class LatestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var Arrivals=ArrayList<Latest_Arrivals>()
        Arrivals.add(Latest_Arrivals(R.drawable.applewatch,"Apple Watch Series 5","Apple","800000 KS",false,false,4.5,"750000 KS"))
        Arrivals.add(Latest_Arrivals(R.drawable.slingbag,"Sling Bag","Giordando","500000 KS",true,true,4.0,"400000 KS"))
        Arrivals.add(Latest_Arrivals(R.drawable.tshirt,"TShirt","Supreme","30000 KS",true,true,5.0,"15000 KS"))
        Arrivals.add(Latest_Arrivals(R.drawable.jeans,"Jeans","Levis","35000 KS",true,true,3.0,"20000 KS"))
        var arrivalsAdapter=ArrivalsAdapter(Arrivals)
        var root=inflater.inflate(R.layout.fragment_latest, container, false)
        root.Recyclerview_latest.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        root.Recyclerview_latest.adapter=arrivalsAdapter
        // Inflate the layout for this fragment
        return root
    }

}
