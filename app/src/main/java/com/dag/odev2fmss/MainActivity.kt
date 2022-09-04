package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            createAccountTextButton.setOnClickListener {
                openSingUpActivity()
            }
            loginButton.setOnClickListener {
                loginButton()
            }
            loginGreyEllipseImageButton.setOnClickListener {
                openGetStartedActivity()
            }
        }
    }

    private fun openSingUpActivity() {
        intent = Intent(this, SingUpActivity::class.java)
        startActivity(intent)
    }

    private fun loginButton() {
        val loginUsername = binding.usernameEditText.text
        val loginPassword = binding.passwordEditText.text
        if (loginUsername.isNullOrEmpty()) {
            binding.usernameTextInputLayout.error = "Username is not empty"
        } else if (loginPassword.isNullOrEmpty()) {
            binding.passwordTextInputLayout.error = "Password is not empty"
        } else {
            Toast.makeText(this, "Giriş Yapıldı", Toast.LENGTH_SHORT).show()
        }
    }

    private fun openGetStartedActivity() {
        val intent = Intent(this, GetStartedActivity::class.java)
        startActivity(intent)
    }
}