package com.example.intent_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_activity.databinding.ActivityLibraryBinding



class Library : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        val binding = ActivityLibraryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*Glid.with(this@Library)
            .load("https://cafeptthumb-phinf.pstatic.net/20131231_186/treeholder_1388480033486T296Q_PNG/1795705547.png?type=w740")
            .into(binding.glide)

    */
    }
}