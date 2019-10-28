package com.example.games.Adapters

import android.app.SearchManager
import android.content.Context
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat.getSystemService
import androidx.recyclerview.widget.RecyclerView
import com.example.games.R
import com.example.games.Model.Tanks
import com.squareup.picasso.Picasso

class AdapterRecycler(val context: Context? , private val TanksList : ArrayList<Tanks>) : RecyclerView.Adapter<AdapterRecycler.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.items,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listName = TanksList[position]
        val imageUrl = TanksList[position]
        holder.updateWithUrl(imageUrl.img)
       holder.textNameTanks.text = listName.name

    }

    override fun getItemCount(): Int = TanksList.size

    class ViewHolder ( val view : View): RecyclerView.ViewHolder(view){
        val  textNameTanks = itemView.findViewById<TextView>(R.id.textNameTanks)
        private val myImageView: ImageView = itemView.findViewById(R.id.imageTanks)

        fun updateWithUrl(url: String) {
            Picasso
                .with(itemView.context)
                .load(url)
                .into(myImageView)

    }



}}

// val inflater = menuInflater
//            inflater.inflate(R.menu.searchable, menu)
//            val manager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
//
//            val searchItem = menu?.findItem(R.id.search)
//            val searchView = searchItem?.actionView as SearchView
//
//            searchView.setSearchableInfo(manager.getSearchableInfo(componentName))
//
//            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//                searchView!!.setOnQueryTextListener(this)
//
//                list!!.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//                    Toast.makeText(
//                        this@MainActivity,
//                        TanksList[position].getAnimalName(),
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//
//                override fun onQueryTextSubmit (query: String?): Boolean {
//
//                    return false
//                }
//
//
//                override fun onQueryTextChange(newText: String?): Boolean {
//                    return false
//                }
//            })
//
//            return true
//
//        }