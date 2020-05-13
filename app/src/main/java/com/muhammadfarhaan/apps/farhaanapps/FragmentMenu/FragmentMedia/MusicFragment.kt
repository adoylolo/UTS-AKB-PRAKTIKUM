package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu.FragmentMedia


import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.muhammadfarhaan.apps.farhaanapps.R
import kotlinx.android.synthetic.main.fragment_music.*

/*
* Tanggal Pengerjaan  : 11-Mei-2020
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */

/**
 * A simple [Fragment] subclass.
 */
class MusicFragment : Fragment() {

    internal lateinit var button: Button
    val REQ_PICK_AUDIO = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_music, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.btn_music)

        button.setOnClickListener {
            openMusic()
        }
    }

    private fun openMusic() {
        val musicIntent = Intent(
            Intent.ACTION_PICK,
            MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        )
        startActivityForResult(musicIntent, REQ_PICK_AUDIO)
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
