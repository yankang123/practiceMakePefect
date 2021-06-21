package com.example.finishallbyme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finishallbyme.finishall.FinishAllAdapter
import com.example.finishallbyme.finishall.finishData
import com.example.practicekotlin.R

class MainActivity : AppCompatActivity() {
    var list = ArrayList<finishData>()
    //aaa
    //1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initList()
        val recyclerView =findViewById<RecyclerView>(R.id.recycler_finish)
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        val myAdapter = FinishAllAdapter(list)
        recyclerView.adapter=myAdapter
    }

   fun  initList(){
        for(i in 1..15){
           list.add(finishData(true,"hahahh"))
       }
    }
}