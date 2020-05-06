package com.muhammadfarhaan.apps.farhaanapps.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelTeman

/*
* Tanggal Pengerjaan  : 06-Mei-2020
* Deskripsi Pekerjaan : Membuat Adapter untuk menghubungkan antara Fragment Friend dengan Fragment
*                       RecyclerDaily untuk menampilkan RecyclerView pada FriendFragment
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class AdapterFriendDaily(private val list: List<ModelTeman>)
    : RecyclerView.Adapter<RecyclerFriend>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerFriend {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerFriend(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerFriend, position: Int) {
        val kegiatan: ModelTeman = list[position]
        holder.bind(kegiatan)
    }

    override fun getItemCount(): Int = list.size

}