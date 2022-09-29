package com.ziad_emad_739.shopey.ui.mainFragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ziad_emad_739.shopey.R
import com.ziad_emad_739.shopey.databinding.FragmentProfileBinding
import com.ziad_emad_739.shopey.ui.FillYourData

class Profile : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        doToolBar()
        doEditProfile()

        return binding.root
    }

    private fun doToolBar() {
        binding.myToolbar.titleToolbar.setText(R.string.profile)
        binding.myToolbar.iconToolbar2.setImageResource(R.drawable.menu)
    }

    private fun doEditProfile() {
        binding.EditProfile.setOnClickListener {
            val intent = Intent(activity,FillYourData::class.java)
            startActivity(intent)
        }
    }

}