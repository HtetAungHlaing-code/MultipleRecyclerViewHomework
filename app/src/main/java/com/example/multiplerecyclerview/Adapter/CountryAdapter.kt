package com.example.multiplerecyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.Model.Country
import com.example.multiplerecyclerview.R
import kotlinx.android.synthetic.main.country_item.view.*
import java.util.ArrayList

class CountryAdapter(var countryList:ArrayList<Country>) :RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(){
    inner class CountryViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindCountry(Country:Country){
            itemView.countryBg.setBackgroundResource(Country.image)
            itemView.txt_country.text=Country.country
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        return CountryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.country_item,parent,false))
    }

    override fun getItemCount(): Int {
      return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bindCountry(countryList[position])
    }
}