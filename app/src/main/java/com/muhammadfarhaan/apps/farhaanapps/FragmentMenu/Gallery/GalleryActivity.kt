package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.Gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.muhammadfarhaan.apps.farhaanapps.R
import kotlinx.android.synthetic.main.fragment_detail_picture.*

class GalleryActivity : AppCompatActivity() {

    private val TAG = "GalleryActivity"
    private var doubleBackToExitPressedOnce = false
    private var colorValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_detail_picture)
        Log.d(TAG, "onCreate: started.")
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        overridePendingTransition(R.anim.animate_diagonal_right_enter,R.anim.noanim)

        getIncomingIntent()

        colorValue = ContextCompat.getColor(this,R.color.putih)

        fullscreen.setOnClickListener {
            if(colorValue == ContextCompat.getColor(this,R.color.putih)){
                colorValue = ContextCompat.getColor(this,R.color.hitam)
                gallery_bg.setBackgroundColor(colorValue)
                text_fullscreen.visibility = View.INVISIBLE
            }else if(colorValue == ContextCompat.getColor(this,R.color.hitam)){
                colorValue = ContextCompat.getColor(this,R.color.putih)
                gallery_bg.setBackgroundColor(colorValue)
                text_fullscreen.visibility = View.VISIBLE
            }
        }
    }

    private fun getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.")

        if (intent.hasExtra("image") && intent.hasExtra("image_name")) {
            Log.d(TAG, "getIncomingIntent: found intent extras.")

            val Picture = intent.getIntExtra("image",0)
            val imageName = intent.getStringExtra("image_name")

            setImage(Picture, imageName)
        }
    }

    private fun setImage(Picture: Int, imageName: String) {
        Log.d(TAG, "setImage: setting te image and name to widgets.")

        val name = findViewById<TextView>(R.id.text_fullscreen)
        name.setText(imageName)

        val image = findViewById<ImageView>(R.id.fullscreen)
        Glide.with(this)
            .asBitmap()
            .load(Picture)
            .into(image)
    }

    override fun onBackPressed() {
        if(colorValue == ContextCompat.getColor(this,R.color.putih)){
            finish()
            overridePendingTransition(R.anim.noanim,R.anim.animate_diagonal_right_exit)
        }else if(colorValue == ContextCompat.getColor(this,R.color.hitam)){
            colorValue = ContextCompat.getColor(this,R.color.putih)
            gallery_bg.setBackgroundColor(colorValue)
            text_fullscreen.visibility = View.VISIBLE
        }
    }
}
