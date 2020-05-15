package com.muhammadfarhaan.apps.farhaanapps

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
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
    internal lateinit var itemDaily:ImageView
    internal lateinit var itemPicture:ImageView
    internal lateinit var itemMedia:ImageView
    internal lateinit var itemProfile:ImageView
    val REQ_PICK_PHOTO = 10000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        tapBarMenu = findViewById(R.id.tapBarMenu)
        itemHome = findViewById(R.id.itemHome)
        itemDaily = findViewById(R.id.itemDaily)
        itemPicture = findViewById(R.id.itemPicture)
        itemMedia = findViewById(R.id.itemMedia)
        itemProfile = findViewById(R.id.itemProfile)

        itemHome.setOnClickListener{
            val managerHome = getSupportFragmentManager()
            val transactionHome = managerHome.beginTransaction()
            val homeFrag = HomeFragment()
            transactionHome.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.noanim, R.anim.noanim)
            transactionHome.replace(R.id.frame_container, homeFrag, HomeFragment::class.java.getSimpleName())
            transactionHome.addToBackStack(null)
            transactionHome.commit()
        }

        itemDaily.setOnClickListener{
            val managerDaily = supportFragmentManager
            val transactionDaily = managerDaily.beginTransaction()
            val dailyFrag = DetailDailyFragment()
            transactionDaily.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.noanim, R.anim.noanim)
            transactionDaily.replace(R.id.frame_container, dailyFrag, DetailDailyFragment::class.java.getSimpleName())
            transactionDaily.addToBackStack(null)
            transactionDaily.commit()
        }

        itemPicture.setOnClickListener {
            val intent = Intent(this, PictureActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.animate_slide_up_enter,R.anim.noanim)
            openGalleryForImage()
        }

        itemMedia.setOnClickListener {
            val intent = Intent(this, MediaFragment::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.animate_slide_up_enter,R.anim.noanim)
        }

        itemProfile.setOnClickListener{
            val managerProfile = supportFragmentManager
            val transactionProfile = managerProfile.beginTransaction()
            val profileFrag = ProfileFragment()
            transactionProfile.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.noanim, R.anim.noanim)
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
        val pictureIntent = Intent(
            Intent.ACTION_VIEW,
            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        )
        this.startActivityForResult(pictureIntent, REQ_PICK_PHOTO)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                //the selected audio.
                val uri = data!!.data
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}
