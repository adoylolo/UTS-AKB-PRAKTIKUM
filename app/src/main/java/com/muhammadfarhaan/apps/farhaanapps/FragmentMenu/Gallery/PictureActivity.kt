package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.Gallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.MainMenu
import com.muhammadfarhaan.apps.farhaanapps.R
import java.util.ArrayList

/*
* Tanggal Pengerjaan  : 11-Mei-2020
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class PictureActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    //vars
    private val mNames = ArrayList<String>()
    private val mImage = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_picture)
        Log.d(TAG, "onCreate: started.")
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val pToolbar = findViewById<Toolbar>(R.id.toolbar_picture)
        pToolbar.title = ("Picture")
        pToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)

        pToolbar.setNavigationOnClickListener {
            finish()
            overridePendingTransition(R.anim.noanim,R.anim.animate_slide_up_exit)
        }

        initImageBitmaps()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.")

        mImage.add(R.drawable.gift)
        mNames.add("Picture 1")

        mImage.add(R.drawable.gift2)
        mNames.add("Picture 2")

        mImage.add(R.drawable.gift3)
        mNames.add("Picture 3")

        mImage.add(R.drawable.gift4)
        mNames.add("Picture 4")

        mImage.add(R.drawable.gift5)
        mNames.add("Picture 5")

        initRecyclerView()
    }

    private fun initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.")
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_picture)
        val adapter = RecyclerViewAdapter(this,mNames,mImage)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this,2)
    }

    override fun onBackPressed() {
        finish()
        overridePendingTransition(R.anim.noanim,R.anim.animate_slide_up_exit)
    }
}
