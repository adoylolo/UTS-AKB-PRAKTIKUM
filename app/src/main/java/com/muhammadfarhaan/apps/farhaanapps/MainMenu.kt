package com.muhammadfarhaan.apps.farhaanapps

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.michaldrabik.tapbarmenulib.TapBarMenu
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.*
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.Gallery.PictureActivity

/*
* Tanggal Pengerjaan  : 04-Mei-2020
* Deskripsi Pekerjaan : Membuat Class MainMenu yang memiliki TapBarMenu yang berfungsi untuk menghubungkan
*                       MainMenu dengan Fragment-Fragment Menu
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class MainMenu : AppCompatActivity() {

    private val HOME = "Home"
    private val DAILY = "Daily"
    private val FAVORITE = "Favorite"

    internal lateinit var tapBarMenu: TapBarMenu
    internal lateinit var itemHome: ImageView
    internal lateinit var itemJadwal:ImageView
    internal lateinit var itemPicture:ImageView
    internal lateinit var itemMedia:ImageView
    internal lateinit var itemProfile:ImageView
    val REQUEST_CODE = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        tapBarMenu = findViewById(R.id.tapBarMenu)
        itemHome = findViewById(R.id.itemHome)
        itemJadwal = findViewById(R.id.itemJadwal)
        itemPicture = findViewById(R.id.itemPicture)
        itemMedia = findViewById(R.id.itemMedia)
        itemProfile = findViewById(R.id.itemProfile)

        itemHome.setOnClickListener{
            val managerHome = getSupportFragmentManager()
            val transactionHome = managerHome.beginTransaction()
            val homeFrag = HomeFragment()
            //transactionHome.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_left, R.anim.exit_to_left)
            transactionHome.replace(R.id.frame_container, homeFrag, HomeFragment::class.java.getSimpleName())
            transactionHome.addToBackStack(null)
            transactionHome.commit()
        }

        itemJadwal.setOnClickListener{
            val managerDaily = supportFragmentManager
            val transactionDaily = managerDaily.beginTransaction()
            val jadwalFrag = JadwalFragment()
            //transactionDaily.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_left, R.anim.exit_to_left)
            transactionDaily.replace(R.id.frame_container, jadwalFrag, JadwalFragment::class.java.getSimpleName())
            transactionDaily.addToBackStack(null)
            transactionDaily.commit()
        }

        /*itemPicture.setOnClickListener{
            val managerPicture = getSupportFragmentManager()
            val transactionHome = managerPicture.beginTransaction()
            val pictureFrag = PictureFragment()
            //transactionHome.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_left, R.anim.exit_to_left)
            transactionHome.replace(R.id.frame_container, pictureFrag, PictureFragment::class.java.getSimpleName())
            transactionHome.addToBackStack(null)
            transactionHome.commit()
            //openGalleryForImage()
        }*/

        itemPicture.setOnClickListener {
            val intent = Intent(this, PictureActivity::class.java)
            startActivity(intent)
        }

        itemMedia.setOnClickListener {
            val intent = Intent(this, MediaFragment::class.java)
            startActivity(intent)
            //openMusic()
        }

        itemProfile.setOnClickListener{
            val managerProfile = supportFragmentManager
            val transactionProfile = managerProfile.beginTransaction()
            val profileFrag = ProfileFragment()
            //transactionProfile.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
            transactionProfile.replace(R.id.frame_container, profileFrag, ProfileFragment::class.java.getSimpleName())
            transactionProfile.addToBackStack(null)
            transactionProfile.commit()
        }

        val managerHome = supportFragmentManager
        val transactionHome = managerHome.beginTransaction()
        val homeFrag = HomeFragment()
        transactionHome.add(
            R.id.frame_container,
            homeFrag,
            HomeFragment::class.java.getSimpleName()
        )

        transactionHome.commit()

        tapBarMenu.setOnClickListener { tapBarMenu.toggle() }
    }

    private fun openGalleryForImage() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.type = "image/*"
        intent.setAction(Intent.ACTION_GET_CONTENT)
        startActivityForResult(intent, REQUEST_CODE)
    }

    private fun openMusic() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.type = "music/*"
        intent.setAction(Intent.ACTION_GET_CONTENT)
        startActivityForResult(intent, REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE){
            //picture.setImageURI(data?.data) // handle chosen image
        }
    }
}
