package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammadfarhaan.apps.farhaanapps.Adapter.AdapterDetailDaily
import com.muhammadfarhaan.apps.farhaanapps.Adapter.AdapterFriendDaily
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelJadwal
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelTeman

import com.muhammadfarhaan.apps.farhaanapps.R
import kotlinx.android.synthetic.main.fragment_friend.*
import kotlinx.android.synthetic.main.fragment_jadwal.*

/*
* Tanggal Pengerjaan  : 06-Mei-2020
* Deskripsi Pekerjaan : Membuat Fragment untuk menampilkan atribut-atribut dari ModelTeman dan
*                       diisi sesuai keinginan dan ditampilkan menggunakan RecyclerView
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

/**
 * A simple [Fragment] subclass.
 */
class FriendFragment : Fragment() {

    private val item2 = listOf(
        ModelTeman("Ananda Marwanaya P", "20 Tahun",  R.drawable.ananda),
        ModelTeman("Ari Sumardi", "20 Tahun",  R.drawable.ari),
        ModelTeman("Dimas Arestu P", "20 Tahun",  R.drawable.dimas),
        ModelTeman("M Nizar U", "20 Tahun",  R.drawable.nizar)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_friend, container, false)

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here

        recycler_friend.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL ,false)
            // set the custom adapter to the RecyclerView
            adapter = AdapterFriendDaily(item2)
        }

    }

    companion object {
        fun newInstance(): JadwalFragment = JadwalFragment()
    }


}
