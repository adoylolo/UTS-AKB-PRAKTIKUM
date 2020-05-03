package com.muhammadfarhaan.apps.farhaanapps.FragmentWalkthrough


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.muhammadfarhaan.apps.farhaanapps.R

/*
* Tanggal Pengerjaan  : 03-Mei-2020
* Deskripsi Pekerjaan : Membuat Fragment dengan layout fragment_second.xml untuk ditampilkan di
*                       Class Walkthrough yang berisi deskripsi tentang halaman JADWAL
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


}
