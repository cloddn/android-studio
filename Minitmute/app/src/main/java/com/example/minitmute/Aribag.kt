package com.example.minitmute

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.minitmute.databinding.ActivityAribagBinding
import com.example.minitmute.databinding.ActivityBrettbagBinding

class Aribag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding= ActivityAribagBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.infoText.setOnClickListener {
            val intent = Intent(this@Aribag, MainActivity::class.java)
            startActivity(intent);
        }

        binding.arihome.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://minitmute.com/product/detail.html?product_no=532&cate_no=43&display_group=1"))
            startActivity(intent);
        }

    }
}