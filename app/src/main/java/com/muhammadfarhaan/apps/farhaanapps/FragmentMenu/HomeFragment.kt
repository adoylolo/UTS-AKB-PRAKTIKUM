package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.muhammadfarhaan.apps.farhaanapps.R

/*
* Tanggal Pengerjaan  : 04-Mei-2020
* Deskripsi Pekerjaan : Membuat Fragment HomeFragment untuk menampilkan halaman HOME dan menampilkan
*                       deskripsi-deskripsi tentang saya
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


}
