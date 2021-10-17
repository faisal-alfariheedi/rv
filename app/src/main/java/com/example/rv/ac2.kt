package com.example.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ac2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac2)
        var rv=findViewById<RecyclerView>(R.id.rvm)
        rv.adapter=RVAdapter(person.people,this)
        rv.layoutManager= LinearLayoutManager(this)
    }
}