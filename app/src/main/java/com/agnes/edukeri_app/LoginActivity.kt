package com.agnes.edukeri_app

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.agnes.edukeri_app.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            validateAndProceed()
        }
    }

    private fun validateAndProceed() {
        val emailAddress = binding.editTextEmailAddress.text.toString().trim()
        val password = binding.editTextPassword.text.toString().trim()

        if (isEditTextEmpty(binding.editTextEmailAddress)) {
            binding.editTextEmailAddress.error = "Email address is required"
        }
        if (isEditTextEmpty(binding.editTextPassword)) {
            binding.editTextPassword.error = "Password is required"
        }

        if (!isEditTextEmpty(binding.editTextEmailAddress) && !isEditTextEmpty(binding.editTextPassword)) {
            // Proceed with login logic
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

    private fun isEditTextEmpty(editText: EditText): Boolean {
        return editText.text.toString().trim().isEmpty()
    }
}
