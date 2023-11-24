package com.example.sustainablesteps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sustainablesteps.databinding.ActivityOtpVerificationBinding
import com.example.sustainablesteps.databinding.ActivitySignupBinding

class SignUpPage : AppCompatActivity() {

    private val binding: ActivitySignupBinding by lazy {
        ActivitySignupBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.otpProceed.setOnClickListener{
            val intent = Intent(this, OTPVerificationActivity::class.java)
            startActivity(intent)
        }

        binding.alreadyhaveanacc.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}