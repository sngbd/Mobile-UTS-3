package com.example.mobileuts3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobileuts3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView.layoutManager = layoutManager

        setListData()
    }

    private fun setListData() {
        val dataList: ArrayList<Category> = ArrayList()
        dataList.add(Category(R.drawable.cat_1,"Yoga"))
        dataList.add(Category(R.drawable.cat_2,"Gym"))
        dataList.add(Category(R.drawable.cat_3,"Cardio"))
        dataList.add(Category(R.drawable.cat_4,"Stretch"))
        dataList.add(Category(R.drawable.cat_5,"Full Body"))

        val adapter = CategoryAdapter(dataList)
        binding.recyclerView.adapter = adapter
    }
}