package com.example.demoapp.ViewHolders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_main_menu.view.*

class MainMenuViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    val titleTextView: TextView = itemView.tv_row_menu_title
    val imageView: ImageView = itemView.iv_row_menu_image
}