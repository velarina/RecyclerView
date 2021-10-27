package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loudhouselist = listOf<loudhouse>(
            loudhouse(
                R.drawable.The_Loud_House_Lori_Nickelodeon,
                "Lori Loud",
                "Frist child of the loud family"
            ),
            loudhouse(
                R.drawable.The_Loud_House_Leni_Nickelodeon,
                "Leni Loud",
                "Second child of the loud family"
            ),
            loudhouse(
                R.drawable.The_Loud_House_Luna_Nickelodeon,
                "Luna Loud",
                "Third child of the loud family"
            ),
            loudhouse(
                R.drawable.The_Loud_House_Luan_Nickelodeon,
                "Luan loud",
                "Fourth child of the loud family"
            ),
            loudhouse(
                R.drawable.The_Loud_House_Lynn_Nickelodeon,
                "Lynn Loud jr.",
                "Fifth child of the loud family"
            ),
            loudhouse(
                R.drawable.The_Loud_House_Lincoln_Nickelodeon,
                "Lincoln Loud",
                "sixth child of the loud family"
            ),
            loudhouse(
                R.drawable.The_Loud_House_Lucy_Nickelodeon,
                "Lucy Loud",
                "seventh child of the loud family"
            ),
            loudhouse(
                R.drawable.The_Loud_House_Lana_Nickelodeon,
                "Lana Loud",
                "eight child of the loud family"
            ),
            loudhouse(
                R.drawable.The_Loud_House_Lola_2,
                "Lola loud",
                "ninth child of the loud family"
            ),
            loudhouse(
                R.drawable.The_Loud_House_Lisa_Nickelodeon,
                "Lisa Loud",
                "tenth child of the loud house family"
            ),
            loudhouse(
                R.drawable.Lily,
                "Lily Loud",
                "eleventh child of the loud house family"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_loudhouse)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = LoudAdapter(this,loudhouselist){

        }
    }
}