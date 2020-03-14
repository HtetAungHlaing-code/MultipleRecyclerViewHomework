package com.example.multiplerecyclerview.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.multiplerecyclerview.Adapter.CountryAdapter
import com.example.multiplerecyclerview.Model.Country
import com.example.multiplerecyclerview.R
import kotlinx.android.synthetic.main.fragment_country.view.*

/**
 * A simple [Fragment] subclass.
 */
class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var Country=ArrayList<Country>()
        Country.add(Country(R.drawable.yangon,"Yangon"))
        Country.add(Country(R.drawable.mandalay,"Mandalay"))
        Country.add(Country(R.drawable.bagan,"Bagan"))
        Country.add(Country(R.drawable.innlay,"InnLay"))
        var Countryadapter=CountryAdapter(Country)
        var root=inflater.inflate(R.layout.fragment_country, container, false)
        root.RecyclerCountry.layoutManager=GridLayoutManager(context,2)
        root.RecyclerCountry.adapter=Countryadapter
        // Inflate the layout for this fragment
        return root
    }

}
