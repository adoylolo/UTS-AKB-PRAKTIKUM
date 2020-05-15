package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia.AdapterMedia

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelVideo
import com.muhammadfarhaan.apps.farhaanapps.R

/*
* Tanggal Pengerjaan  : 15-Mei-2020
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class VideoAdapter (val list: ArrayList<ModelVideo>, context:Context): RecyclerView.Adapter<VideoViewHolder>() {

    var aContext = context

    override fun onCreateViewHolder(viewGroup: ViewGroup, pos:Int):VideoViewHolder {
        val view = LayoutInflater.from(aContext).inflate(R.layout.item_video, viewGroup, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(youtube:VideoViewHolder, pos:Int) {
        val current: ModelVideo = list[pos]
        youtube.webView.loadUrl(current.mVideoUrl)
        youtube.videoTitle.text = current.mVideoTitle
    }

    override fun getItemCount(): Int = list.size
}