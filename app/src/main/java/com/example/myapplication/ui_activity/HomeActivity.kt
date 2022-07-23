package com.example.myapplication.ui_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityHomeBinding
import com.example.myapplication.ui_fragment.Fragment1
import com.example.myapplication.ui_fragment_adapter.PageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeActivity : AppCompatActivity() {

    lateinit var binding:ActivityHomeBinding
    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager2VP)

        val adapter = PageAdapter(supportFragmentManager,lifecycle)

        binding.viewPager2VP.adapter = adapter

        TabLayoutMediator(tabLayout,viewPager2)
        {
            tab,position -> when(position){
            0 -> { tab.text = "CHAT"}
            1 -> { tab.text = "STATUS"}
            2 -> { tab.text = "CALLS"}
            }
        }.attach()

    }
}