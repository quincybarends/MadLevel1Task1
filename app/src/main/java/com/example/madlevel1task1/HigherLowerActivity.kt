package com.example.madlevel1task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madlevel1task1.databinding.ActivityHigherLowerBinding
import kotlinx.android.synthetic.main.activity_higher_lower.*

class HigherLowerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHigherLowerBinding
    private var currentThrow: Int = 1
    private var lastThrow: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHigherLowerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun updateUI() {
        binding.tvLastThrow.text = getString(R.string.last_throw, lastThrow)
        when(currentThrow) {
            1 -> imgDice.setImageResource(R.drawable.dice1)
            2 -> imgDice.setImageResource(R.drawable.dice2)
            3 -> imgDice.setImageResource(R.drawable.dice3)
            4 -> imgDice.setImageResource(R.drawable.dice4)
            5 -> imgDice.setImageResource(R.drawable.dice5)
            else -> {
                imgDice.setImageResource(R.drawable.dice6)
            }
        }
    }

    private fun initViews() {
        updateUI()
    }
}