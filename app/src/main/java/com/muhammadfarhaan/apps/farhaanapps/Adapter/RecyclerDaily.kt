package com.muhammadfarhaan.apps.farhaanapps.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelJadwal
import com.muhammadfarhaan.apps.farhaanapps.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail_daily.view.*

/*
* Tanggal Pengerjaan  : 06-Mei-2020
* Deskripsi Pekerjaan : Membuat Adapter Recycler untuk mengikat item-item di layout item_detail_daily dan
*                       dikirimkan ke ModelJadwal
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class RecyclerDaily (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_detail_daily, parent, false)) {

    fun bind(jadwal: ModelJadwal) {
        itemView.apply {
            txt_title_daily?.text = jadwal.title
            txt_desc_daily?.text = jadwal.desc
            txt_waktu_daily?.text = jadwal.waktu
            Picasso.get().load(jadwal.image).into(img_daily)
        }
    }

}