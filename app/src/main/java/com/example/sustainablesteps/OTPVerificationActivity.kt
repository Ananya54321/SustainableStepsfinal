package com.example.sustainablesteps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sustainablesteps.databinding.ActivityOtpVerificationBinding

class OTPVerificationActivity : AppCompatActivity() {

    private val binding: ActivityOtpVerificationBinding by lazy {
        ActivityOtpVerificationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.otpverifiedproceed.setOnClickListener{
            val intent = Intent(this, SignInDetails::class.java)
            startActivity(intent)
        }
    }
}