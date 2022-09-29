package com.ziad_emad_739.shopey.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ziad_emad_739.shopey.databinding.SplashyScreenBinding

class SplashyScreen : AppCompatActivity() {
    private lateinit var binding: SplashyScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashyScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        doSplashScreen()

    }

    private fun doSplashScreen(){
        Handler().postDelayed({
            val intent = Intent(this,First::class.java)
            startActivity(intent)
            finish()
        },3000)
    }

}