package com.example.slove_it

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnBordingItemAdapter(private val onbordingItem:List<OnbordingItem>):RecyclerView.Adapter<OnBordingItemAdapter.OnbordingItemViewHolder>(){




    inner class OnbordingItemViewHolder(view:View):RecyclerView.ViewHolder(view){

        private  val imageOnbording=view.findViewById<ImageView>(R.id.imgOnBording)
        private val textTitle=view.findViewById<TextView>(R.id.textTitle)
        private val textDesc=view.findViewById<TextView>(R.id.textDesc)

        fun  bind(onbordingItem: OnbordingItem){
            imageOnbording.setImageResource(onbordingItem.onboardingimg)
            textTitle.text=onbordingItem.title
            textDesc.text=onbordingItem.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnbordingItemViewHolder {
        return OnbordingItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.onbording_item,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return onbordingItem.size
    }

    override fun onBindViewHolder(holder: OnbordingItemViewHolder, position: Int) {
       holder.bind(onbordingItem[position])
    }
}