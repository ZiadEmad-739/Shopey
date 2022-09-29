package com.ziad_emad_739.shopey.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ziad_emad_739.shopey.databinding.LogInBinding

class LogIn : AppCompatActivity() {
    private lateinit var binding: LogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        logIn()
        signUp()

    }

    private fun logIn(){
        binding.signIn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun signUp(){
        binding.signUp.setOnClickListener {
            val intent = Intent(this,CreateAccount::class.java)
            startActivity(intent)
            finish()
        }
    }

}