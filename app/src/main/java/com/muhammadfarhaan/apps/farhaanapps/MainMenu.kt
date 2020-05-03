package com.muhammadfarhaan.apps.farhaanapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.michaldrabik.tapbarmenulib.TapBarMenu
import com.muhammadfarhaan.apps.farhaanapps.Walkthrough.Walkthrough

class MainMenu : AppCompatActivity() {

    private val HOME = "Home"
    private val DAILY = "Daily"
    private val FAVORITE = "Favorite"

    internal lateinit var tapBarMenu: TapBarMenu
    internal lateinit var itemHome: ImageView
    internal lateinit var itemDaily:ImageView
    internal lateinit var itemProfile:ImageView
    internal lateinit var txtTitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        tapBarMenu = findViewById(R.id.tapBarMenu)
        itemDaily = findViewById(R.id.itemDaily)
        itemProfile = findViewById(R.id.itemGallery)
        itemHome = findViewById(R.id.itemHome)


        //implementasi tapBar di click
        tapBarMenu.setOnClickListener { tapBarMenu.toggle() }
    }


}
