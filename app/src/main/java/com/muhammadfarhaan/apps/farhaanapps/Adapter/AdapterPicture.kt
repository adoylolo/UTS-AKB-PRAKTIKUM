package com.muhammadfarhaan.apps.farhaanapps.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelPicture

/*
* Tanggal Pengerjaan  : 07-Mei-2020
* Deskripsi Pekerjaan : Membuat Adapter untuk menghubungkan antara PictureFragment dengan Fragment
*                       RecyclerPicture untuk menampilkan RecyclerView pada PictureFragment
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class AdapterPicture (private val list: List<ModelPicture>, val listener: (Int) -> Unit)
    : RecyclerView.Adapter<RecyclerPicture>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerPicture {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerPicture(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerPicture, position: Int) {
        val gambar: ModelPicture = list[position]
        holder.bind(gambar, position, listener)
    }

    override fun getItemCount(): Int = list.size

}