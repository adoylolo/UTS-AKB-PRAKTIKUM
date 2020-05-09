package com.muhammadfarhaan.apps.farhaanapps.Adapter

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.PictureFragment
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelPicture
import com.muhammadfarhaan.apps.farhaanapps.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail_picture.view.*



/*
* Tanggal Pengerjaan  : 07-Mei-2020
* Deskripsi Pekerjaan : Membuat Adapter Recycler untuk mengikat item-item di layout item_detail_picture dan
*                       dikirimkan ke ModelPicture
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class RecyclerPicture (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_detail_picture, parent, false)) {

    fun bind(Picture: ModelPicture, pos: Int, listener: (Int) -> Unit) {

        val name  = Picture.nama
        val img  = Picture.image

        super.itemView
        itemView.setTag(this)
        itemView.apply {
            namaPicture?.text = Picture.nama
            Picasso.get().load(Picture.image).into(picture)
            itemView.setOnClickListener {

            }
        }
    }
}