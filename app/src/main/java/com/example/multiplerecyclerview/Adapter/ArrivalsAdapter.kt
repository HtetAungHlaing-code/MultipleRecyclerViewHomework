package com.example.multiplerecyclerview.Adapter

import android.graphics.Paint
import android.text.style.StrikethroughSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.Model.Latest_Arrivals
import com.example.multiplerecyclerview.R
import kotlinx.android.synthetic.main.arrivals_item.view.*
import kotlinx.android.synthetic.main.top_item.view.*
import java.util.ArrayList

class ArrivalsAdapter(var arrivalsList:ArrayList<Latest_Arrivals>) :RecyclerView.Adapter<ArrivalsAdapter.ArrivalsViewHolder>(){
    inner class ArrivalsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindArrivals(Arrivals:Latest_Arrivals){
            itemView.arrivalBg.setBackgroundResource(Arrivals.arrivalImage)
            itemView.txtArr_Name.text=Arrivals.arrivalName
            itemView.txtArr_Brand.text=Arrivals.arrivalBrand
            itemView.txtPrice.text=Arrivals.arrivalPrice
            itemView.txtDisc_Price.text=Arrivals.arrivalDiscPrice
            itemView.Arr_Rating.rating=Arrivals.rate.toFloat()
            itemView.txtPrice.showStrikeThrough(Arrivals.strike)

            val a=itemView.txtDisc_Price
            a.visibility = if (Arrivals.disc==true){
                View.VISIBLE
            }else{
                View.GONE
            }
        }
        fun TextView.showStrikeThrough(show: Boolean) {
            paintFlags=
                if (show) paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                else paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArrivalsViewHolder {
        return ArrivalsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.arrivals_item,parent,false))
    }

    override fun getItemCount(): Int {
       return arrivalsList.size
    }

    override fun onBindViewHolder(holder: ArrivalsViewHolder, position: Int) {
       holder.bindArrivals(arrivalsList[position])
    }
}