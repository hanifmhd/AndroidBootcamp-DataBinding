package com.research.hardbobby.databinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.research.hardbobby.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
        binding.button.setOnClickListener {
            binding.textView.text = "Welcome to the Jungle! \uD83D\uDD25\uD83D\uDD25\uD83D\uDD25"
        }
        binding.buttonNext.setOnClickListener {
            startActivity(
                Intent(this, SecondActivity::class.java)
            )
        }
    }
}
