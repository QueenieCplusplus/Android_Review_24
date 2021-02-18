package com.katepatty.katesshop.ui.main

//import kotlinx.android.synthetic.main.main_fragment.*

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.GridView
import androidx.core.graphics.drawable.toDrawable
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.katepatty.katesshop.R
import com.katepatty.katesshop.R.id.*


class MainFragment : Fragment() {

    val img = intArrayOf(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f)
    val label = arrayOf("sparkling model", "venus model", "free styles model", "fancy model", "lucky model", "chic dark model")


    var gv: GridView? = null


    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {


        val view: View = inflater.inflate(R.layout.main_fragment, container, false)
        //gv = view.findViewById<GridView>(R.id.gv)
        val items = ArrayList<Map<String, Any>>()
        for (i in img.indices) {
            val item = HashMap<String, Any>()
            item["image"] = img[i]
            item["text"] = label[i]
            items.add(item)
        }
        val kadapter = SimpleAdapter(this.activity,
                items, R.layout.grid_view_item, arrayOf("image", "text"),
                intArrayOf(R.id.img, txt))

        gv = view.findViewById(R.id.gv)

        this.gv!!.adapter = kadapter
        this.gv!!.numColumns = 2
        this.gv!!.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(this.activity, "selected item：" + label[position], Toast.LENGTH_SHORT).show()
            val j = label[position].toString()
            //val i =  img[position].toInt()
            // pass param between 2 destinations
            val bundle = bundleOf("j" to j)
            //val bundle = bundleOf("i" to i)
            findNavController().navigate(R.id.action_mainFragment_to_detailFragment, bundle)
            //findNavController().navigate(action_mainFragment_to_detailFragment)

        }
        return view


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}