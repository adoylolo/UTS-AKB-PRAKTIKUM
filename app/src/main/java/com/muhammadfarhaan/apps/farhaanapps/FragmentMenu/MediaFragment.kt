package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia.AdapterMedia.Adapter

import com.muhammadfarhaan.apps.farhaanapps.R
import kotlinx.android.synthetic.main.fragment_media.*

/*
* Tanggal Pengerjaan  : 11-Mei-2020
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class MediaFragment : AppCompatActivity() {

    /**
     * The [ViewPager] that will host the section contents.
     */
    private var mViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_media)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val mToolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar_media)
        mToolbar.title = ("Media")
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)

        mToolbar.setNavigationOnClickListener {
            finish()
            overridePendingTransition(R.anim.noanim,R.anim.animate_slide_up_exit)
        }

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        val adapter = Adapter(supportFragmentManager)

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container) as ViewPager
        container.adapter = adapter

        val tabLayout = findViewById(R.id.tabLayout) as TabLayout

        mViewPager?.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(mViewPager))
    }

    override fun onBackPressed() {
        finish()
        overridePendingTransition(R.anim.noanim,R.anim.animate_slide_up_exit)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
