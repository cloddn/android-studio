package com.example.FragmentActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding=ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}