package com.agnes.edukeri_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.agnes.edukeri_app.databinding.ActivityCoursesBinding


class CoursesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCoursesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoursesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            startActivity(Intent(this, FoundationActivity::class.java))
        }
    }
}
