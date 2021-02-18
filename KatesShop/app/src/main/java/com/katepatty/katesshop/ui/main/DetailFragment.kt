package com.katepatty.katesshop.ui.main

import android.annotation.SuppressLint
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.katepatty.katesshop.R
import com.katepatty.katesshop.converter
import com.katepatty.katesshop.pricer
import com.katepatty.katesshop.stocker


private const val ARG_PARAM = "param"

class DetailFragment : Fragment() {

    private var paramK: String? = null

    private var tv2: TextView? = null
    private var tv3: TextView? = null
    private var tv4: TextView? = null
    private var tv5: TextView? = null
    private var tv6: TextView? = null
    private var img2: ImageView? = null
    private var dra: Int = R.drawable.d
    private var pri: String? = "890"
    private var inv: String? = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        arguments?.let {
            paramK = it.getString(ARG_PARAM)
        }
    }

    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_detail, container, false)


        tv2 = view.findViewById<TextView>(R.id.tv2)

        // pass param between 2 destinations
        var st = arguments?.getString("j")
        this.tv2!!.text = st


        tv3 = view.findViewById<TextView>(R.id.tv3)
        this.tv3!!.text = "Price:"


        // pass param between 2 destinations
        var stri = arguments!!.getString("j")
        val pri = pricer(stri!!.toString())
        tv4 = view.findViewById<TextView>(R.id.tv4)
        this.tv4!!.text = "NTD" + "\t" + pri


        tv5 = view.findViewById<TextView>(R.id.tv5)

        // pass param between 2 destinations
        var strin = arguments!!.getString("j")
        val inv = stocker(strin!!.toString())

        this.tv5!!.text = "InventoryRemainder:" + "\t" +  inv!!.toString()
        this.tv5!!.setTextColor(R.string.red_for_sell)

        tv6 = view.findViewById<TextView>(R.id.tv6)
        this.tv6!!.text = "Texture: Canvas and so on..."

        img2 = view.findViewById<ImageView>(R.id.img2)
        //val dr: Int = converter(tv2!!.text.toString())

        // pass param between 2 destinations
        var str = arguments!!.getString("j")
        val dra = converter(str!!.toString())
        this.img2!!.setImageResource(dra)
        //this.img2!!.setImageResource(R.drawable.a)
        return view
    }


    companion object {

        fun newInstance(param: String) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM, param)
                }
            }
    }
}


