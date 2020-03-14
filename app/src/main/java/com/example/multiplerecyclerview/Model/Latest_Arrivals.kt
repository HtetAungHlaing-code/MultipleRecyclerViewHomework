package com.example.multiplerecyclerview.Model

import android.widget.RatingBar

data class Latest_Arrivals(
    var arrivalImage:Int,
    var arrivalName:String,
    var arrivalBrand:String,
    var arrivalPrice:String,
    var disc:Boolean,
    var strike:Boolean,
    var rate:Double,
    var arrivalDiscPrice:String
)