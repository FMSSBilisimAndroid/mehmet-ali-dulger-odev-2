package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.databinding.ActivityGetStartedBinding

class GetStartedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGetStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_get_started)
        binding.joinNowbutton.setOnClickListener {
            joinNowButton()
        }
    }

    private fun joinNowButton() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

