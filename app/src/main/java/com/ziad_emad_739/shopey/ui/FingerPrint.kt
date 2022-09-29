package com.ziad_emad_739.shopey.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ziad_emad_739.shopey.R
import com.ziad_emad_739.shopey.databinding.ActivityFingerPrintBinding

class FingerPrint : AppCompatActivity() {
    private lateinit var binding: ActivityFingerPrintBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFingerPrintBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.MyToolbar.titleToolbar.text = resources.getString(R.string.set_your_fingerprint)

        continue1()

    }

    private fun continue1(){
        binding.Continue1.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}