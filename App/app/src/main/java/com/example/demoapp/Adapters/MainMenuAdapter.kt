package com.example.demoapp.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.Activities.LottieActivity
import com.example.demoapp.Models.MainMenuModel
import com.example.demoapp.R
import com.example.demoapp.ViewHolders.MainMenuViewHolder

class MainMenuAdapter(private val mainMenuList: List<MainMenuModel>, val context : Context) : RecyclerView.Adapter<MainMenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainMenuViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_main_menu, parent, false)
        return MainMenuViewHolder(itemView)
    }

    override fun getItemCount() = mainMenuList.size

    override fun onBindViewHolder(holder: MainMenuViewHolder, position: Int) {
        val currentItem = mainMenuList[position]
        holder.titleTextView.text = currentItem.title
        holder.imageView.setImageResource(currentItem.imageResource)

        holder.itemView.setOnClickListener(){
            val intent = Intent(context ,LottieActivity::class.java)
            context.startActivity(intent)
        }
    }
}