package com.agnes.edukeri_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.agnes.edukeri_app.databinding.ActivityFoundationBinding

class FoundationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFoundationBinding
    private lateinit var levelAdapter: LevelAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoundationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val level1 = LevelItem("", "Introduction to Computer Basics", "")
        val level2 = LevelItem("", "Intermediate Computer Skills", "")
        val level3 = LevelItem("", "Advanced Computer Skills", "")
        val level4 = LevelItem("", "Introduction Computer Skills", "")
        val level5 = LevelItem("", "Intermediate Computer Skills", "")
        val level6 = LevelItem("", "Advanced Computer Skills", "")
        val level7 = LevelItem("", "Introduction Computer Skills", "")
        val level8 = LevelItem("", "Intermediate Computer Skills", "")
        val level9 = LevelItem("", "Advanced Computer Skills", "")
        val level10 = LevelItem("", "Introduction Computer Skills", "")
        val level11 = LevelItem("", "Intermediate Computer Skills", "")
        val level12= LevelItem("", "Advanced Computer Skills", "")
        val level13 = LevelItem("", "Introduction Computer Skills", "")
        val level14 = LevelItem("", "Intermediate Computer Skills", "")
        val level15 = LevelItem("", "Advanced Computer Skills", "")
        val level16= LevelItem("", "Introduction Computer Skills", "")
        val level17 = LevelItem("", "Intermediate Computer Skills", "")
        val level18 = LevelItem("", "Advanced Computer Skills", "")

        val levelList = listOf(level1, level2, level3, level4, level5,level6, level7, level8,level9,level10,level11,level12,level13,level14,level14,level15,level16,level17,level18)
        levelAdapter = LevelAdapter(levelList)
        binding.rvLevels.layoutManager = LinearLayoutManager(this)
        binding.rvLevels.adapter = levelAdapter
    }
}