package com.example.games.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.games.R

class ViewPagerAdapter(private val context : Context) : PagerAdapter() {

    private var layoutInflater: LayoutInflater? = null



    val Image1 = arrayOf(R.drawable.p1_2128571_4af81cf3, R.drawable.wot_blitz_key_art)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return Image1.size
    }

    @SuppressLint("InflateParams")
    override fun instantiateItem(container: ViewGroup, position: Int): View {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.viewpager_activity2, null)
        val image = v.findViewById<ImageView>(R.id.imageview2)

        image.setImageResource(Image1[position])
        val vp = container as ViewPager
        vp.addView(v, 0)


        return v
    }
}