package com.example.multiplerecyclerview.Adapter

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.Model.Popular
import com.example.multiplerecyclerview.R
import kotlinx.android.synthetic.main.popular_item.view.*

class PopularAdapter( var PopularList:ArrayList<Popular>) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>(){
    inner class PopularViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindPopular(Popular:Popular){
            itemView.btnNew.setText(Popular.new)
            itemView.btn_Off.setText(Popular.percent)
            itemView.txtModel.text=Popular.model
            itemView.txtBrand.text=Popular.brand
            itemView.Popular_Rating.rating=Popular.rating.toFloat()
            itemView.txt_popPrice.text=Popular.popPrice
            itemView.txt_popDiscPrice.text=Popular.popDiscPrice
            itemView.imgProduct.setImageResource(Popular.img)
            itemView.txt_popPrice.showStrikeThrough(Popular.Popular_strike)

            val a=itemView.btnNew
            a.visibility=if(Popular.condition==true ){
                View.VISIBLE
            }
            else{
                View.GONE
            }
            val b=itemView.btn_Off
            b.visibility=if (Popular.Percent_off==true ){
                View.VISIBLE
        }
            else {
                View.GONE
            }
            val c=itemView.txt_popDiscPrice
            c.visibility=if (Popular.discPrice==true){
                View.VISIBLE
            }
            else{
                View.GONE
            }
            }
        fun TextView.showStrikeThrough(show: Boolean) {
            paintFlags=
                if (show) paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                else paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.popular_item,parent,false))
    }

    override fun getItemCount(): Int {
        return PopularList.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.bindPopular(PopularList[position])
    }
}