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
import kotlinx.android.synthetic.main.fragment_fragment_u.*


class US : Fragment() {
  //  val ListNames1 = listOf("d Panzerwagen","E d Ausf. M","d 1","d","E 100","f.Kpfw. f","f E 100","f 15","G.W. E 100")
  val ListNames1= ArrayList<Tanks>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_u, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        ListNames1.add(
            Tanks(
                "XM551 Sheridan",
                "https://i.ytimg.com/vi/scJ8LxtfsdI/maxresdefault.jpg "
            )
        )
        ListNames1.add(
            Tanks(
                "M48A5 Patton",
                "https://i.ytimg.com/vi/RJSg4yXaVQg/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "M60",
                "https://i.ytimg.com/vi/l2kPXQdTaZE/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "T95E6",
                "https://i.ytimg.com/vi/2Mw32NhUT5k/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "T110E5",
                "https://i.ytimg.com/vi/nhMH5_4zNdc/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "T57 Heavy Tank",
                "https://i.ytimg.com/vi/hLqfwVyvCeM/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "T110E4",
                "https://i.ytimg.com/vi/wA8RoJodt30/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "T110E3",
                "https://i.ytimg.com/vi/2Z0A3kf16AA/maxresdefault.jpg"
            )
        )
        ListNames1.add(
            Tanks(
                "T92 HMC",
                "https://i.ytimg.com/vi/y1V6d1M8e-Q/maxresdefault.jpg"
            )
        )



        USList.layoutManager = LinearLayoutManager(context)
        USList.adapter = AdapterRecycler(context, ListNames1)
    }

}
