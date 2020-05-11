package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.Gallery

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.muhammadfarhaan.apps.farhaanapps.R
import de.hdodenhof.circleimageview.CircleImageView
import java.util.ArrayList

/*
* Tanggal Pengerjaan  : 11-Mei-2020
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class RecyclerViewAdapter(context:Context,
                          imageNames:ArrayList<String>,
                          images:ArrayList<Int>)
    :RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val TAG = "RecyclerViewAdapter"

    private var mImageNames = ArrayList<String>()
    private var mImages = ArrayList<Int>()
    private val mContext: Context

    init{
        mImageNames = imageNames
        mImages = images
        mContext = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_detail_picture, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder: called.")

        Glide.with(mContext)
            .asBitmap()
            .load(mImages[position])
            .into(holder.image)

        holder.imageName.setText(mImageNames[position])

        holder.parentLayout.setOnClickListener(View.OnClickListener {
            Log.d(TAG, "onClick: clicked on: " + mImageNames[position])

            val intent = Intent(mContext, GalleryActivity::class.java)
            intent.putExtra("image", mImages[position])
            intent.putExtra("image_name", mImageNames[position])
            mContext.startActivity(intent)

        })
    }

    override fun getItemCount(): Int {
        return mImageNames.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var image: ImageView
        internal var imageName: TextView
        internal var parentLayout: RelativeLayout

        init {
            image = itemView.findViewById(R.id.picture)
            imageName = itemView.findViewById(R.id.namaPicture)
            parentLayout = itemView.findViewById(R.id.parent_layout)
        }
    }
}