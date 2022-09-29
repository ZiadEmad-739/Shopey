package com.ziad_emad_739.shopey.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ziad_emad_739.shopey.databinding.FirstBinding

class First : AppCompatActivity() {
    private lateinit var binding: FirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        signIn()
        signUp()

    }

    private fun signIn(){
        binding.signIn.setOnClickListener {
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
        }
    }

    private fun signUp(){
        binding.signUp.setOnClickListener {
            val intent = Intent(this,CreateAccount::class.java)
            startActivity(intent)
        }
    }

}