package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammadfarhaan.apps.farhaanapps.Adapter.AdapterDetailDaily
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelJadwal

import com.muhammadfarhaan.apps.farhaanapps.R
import kotlinx.android.synthetic.main.fragment_jadwal.*

/*
* Tanggal Pengerjaan  : 06-Mei-2020
* Deskripsi Pekerjaan : Membuat Fragment untuk menampilkan atribut-atribut dari ModelJadwal dan
*                       diisi sesuai keinginan dan ditampilkan menggunakan RecyclerView
*                       Membuat Button untuk berpindah dari JadwalFragment ke FriendFragment
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

/**
 * A simple [Fragment] subclass.
 */
class JadwalFragment : Fragment() {

    private val item = listOf(
        ModelJadwal("Sholat Subuh", "Beribadah wajib setiap subuh", "4.45", R.drawable.sholat),
        ModelJadwal("Bermain Game", "Mengerjakan daily di game", "5.00", R.drawable.game),
        ModelJadwal("Merawat Kucing", "Membereskan kandang dan kotoran kucing", "6.00", R.drawable.kucing),
        ModelJadwal("Kuliah", "Pergi kuliah sesuai jadwal", "8.00", R.drawable.kuliah),
        ModelJadwal("Sholat Dzuhur", "Beribadah wajib setiap dzuhur", "12.00", R.drawable.sholat),
        ModelJadwal("Tidur Siang", "Tidur siang untuk memulihkan tenaga", "13.00", R.drawable.tidur),
        ModelJadwal("Sholat Ashar", "Beribadah wajib setiap ashar", "15.00", R.drawable.sholat),
        ModelJadwal("Merawat Kucing", "Membereskan kandang dan kotoran kucing", "16.00", R.drawable.kucing),
        ModelJadwal("Bermain Komputer", "Bermain game atau menonton film di komputer", "17.00", R.drawable.komputer),
        ModelJadwal("Sholat Maghrib", "Beribadah wajib setiap maghrib", "18.00", R.drawable.sholat),
        ModelJadwal("Sholat Isya", "Beribadah wajib setiap isya", "19.00", R.drawable.sholat),
        ModelJadwal("Bermain Komputer", "Bermain game atau menonton film di komputer", "19.30", R.drawable.komputer),
        ModelJadwal("Tidur", "Tidur", "21.00", R.drawable.tidur)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_jadwal, container, false)

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        recycler_daily.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = AdapterDetailDaily(item)
        }
    }

    companion object {
        fun newInstance(): JadwalFragment = JadwalFragment()
    }
}
