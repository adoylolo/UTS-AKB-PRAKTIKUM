package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia.AdapterMedia

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia.MusicFragment
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia.VideoFragment
import com.muhammadfarhaan.apps.farhaanapps.FragmentWalkthrough.FirstFragment
import com.muhammadfarhaan.apps.farhaanapps.FragmentWalkthrough.SecondFragment
import com.muhammadfarhaan.apps.farhaanapps.FragmentWalkthrough.ThirdFragment

/*
* Tanggal Pengerjaan  : 11-Mei-2020
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class Adapter (fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        MusicFragment(),
        VideoFragment()
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