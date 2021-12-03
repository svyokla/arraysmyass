package com.example.arraysmyass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arraysmyass.adapters.CustomAdapter
import com.example.arraysmyass.models.Pictures

class MainActivity : AppCompatActivity() {

    val array = arrayListOf("Meow","Meow","Meow","Meow","Meow","Meow","Meow","Meow")
    val pictures = arrayListOf(
        Pictures( "Lang Wanjis home", R.drawable.gusulang),
        Pictures( "Hobbitshome", R.drawable.hobbit),
        Pictures( "Parfenon", R.drawable.parfenon),
        Pictures( "Chinas monks home", R.drawable.chin))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(pictures)




    }
}