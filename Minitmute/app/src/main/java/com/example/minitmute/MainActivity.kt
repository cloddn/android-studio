package com.example.minitmute

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.minitmute.databinding.ActivityMainBinding
import com.example.minitmute.databinding.ActivityTotebagBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.totebagbtn.setOnClickListener {
            val intent = Intent(this@MainActivity, Totebag::class.java)
            startActivity(intent);
        }

        binding.aribagbtn.setOnClickListener {
            val intent = Intent(this@MainActivity, Aribag::class.java)
            startActivity(intent);
        }

        binding.remoodbagbtn.setOnClickListener {
            val intent = Intent(this@MainActivity, Remoodbag::class.java)
            startActivity(intent);
        }
        binding.brettbagbtn.setOnClickListener {
            val intent = Intent(this@MainActivity, Brettbag::class.java)
            startActivity(intent);
        }

    }
}