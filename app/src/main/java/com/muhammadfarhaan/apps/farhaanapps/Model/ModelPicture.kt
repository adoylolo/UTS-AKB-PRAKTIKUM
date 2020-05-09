package com.muhammadfarhaan.apps.farhaanapps.Model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/*
* Tanggal Pengerjaan  : 07-Mei-2020
* Deskripsi Pekerjaan : Membuat Model untuk menampung item-item dari Adapter Recycler dan dikirimkan
*                       ke PictureFragment
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

@Parcelize
data class ModelPicture(
    val nama: String,
    val image: Int
) : Parcelable