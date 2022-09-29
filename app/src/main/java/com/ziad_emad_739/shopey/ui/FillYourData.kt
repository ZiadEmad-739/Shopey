package com.ziad_emad_739.shopey.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ziad_emad_739.shopey.R
import com.ziad_emad_739.shopey.databinding.ActivityFillYourDataBinding

class FillYourData : AppCompatActivity() {
    private lateinit var binding: ActivityFillYourDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFillYourDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myToolbar.titleToolbar.text = resources.getString(R.string.fill_your_profile)

        continue1()

    }

    private fun continue1(){
        binding.Continue1.setOnClickListener {
            val intent = Intent(this,CreateNewPin::class.java)
            startActivity(intent)
        }
    }
}