package com.ali_sajjadi.tamrin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ali_sajjadi.tamrin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val test = Test.instance

    }

}