package com.example.sharedpreference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sharedpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button13.setOnClickListener {
            val sharedPreference=getSharedPreferences("message", Context.MODE_PRIVATE)
            val editor:SharedPreferences.Editor=sharedPreference.edit()
            editor.putString("hello","안녕하세요")
            editor.putString("goodBye","안녕히계세요")
            editor.apply()
        }
        binding.button12.setOnClickListener {
            val sharedPreference=getSharedPreferences("sp1", MODE_PRIVATE)
            val value1= sharedPreference.getString("hello","Data 없음1")
            val value2= sharedPreference.getString("goodBye","Data 없음2")
            Log.d("key-value","Value:" + value1)
            Log.d("key-value","Value:" + value2)
        }
        binding.button14.setOnClickListener {
            val sharedPreference=getSharedPreferences("sp1", MODE_PRIVATE)
            val editor=sharedPreference.edit()
            editor.remove("hello")
            editor.commit()

        }
        binding.button15.setOnClickListener {
            val sharedPreference=getSharedPreferences("sp1", MODE_PRIVATE)
            val editor=sharedPreference.edit()
            editor.clear()
            editor.commit()
        }
    }
}