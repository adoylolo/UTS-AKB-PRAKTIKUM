package com.muhammadfarhaan.apps.farhaanapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.michaldrabik.tapbarmenulib.TapBarMenu
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.HomeFragment
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.JadwalFragment
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.ProfileFragment

class MainMenu : AppCompatActivity() {

    private val HOME = "Home"
    private val DAILY = "Daily"
    private val FAVORITE = "Favorite"

    internal lateinit var tapBarMenu: TapBarMenu
    internal lateinit var itemHome: ImageView
    internal lateinit var itemJadwal:ImageView
    internal lateinit var itemProfile:ImageView
    internal lateinit var txtTitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        tapBarMenu = findViewById(R.id.tapBarMenu)
        itemJadwal = findViewById(R.id.itemJadwal)
        itemProfile = findViewById(R.id.itemProfile)
        itemHome = findViewById(R.id.itemHome)

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
            val managerDaily = getSupportFragmentManager()
            val transactionDaily = managerDaily.beginTransaction()
            val jadwalFrag = JadwalFragment()
            //transactionDaily.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_left, R.anim.exit_to_left)
            transactionDaily.replace(R.id.frame_container, jadwalFrag, JadwalFragment::class.java.getSimpleName())
            transactionDaily.addToBackStack(null)
            transactionDaily.commit()
        }

        itemProfile.setOnClickListener{
            val managerProfile = getSupportFragmentManager()
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
}
