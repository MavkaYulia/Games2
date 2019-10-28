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
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_germany.*

class Germany : Fragment() {


    val ListNames1= ArrayList<Tanks>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_germany, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        ListNames1.add(
            Tanks(
                "Rheinmetall Panzerwagen",
                "https://i.ytimg.com/vi/bWb6WsqenX4/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "E 50 Ausf. M",
                "https://i.ytimg.com/vi/UHfbw681Uic/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Leopard 1",
                "https://i.ytimg.com/vi/8qSmBEmt7Y4/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Maus",
                "https://i.ytimg.com/vi/sArlNEyZuIA/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "E 100",
                "https://i.ytimg.com/vi/rI3kr5e5nMM/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Pz.Kpfw. VII",
                "https://i.ytimg.com/vi/qy3X1_g2jLM/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "VK 72.01 (K) ",
                "https://i.ytimg.com/vi/GZS3z-BJ694/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Jagdpanzer E 100",
                " https://i.ytimg.com/vi/VyK1EEzCxUY/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Grille 15",
                "https://i.ytimg.com/vi/LOa382KAwFE/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "G.W. E 100",
                "https://i.ytimg.com/vi/Sd7ZYJb51Vg/maxresdefault.jpg"
            )
        )


        GermanyList.layoutManager = LinearLayoutManager(context)
        GermanyList.adapter = AdapterRecycler(context, ListNames1)
    }

}

