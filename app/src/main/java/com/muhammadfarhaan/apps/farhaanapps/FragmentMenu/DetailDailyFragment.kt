package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

import com.muhammadfarhaan.apps.farhaanapps.R

/**
 * A simple [Fragment] subclass.
 */
class DetailDailyFragment : Fragment() {

    internal lateinit var jadwal: CardView
    internal lateinit var teman: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_detail_daily, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here


        jadwal = view.findViewById(R.id.card1)
        teman = view.findViewById(R.id.card2)

        jadwal.setOnClickListener(View.OnClickListener {
            val jadwalFragment = JadwalFragment()
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction!!.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.noanim, R.anim.noanim)
            fragmentTransaction!!.replace(
                R.id.frame_container,
                jadwalFragment,
                JadwalFragment::class.java.getSimpleName()
            )
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        })

        teman.setOnClickListener(View.OnClickListener {
            val friendFragment = FriendFragment()
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction!!.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.noanim, R.anim.noanim)
            fragmentTransaction!!.replace(
                R.id.frame_container,
                friendFragment,
                FriendFragment::class.java.getSimpleName()
            )
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        })
    }

}
