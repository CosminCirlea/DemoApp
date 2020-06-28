package com.example.demoapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoapp.Adapters.MainMenuAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeViews()
        setRecyclerView()
    }

    fun setRecyclerView() {
        rv_main_page.adapter = MainMenuAdapter(MockerHelper.MockMainMenu(), this)
        rv_main_page.layoutManager = LinearLayoutManager(this)
    }

    fun textLenght(input : TextView) : Int {
        return  input.text.length
    }

    fun initializeViews() {
    }
}