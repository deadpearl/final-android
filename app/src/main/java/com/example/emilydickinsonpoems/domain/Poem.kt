package com.example.emilydickinsonpoems.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Poem(
    @SerializedName("title")
    val title: String,
    @SerializedName("author")
    val author: String,
    @SerializedName("lines")
    val lines: List<String>,
    @SerializedName("linecount")
    val linecount: Int
) : Parcelable {
    constructor() : this ("", "",emptyList<String>() , 0)
}
