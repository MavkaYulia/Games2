package com.example.games.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.games.Adapters.AdapterRecycler
import com.example.games.R
import com.example.games.Model.Tanks
import kotlinx.android.synthetic.main.fragment_fragment_france.*


class France : Fragment() {
    val ListNames1= ArrayList<Tanks>()
       //val ListNames1 = listOf("120","221","1515","d","E d","Pz.d. VII","d E 100","Grille d","d")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        return inflater.inflate(R.layout.fragment_fragment_france, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        ListNames1.add(
            Tanks(
                "AMX 13 105",
                "https://i.ytimg.com/vi/CGNIkRDDjn4/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Panhard EBR 105",
                "https://i.ytimg.com/vi/lGPGZKTxk9Q/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Bat.-Châtillon 25 t",
                "https://i.ytimg.com/vi/YtohODYMfAU/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "AMX 30 B",
                "https://i.ytimg.com/vi/6yC1ubttuZc/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "AMX 50 B",
                "https://i.ytimg.com/vi/TGa7VP1xnJM/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "AMX M4 mle. 54",
                "https://i.ytimg.com/vi/xVyFmAs2TCg/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "AMX 50 Foch (155)",
                "https://i.ytimg.com/vi/fJJXKuAw9oY/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "AMX 50 Foch B",
                "https://i.ytimg.com/vi/TNLmMzuqNWM/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Bat.-Châtillon 155 58",
                "https://i.ytimg.com/vi/8dIImj2oXnk/maxresdefault.jpg"
            )
        )

        FranceList.layoutManager = LinearLayoutManager(context)
        FranceList.adapter = AdapterRecycler(context, ListNames1)

    }



}
