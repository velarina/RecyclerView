package com.example.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class loudhouse(
    val imgLoud: Int,
    val nameLoud: String,
    val descLoud:String
) : Parcelable
