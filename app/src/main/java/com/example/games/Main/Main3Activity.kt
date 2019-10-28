package com.example.games.Main

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageView
import com.example.games.Adapters.ViewPagerAdapter
import com.example.games.R
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.viewpager_activity2.*


class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // val s = imageview2.getDrawable()

        // Web(s)


        // fun Web(drawable: Drawable) {
        val webView = WebView(this)
        setContentView(webView)

        //   val s1 = findViewById<ImageView>(R.id.imageview2)

        // if (drawable == s1){
        //   webView.loadUrl("https://wotblitz.ru/ru/news/#/")
        // webView.loadUrl("https://wotblitz.ru/ru/encyclopedia/vehicles/usa/")
        //     }else
        //    {
        webView.loadUrl("https://worldoftanks.ru/")
        //  webView.loadUrl("https://wotblitz.ru/ru/news/#/")

    }
}
    //}


