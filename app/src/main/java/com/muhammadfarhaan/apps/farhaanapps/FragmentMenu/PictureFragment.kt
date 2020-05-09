package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.muhammadfarhaan.apps.farhaanapps.Adapter.AdapterPicture
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelPicture

import com.muhammadfarhaan.apps.farhaanapps.R
import kotlinx.android.synthetic.main.fragment_picture.*
import kotlinx.android.synthetic.main.item_detail_picture.*

/*
* Tanggal Pengerjaan  : 07-Mei-2020
* Deskripsi Pekerjaan : Membuat Fragment untuk menampilkan atribut-atribut dari ModelPicture dan
*                       diisi sesuai keinginan dan ditampilkan menggunakan RecyclerView
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

/**
 * A simple [Fragment] subclass.
 */
class PictureFragment : Fragment() {

    val REQUEST_CODE = 100

    private val item3 = listOf(
        ModelPicture("GIFT 1",R.drawable.gift),
        ModelPicture("GIFT 2",R.drawable.gift2),
        ModelPicture("GIFT 3",R.drawable.gift3),
        ModelPicture("GIFT 1",R.drawable.gift),
        ModelPicture("GIFT 2",R.drawable.gift2),
        ModelPicture("GIFT 3",R.drawable.gift3),
        ModelPicture("GIFT 1",R.drawable.gift),
        ModelPicture("GIFT 2",R.drawable.gift2)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_picture, container, false)

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here

        recycler_picture.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = GridLayoutManager(activity, 2)
            // set the custom adapter to the RecyclerView
            adapter = AdapterPicture(item3){

            }
            //openGalleryForImage()
        }

    }

    private fun openGalleryForImage() {
       val intent = Intent(Intent.ACTION_VIEW)
        intent.type = "image/*"
        intent.setAction(Intent.ACTION_GET_CONTENT)
        startActivityForResult(intent, REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE){
            //picture.setImageURI(data?.data) // handle chosen image
        }
    }

    companion object {
        fun newInstance(): JadwalFragment = JadwalFragment()
    }
}
