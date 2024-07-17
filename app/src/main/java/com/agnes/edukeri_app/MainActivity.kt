package com.agnes.edukeri_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.agnes.edukeri_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvAdvancedLevels.layoutManager = LinearLayoutManager(this)

        displayItems()

        }


    fun displayItems(){

        val level1= Advancedlevel(R.drawable.img_1, "Advanced", R.drawable.circle)
        val level2= Advancedlevel(R.drawable.img, "Advanced", R.drawable.circle)
        val level3 = Advancedlevel(R.drawable.img_2, "Advanced", R.drawable.circle)

        val advancedList = listOf(level1, level2, level3)
        val advancedAdapter = AdvancedAdapter(advancedList)
        binding.rvAdvancedLevels.adapter = advancedAdapter
    }}
