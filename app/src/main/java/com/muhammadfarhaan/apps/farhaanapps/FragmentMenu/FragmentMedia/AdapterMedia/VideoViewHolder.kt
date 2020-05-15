package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia.AdapterMedia

import android.annotation.SuppressLint
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia.Interface.CustomItemClickListener
import com.muhammadfarhaan.apps.farhaanapps.R

/*
* Tanggal Pengerjaan  : 15-Mei-2020
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

class VideoViewHolder@SuppressLint("SetJavaScriptEnabled")
constructor(itemView:View):RecyclerView.ViewHolder(itemView) {

    var webView: WebView
    var videoTitle: TextView

    init{
        webView = itemView.findViewById(R.id.video)
        videoTitle = itemView.findViewById(R.id.video_title)
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        webView.settings.javaScriptEnabled = true
    }
}