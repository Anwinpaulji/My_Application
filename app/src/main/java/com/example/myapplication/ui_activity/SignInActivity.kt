package com.example.myapplication.ui_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    lateinit var binding:ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitBT.setOnClickListener(){
            intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        val state = resources.getStringArray(R.array.statelist)
        val arrayAdapter = ArrayAdapter(applicationContext,R.layout.state_selection_dropdown_item,state)
        binding.stateListSP.setAdapter(arrayAdapter)
    }
}