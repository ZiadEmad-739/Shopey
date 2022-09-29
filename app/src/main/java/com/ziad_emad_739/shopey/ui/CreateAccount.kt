package com.ziad_emad_739.shopey.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ziad_emad_739.shopey.databinding.CreateAccountBinding

class CreateAccount : AppCompatActivity() {
    private lateinit var binding: CreateAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        signUp()
        signIn()
    }

    private fun signUp(){
        binding.signUp.setOnClickListener {
            val intent = Intent(this,FillYourData::class.java)
            startActivity(intent)
        }
    }

    private fun signIn(){
        binding.signIn.setOnClickListener {
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
            finish()
        }
    }

}