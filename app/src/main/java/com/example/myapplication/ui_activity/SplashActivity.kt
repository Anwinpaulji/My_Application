package com.example.myapplication.ui_activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({check()} ,2000)
    }
    fun check()
    {
        if (true)
        {
            intent = Intent(this@SplashActivity,SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}