package com.example.games.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.games.Fragments.France
import com.example.games.Fragments.Germany
import com.example.games.Fragments.SSSR
import com.example.games.Fragments.US

class AdapterTabs (fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Germany()

            }
            1->{
                US()
            }
            2->{
                France()
            }
            else -> {
                return SSSR()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "Германія"
            1 -> "США"
            2 -> "Франція"
            else -> {
                return "СССР"
            }
        }

    }
}