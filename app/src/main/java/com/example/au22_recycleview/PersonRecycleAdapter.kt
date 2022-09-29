package com.example.au22_recycleview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonRecycleAdapter(val context: Context, val persons: List<Person> ) :
                    RecyclerView.Adapter<PersonRecycleAdapter.ViewHolder>(){

    val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)
        Log.d("!!!Adapter", "oncreateViewholder")

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("!!!Adapter", "onbindviewholder $position")

        // när en list_view ska visas så tar vi rätt person från vår lista
        val person = persons[position]

        // sätt in den personens uppgifter i vår view
        holder.nameTextView.text = person.name
        holder.ageTextView.text = person.age.toString()

    }

    override fun getItemCount(): Int {
        return persons.size
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)   {
        // när en viewholder skapas letar vi reda på två textviews som finns inne i vår itemview
        // (vår itemview är skapad utifrån vår list_item layout)
        var nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        var ageTextView = itemView.findViewById<TextView>(R.id.ageTextView)


    }

}











