package com.muhammadfarhaan.apps.farhaanapps.Walkthrough

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.muhammadfarhaan.apps.farhaanapps.MainMenu
import com.muhammadfarhaan.apps.farhaanapps.R
import com.muhammadfarhaan.apps.farhaanapps.SplashScreen
import kotlinx.android.synthetic.main.activity_walkthrough.*

/*
* Tanggal Pengerjaan  : 03-Mei-2020
* Deskripsi Pekerjaan : Membuat Class Walkthrough yang berfungsi untuk menampilkan Fragment-Fragment
*                       Walktrough dengan ViewPager
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class Walkthrough : AppCompatActivity() {

    lateinit var walkVp: ViewPager
    private lateinit var mDotsLayout: LinearLayout
    private lateinit var Started: Button
    internal var mDots = arrayOfNulls<TextView>(3)
    private var mCurrentPage: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrough)

        walkVp = findViewById(R.id.viewpager_walkthrough)
        mDotsLayout = findViewById(R.id.dotsWalkthrough)
        Started = findViewById(R.id.btnStarted)

        val adapter = AdapterWalkthrough(supportFragmentManager)
        viewpager_walkthrough.adapter = adapter

        addDotsIndicator(0)
        walkVp.addOnPageChangeListener(viewListener)
        walkVp.setPadding(60, 0, 60, 0)

        Started.setEnabled(false)
        Started.setVisibility(View.INVISIBLE)

        btnStarted.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun addDotsIndicator(position: Int) {
        mDotsLayout.removeAllViews()

        for (i in mDots.indices) {
            mDots[i] = TextView(this)
            mDots[i]?.setText(Html.fromHtml("&#8226;"))
            mDots[i]?.setTextSize(60f)
            mDots[i]?.setTextColor(resources.getColor(R.color.dot))
            mDotsLayout.addView(mDots[i])
        }

        if (mDots.size > 0) {
            mDots[position]?.setTextColor(resources.getColor(R.color.putih))
        }
    }

    var viewListener:ViewPager.OnPageChangeListener = object: ViewPager.OnPageChangeListener {
        override fun onPageScrolled(i:Int, v:Float, i1:Int) {
        }
        override fun onPageSelected(i:Int) {
            addDotsIndicator(i)
            mCurrentPage = i
            if (i == mDots.size - 1) {
                Started.setEnabled(true)
                Started.setVisibility(View.VISIBLE)
            }
        }
        override fun onPageScrollStateChanged(i:Int) {
        }
    }
}