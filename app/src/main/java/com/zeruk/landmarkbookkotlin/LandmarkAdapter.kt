package com.zeruk.landmarkbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zeruk.landmarkbookkotlin.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList:ArrayList<Landmark>): RecyclerView.Adapter<LandmarkAdapter.LandmakHolder>() {

    class LandmakHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmakHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return LandmakHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmakHolder, position: Int) {
        holder.binding.recyclerRowText.text = landmarkList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            //intent.putExtra("MyData", landmarkList.get(position))
            MySingleton.selectedLandmark = landmarkList.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }


}