package com.muhammadfarhaan.apps.farhaanapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, Walkthrough::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
