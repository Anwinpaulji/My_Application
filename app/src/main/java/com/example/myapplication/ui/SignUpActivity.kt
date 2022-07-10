package com.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity()
{
    lateinit var binding:ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitBT.setOnClickListener() {
            intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
        }
    }

}