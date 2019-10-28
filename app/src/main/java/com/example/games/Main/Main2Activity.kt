package com.example.games.Main

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.get
import com.example.games.R
import androidx.viewpager.widget.ViewPager
import com.example.games.Adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.viewpager_activity2.*


class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

       val viewpager = findViewById<ViewPager>(R.id.viewPager2)

        val adapter = ViewPagerAdapter(this)
        viewpager.adapter = adapter



      }

     fun onClick(view: View){

         val NextIntent1 = Intent(this, Main3Activity::class.java)
         // intent.putExtra("name",TName.getText().toString())
         startActivity(NextIntent1)
     }

}






