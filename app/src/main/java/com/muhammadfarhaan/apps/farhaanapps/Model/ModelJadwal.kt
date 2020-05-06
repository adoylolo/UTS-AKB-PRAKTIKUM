package com.muhammadfarhaan.apps.farhaanapps.Model

/*
* Tanggal Pengerjaan  : 06-Mei-2020
* Deskripsi Pekerjaan : Membuat Model untuk menampung item-item dari Adapter Recycler dan dikirimkan
*                       ke JadwalFragment
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

data class ModelJadwal(
    val title: String,
    val desc: String,
    val waktu: String,
    val image: Int
    )