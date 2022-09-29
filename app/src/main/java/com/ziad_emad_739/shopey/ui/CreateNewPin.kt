package com.ziad_emad_739.shopey.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ziad_emad_739.shopey.R
import com.ziad_emad_739.shopey.databinding.ActivityCreateNewPinBinding

class CreateNewPin : AppCompatActivity() {
    private lateinit var binding: ActivityCreateNewPinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateNewPinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.MyToolbar.titleToolbar.text = resources.getString(R.string.create_new_pin)

        continue1()

    }

    private fun continue1(){
        binding.Continue1.setOnClickListener {
            val intent = Intent(this,FingerPrint::class.java)
            startActivity(intent)
            finish()
        }
    }
}