package com.muhammadfarhaan.apps.farhaanapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.muhammadfarhaan.apps.farhaanapps.Walkthrough.Walkthrough

/*
* Tanggal Pengerjaan  : 03-Mei-2020
* Deskripsi Pekerjaan : Membuat tampilan awal dengan menggunakan SplashScreen sebagai awal dari mulainya
*                       apikasi
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class SplashScreen : AppCompatActivity() {

    private lateinit var topAnim : Animation
    private lateinit var bottomAnim : Animation
    private lateinit var logo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        //window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //Hooks
        logo = findViewById(R.id.logo_splash_screen)

        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.topanim)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.botanim)

        logo.animation = topAnim

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, Walkthrough::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
