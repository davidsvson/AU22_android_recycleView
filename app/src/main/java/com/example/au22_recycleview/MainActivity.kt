package com.example.au22_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var persons = mutableListOf<Person>(
                                Person("David",44),
                                Person("Susan", 38),
                                Person("Lois", 9),
                                Person("Laura", 12))



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 1..1000) {
            persons.add(Person("Elisabet", i))
        }

        var recyclerView = findViewById<RecyclerView>(R.id.personRecycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // skapade vi en adapter från vår adapter-klass och skickar med vår lista av personer
        val adapter = PersonRecycleAdapter(this, persons)

        // koppla ihop vår adapter med recyclerviewn
        recyclerView.adapter = adapter



        // 1. skapa adapter
        // 2. koppla data ( persons ) till adapter
        // 3. koppla adapter till recycleview


    }
}