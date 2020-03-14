package com.example.multiplerecyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.Model.Top_Image
import com.example.multiplerecyclerview.R
import kotlinx.android.synthetic.main.top_item.view.*

class TopAdapter (var TopList:ArrayList<Top_Image>):RecyclerView.Adapter<TopAdapter.TopViewHolder>(){
    inner class TopViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindtop(Top:Top_Image){
            itemView.topCardView.setBackgroundResource(Top.image)
            itemView.txtBrand.text=Top.brand
            itemView.txtModel.text=Top.model
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopViewHolder {
        return TopViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.top_item,parent,false))
    }

    override fun getItemCount(): Int {
        return TopList.size
    }

    override fun onBindViewHolder(holder: TopViewHolder, position: Int) {
       holder.bindtop(TopList[position])
    }
}