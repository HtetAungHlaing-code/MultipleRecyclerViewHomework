package com.example.multiplerecyclerview.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecyclerview.Adapter.TopAdapter
import com.example.multiplerecyclerview.Model.Top_Image
import com.example.multiplerecyclerview.R
import kotlinx.android.synthetic.main.fragment_top.view.*


/**
 * A simple [Fragment] subclass.
 */
class TopFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var TopArray=ArrayList<Top_Image>()
        TopArray.add(Top_Image(R.drawable.sony,"SONY","New Product Form Leica Camera"))
        TopArray.add(Top_Image(R.drawable.nikon,"NIKON","New Product Form Leica Camera"))
        TopArray.add(Top_Image(R.drawable.canon,"CANON","New Product Form Leica Camera"))
        var topAdapter= TopAdapter(TopArray)
        var root=inflater.inflate(R.layout.fragment_top, container, false)
        // Inflate the layout for this fragment
        root.Recyclerview.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        root.Recyclerview.adapter=topAdapter
        return root
    }

}
