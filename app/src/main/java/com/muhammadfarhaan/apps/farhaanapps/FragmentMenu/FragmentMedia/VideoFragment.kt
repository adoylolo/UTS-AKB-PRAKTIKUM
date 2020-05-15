package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia.AdapterMedia.VideoAdapter
import com.muhammadfarhaan.apps.farhaanapps.Model.ModelVideo

import com.muhammadfarhaan.apps.farhaanapps.R

/*
* Tanggal Pengerjaan  : 14-Mei-2020
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

/**
 * A simple [Fragment] subclass.
 */
class VideoFragment : Fragment() {

    lateinit var recyclervideo:RecyclerView
    var arrayList:ArrayList<ModelVideo> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_video, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclervideo = view.findViewById(R.id.recycler_video)
        var layoutManager = LinearLayoutManager(context)
        recyclervideo.layoutManager = layoutManager
        recyclervideo.setHasFixedSize(true)

        arrayList = ArrayList()
        var videoList = ModelVideo(" The God of High School Trailer","https://www.youtube.com/embed/oqjwUfprNAk")
        arrayList.add(videoList)
        videoList = ModelVideo(" Solo Leveling Anime Trailer","https://www.youtube.com/embed/pXQOwNVFxa8")
        arrayList.add(videoList)
        videoList = ModelVideo(" Mushoku Tensei Official Teaser","https://www.youtube.com/embed/1TiBoHQUj3I")
        arrayList.add(videoList)
        videoList = ModelVideo(" Ten-Sura Season 2 Official Trailer","https://www.youtube.com/embed/8F1STmoD06o")
        arrayList.add(videoList)

        val mContext = activity!!.applicationContext
        val youtubeAdapter = VideoAdapter(arrayList, mContext)
        recyclervideo.adapter = youtubeAdapter
    }
}
