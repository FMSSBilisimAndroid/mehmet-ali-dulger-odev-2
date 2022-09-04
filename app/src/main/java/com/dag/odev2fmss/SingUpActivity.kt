package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.databinding.ActivitySingUpBinding

class SingUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySingUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sing_up)

        binding.apply {
            binding.singUpButton.setOnClickListener {
                openSingUpButton()
            }
            binding.singUpGreyEllipseImageButton.setOnClickListener {
                openMainActivity()
            }
        }
    }

    private fun openSingUpButton() {
        val enterEmail = binding.singUpEmailEditText.text
        val createUsername = binding.singUpCreateUsernameEditText.text
        val createPassword = binding.singUpCreatePasswordEditText.text

        if (enterEmail.isNullOrEmpty()) {
            binding.singUpEmailTextInputLayout.error = "Email cannot be empty!"
        } else if (createUsername.isNullOrEmpty()) {
            binding.singUpCreateUsernameTextInputLayout.error = "Username cannot be empty!"
        } else if (createPassword.isNullOrEmpty()) {
            binding.singUpCreatePasswordTextInputLayout.error = "Password cannot be empty!"
        } else {
            Toast.makeText(this, "Account created", Toast.LENGTH_SHORT).show()
        }
    }

    private fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}