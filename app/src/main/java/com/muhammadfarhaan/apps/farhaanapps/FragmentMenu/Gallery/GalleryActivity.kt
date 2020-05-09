package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.Gallery

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.muhammadfarhaan.apps.farhaanapps.R
import kotlinx.android.synthetic.main.fragment_detail_picture.*
import android.graphics.drawable.ColorDrawable



class GalleryActivity : AppCompatActivity() {

    private val TAG = "GalleryActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_detail_picture)
        Log.d(TAG, "onCreate: started.")

        getIncomingIntent()

        fullscreen.setOnClickListener {
            val colorValue = ContextCompat.getColor(this,R.color.hitam)
            gallery_bg.setBackgroundColor(colorValue)

            text_fullscreen.visibility = View.INVISIBLE
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
}
