package com.muhammadfarhaan.apps.farhaanapps.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelJadwal

/*
* Tanggal Pengerjaan  : 06-Mei-2020
* Deskripsi Pekerjaan : Membuat Adapter untuk menghubungkan antara Fragment Jadwal dengan Fragment
*                       RecyclerDaily untuk menampilkan RecyclerView pada JadwalFragment
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class AdapterDetailDaily(private val list: List<ModelJadwal>)
    : RecyclerView.Adapter<RecyclerDaily>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerDaily {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerDaily(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerDaily, position: Int) {
        val kegiatan: ModelJadwal = list[position]
        holder.bind(kegiatan)
    }

    override fun getItemCount(): Int = list.size

}