package com.muhammadfarhaan.apps.farhaanapps.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelTeman
import com.muhammadfarhaan.apps.farhaanapps.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail_friend.view.*

/*
* Tanggal Pengerjaan  : 06-Mei-2020
* Deskripsi Pekerjaan : Membuat Adapter Recycler untuk mengikat item-item di layout item_detail_friend dan
*                       dikirimkan ke ModelTeman
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class RecyclerFriend (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_detail_friend, parent, false)) {

    fun bind(friend: ModelTeman) {
        itemView.apply {
            txt_nama?.text = friend.nama
            txt_umur?.text = friend.umur
            Picasso.get().load(friend.image).into(img_teman)
        }
    }

}