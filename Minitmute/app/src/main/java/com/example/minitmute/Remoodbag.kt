package com.example.minitmute

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.minitmute.databinding.ActivityBrettbagBinding
import com.example.minitmute.databinding.ActivityRemoodbagBinding

class Remoodbag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding= ActivityRemoodbagBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.infoText.setOnClickListener {
            val intent = Intent(this@Remoodbag, MainActivity::class.java)
            startActivity(intent);
        }

        binding.remoodhome.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://minitmute.com/product/detail.html?product_no=238&cate_no=43&display_group=1"))
            startActivity(intent)
        }
    }
}