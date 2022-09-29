package com.ziad_emad_739.shopey.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ziad_emad_739.shopey.R
import com.ziad_emad_739.shopey.databinding.ActivityMainBinding
import com.ziad_emad_739.shopey.ui.mainFragments.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val home = Home()
    private val cart = Cart()
    private val orders = Orders()
    private val wallet = Wallet()
    private val profile = Profile()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        doBottomNavigationView()

    }

    private fun doBottomNavigationView(){
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {
                    replaceFragment(home)
                    true
                }
                R.id.cart -> {
                    replaceFragment(cart)
                    true
                }
                R.id.orders -> {
                    replaceFragment(orders)
                    true
                }
                R.id.wallet -> {
                    replaceFragment(wallet)
                    true
                }
                R.id.profile ->{
                    replaceFragment(profile)
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment : Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView,fragment)
        transaction.commit()
    }

}