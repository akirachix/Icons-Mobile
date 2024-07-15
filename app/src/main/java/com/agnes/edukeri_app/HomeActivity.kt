package com.agnes.edukeri_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.agnes.edukeri_app.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView4.setOnClickListener {
            startActivity(Intent(this, CoursesActivity::class.java))
        }
        binding.ivBack2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.ivHome3.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        binding.ivCourses3.setOnClickListener {
            startActivity(Intent(this,  CoursesActivity::class.java))
        }
    }
}
