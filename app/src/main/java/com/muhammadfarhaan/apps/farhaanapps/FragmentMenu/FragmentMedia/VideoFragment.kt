package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.muhammadfarhaan.apps.farhaanapps.R

/*
* Tanggal Pengerjaan  : 11-Mei-2020
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

/**
 * A simple [Fragment] subclass.
 */
class VideoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video, container, false)
    }


}
