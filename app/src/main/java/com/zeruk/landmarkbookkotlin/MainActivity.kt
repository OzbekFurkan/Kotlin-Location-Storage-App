package com.zeruk.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zeruk.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landmarkList = ArrayList<Landmark>()
        val pisa = Landmark("Pisa Tower", "Italy", R.drawable.pisa)
        val eifel = Landmark("Eifel Tower", "France", R.drawable.eiffeltower)
        val galata = Landmark("Galata Tower", "Turkey", R.drawable.galata)
        landmarkList.add(pisa)
        landmarkList.add(eifel)
        landmarkList.add(galata)

        binding.RecyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.RecyclerView.adapter = landmarkAdapter


    }
}