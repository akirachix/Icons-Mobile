package com.agnes.edukeri_app

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.agnes.edukeri_app.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            validateAndProceed()
        }
        binding.tvLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun validateAndProceed() {
        val fullName = binding.editTextFullName.text.toString().trim()
        val emailAddress = binding.editTextEmailAddress.text.toString().trim()
        val school = binding.editTextSchool.text.toString().trim()
        val yearsExperience = binding.editTextYearsExperience.text.toString().trim()
        val password = binding.editTextPassword.text.toString().trim()
        val confirmPassword = binding.editTextConfirmPassword.text.toString().trim()

        if (isEditTextEmpty(binding.editTextFullName)) {
            binding.editTextFullName.error = "Full name is required"
        }
        if (isEditTextEmpty(binding.editTextEmailAddress)) {
            binding.editTextEmailAddress.error = "Email address is required"
        }
        if (isEditTextEmpty(binding.editTextSchool)) {
            binding.editTextSchool.error = "School is required"
        }
        if (isEditTextEmpty(binding.editTextYearsExperience)) {
            binding.editTextYearsExperience.error = "Years of experience is required"
        }
        if (isEditTextEmpty(binding.editTextPassword)) {
            binding.editTextPassword.error = "Password is required"
        }
        if (isEditTextEmpty(binding.editTextConfirmPassword)) {
            binding.editTextConfirmPassword.error = "Confirm password is required"
        }

        if (!isEditTextEmpty(binding.editTextFullName) && !isEditTextEmpty(binding.editTextEmailAddress) && !isEditTextEmpty(binding.editTextSchool) && !isEditTextEmpty(binding.editTextYearsExperience) && !isEditTextEmpty(binding.editTextPassword) && !isEditTextEmpty(binding.editTextConfirmPassword)) {
            // Proceed with registration or login logic
            if (binding.btnRegister.isPressed) {
                startActivity(Intent(this, HomeActivity::class.java))
            } else if (binding.tvLogin.isPressed) {
                startActivity(Intent(this, LoginActivity::class.java))
            }
        }
    }

    private fun isEditTextEmpty(editText: EditText): Boolean {
        return editText.text.toString().trim().isEmpty()
    }
}