package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.Gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.R
import java.util.ArrayList

class PictureActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    //vars
    private val mNames = ArrayList<String>()
    private val mImageUrls = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_picture)
        Log.d(TAG, "onCreate: started.")

        initImageBitmaps()
    }

    private fun initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.")

        mImageUrls.add(R.drawable.gift)
        mNames.add("Picture 1")

        mImageUrls.add(R.drawable.gift2)
        mNames.add("Picture 2")

        mImageUrls.add(R.drawable.gift3)
        mNames.add("Picture 3")

        mImageUrls.add(R.drawable.gift4)
        mNames.add("Picture 4")

        mImageUrls.add(R.drawable.gift5)
        mNames.add("Picture 5")

        initRecyclerView()
    }

    private fun initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.")
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_picture)
        val adapter = RecyclerViewAdapter(this,mNames,mImageUrls)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this,2)
    }
}
