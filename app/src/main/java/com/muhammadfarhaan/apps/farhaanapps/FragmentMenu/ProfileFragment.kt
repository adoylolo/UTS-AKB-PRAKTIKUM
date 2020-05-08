package com.muhammadfarhaan.apps.farhaanapps.FragmentMenu


import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout

import com.muhammadfarhaan.apps.farhaanapps.R
import de.hdodenhof.circleimageview.CircleImageView

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    internal lateinit var mDialog : Dialog
    internal lateinit var view : View
    internal lateinit var FB : ConstraintLayout
    internal lateinit var Telephone : ConstraintLayout
    internal lateinit var Maps : ConstraintLayout
    internal lateinit var About : ConstraintLayout

    fun ProfileFragment(){
        // Required empty public constructor
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_profile, container, false)

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mDialog = Dialog(activity)
        FB = view.findViewById(R.id.FB)
        Telephone = view.findViewById(R.id.Telephone)
        Maps = view.findViewById(R.id.Maps)
        About = view.findViewById(R.id.About)

        Telephone.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:081220875262")
            startActivity(intent)
        })

        Maps.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://goo.gl/maps/ugzfYBmPeQ4ExP6k8")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.google.android.apps.maps")

            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse(
                        ""+uri
                    )))
            }
        })

        FB.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://www.facebook.com/muhammad.farhaan.982")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.facebook.android")

            try {
                startActivity(likeIng)
            } catch (e:ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/muhammad.farhaan.982")))
            }
        })

        About.setOnClickListener(View.OnClickListener {
            val btnClose: CircleImageView

            mDialog.setContentView(R.layout.dialog_profile)
            btnClose = mDialog.findViewById(R.id.btnCloseDialog)
            btnClose.setOnClickListener(View.OnClickListener { mDialog.dismiss() })
            mDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mDialog.show()
        })
    }

    companion object {
        fun newInstance(): JadwalFragment = JadwalFragment()
    }
}
