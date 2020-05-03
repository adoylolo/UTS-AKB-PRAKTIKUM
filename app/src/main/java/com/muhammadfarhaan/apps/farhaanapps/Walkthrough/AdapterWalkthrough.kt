package com.muhammadfarhaan.apps.farhaanapps.Walkthrough

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.NonNull
import androidx.constraintlayout.widget.ConstraintLayout
import com.muhammadfarhaan.apps.farhaanapps.R
import com.muhammadfarhaan.apps.farhaanapps.MainMenu
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.muhammadfarhaan.apps.farhaanapps.FragmentWalkthrough.FirstFragment
import com.muhammadfarhaan.apps.farhaanapps.FragmentWalkthrough.SecondFragment
import com.muhammadfarhaan.apps.farhaanapps.FragmentWalkthrough.ThirdFragment
import kotlinx.android.synthetic.main.activity_walkthrough.*

/*
* Tanggal Pengerjaan  : 03-Mei-2020
* Deskripsi Pekerjaan : Membuat Adapter untuk menghubungkan antara Fragment-Fragment Walkthrough
*                       dengan Class Walkthrough
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class AdapterWalkthrough (fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        FirstFragment(),
        SecondFragment(),
        ThirdFragment()
    )

    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Third Tab"
        }
    }
}