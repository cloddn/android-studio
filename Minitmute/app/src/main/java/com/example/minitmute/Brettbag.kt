package com.example.minitmute

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.minitmute.databinding.ActivityBrettbagBinding

class Brettbag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding=ActivityBrettbagBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.infoText.setOnClickListener {
            val intent = Intent(this@Brettbag, MainActivity::class.java)
            startActivity(intent);
        }

        binding.brethome.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://minitmute.com/product/detail.html?product_no=423&cate_no=43&display_group=1"))
            startActivity(intent);
        }
    }
}