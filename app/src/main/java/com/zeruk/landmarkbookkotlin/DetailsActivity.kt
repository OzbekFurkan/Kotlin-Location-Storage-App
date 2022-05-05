package com.zeruk.landmarkbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeruk.landmarkbookkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = getIntent()
        //val landmark = intent.getSerializableExtra("MyData") as Landmark

        val selectedLandmark = MySingleton.selectedLandmark

        selectedLandmark.let {
            binding.imageView.setImageResource(it!!._image)
            binding.landmarkCountry.text = it.country
            binding.landmarkName.text = it.name
        }


    }
}