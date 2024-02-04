package com.stigma15.pandu.MyData

import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Wisata(

	@field:SerializedName("elevation")
	val elevation: String? = null,

	@field:SerializedName("lng")
	val lng: String? = null,

	@field:SerializedName("foto")
	val foto: String? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("webpage")
	val webpage: String? = null,

	@field:SerializedName("deskripsi")
	val deskripsi: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("lat")
	val lat: String? = null
) :Parcelable
