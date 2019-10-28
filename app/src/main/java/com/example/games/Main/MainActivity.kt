package com.example.games.Main

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.SearchView

import com.example.games.Adapters.AdapterTabs
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import com.example.games.Adapters.AdapterRecycler
import com.example.games.Model.Tanks
import com.example.games.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = AdapterTabs(supportFragmentManager)
        ViewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(ViewPager)

    }

    fun clik(view: View) {
   //  val TName =findViewById<TextView>(R.id.textNameTanks)
        val NextIntent = Intent(this, Main2Activity::class.java)
            // intent.putExtra("name",TName.getText().toString())
        startActivity(NextIntent)
    }

}
// val webview = WebView(this)
//        setContentView(webview)
//  //webview.loadUrl("https://wot-game.com/germanija-world-of-tanks/")