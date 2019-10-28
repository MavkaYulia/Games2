package com.example.games.Fragments

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.games.Adapters.AdapterRecycler
import com.example.games.R
import com.example.games.Model.Tanks
import kotlinx.android.synthetic.main.fragment_sssr.*


class SSSR : Fragment() {

    //  val ListNames1 = listOf<Tanks>("об 140","E 50 об. M","кв 1","т 34","E 100","Pz.Kpfw. VII","а E 100","руді 15","G.W. E 100")

    val ListNames1 = ArrayList<Tanks>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sssr, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        ListNames1.add(
            Tanks(
                "Т-100 ЛТ",
                "https://i.ytimg.com/vi/lbLsuhqsXzg/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Т-62А",
                "https://images.wallpaperscraft.ru/image/world_of_tanks_t_62a_pole_105518_1280x720.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 907",
                "https://i.ytimg.com/vi/eyGaCygWlx4/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 140",
                "https://i.ytimg.com/vi/uLU91na0o_E/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 430y",
                "https://i.ytimg.com/vi/uFPaY7iY8Pk/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "К-91",
                "https://img5.goodfon.ru/original/1280x720/8/bf/world-of-tanks-wot-wargaming-k-91.jpg "
            )
        )
        ListNames1.add(
            Tanks(
                "Т-22 ср.",
                "https://mirtankov.su/sites/default/files/images/_k9a_UTUwQI.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "ИС-4",
                "https://www.digiseller.ru/preview/540887/p1_2223284_20f2ff53.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "ИС-7",
                "https://wotpack.ru/wp-content/uploads/2019/02/maxresdefault3.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 705А",
                "https://i.ytimg.com/vi/aUAyRFMeKbI/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 277",
                "https://i.ytimg.com/vi/s4t-iUu2Ux0/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 279 ранний",
                "https://top-wot.ru/images/img/mission23.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 260",
                "https://images.wallpaperscraft.ru/image/world_of_tanks_wargaming_net_obekt_260_tank_102939_1280x720.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 268",
                "https://img4.goodfon.ru/original/1280x720/3/6a/tank-art-world-of-tanks-wot-tank-wotart-anderarts-obekt-268.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 268 Вариант 4",
                "https://i.ytimg.com/vi/TquNimMw73Y/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "Объект 261",
                "https://i.pinimg.com/originals/50/90/60/509060ffaddf51d9ce05b633f89bbb27.jpg"
            )
        )
        SSSRList.layoutManager = LinearLayoutManager(context)
        SSSRList.adapter = AdapterRecycler(context, ListNames1)

    }

  }