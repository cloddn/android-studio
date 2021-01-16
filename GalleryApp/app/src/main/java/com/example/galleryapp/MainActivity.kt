package com.example.galleryapp

import android.R
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.galleryapp.databinding.ActivityMainBinding
import java.lang.Exception


class MainActivity : AppCompatActivity() {
    val Gallery=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loadImageButton.setOnClickListener {
            loadImage()
        }

    }

    private fun loadImage()
    {
        val intent= Intent()
        intent.type="image/*"
        intent.action=Intent.ACTION_GET_CONTENT

        startActivityForResult(Intent.createChooser(intent,"Load Picture"),Gallery)
    }


    @Override
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        if(requestCode==Gallery){
            if (resultCode== Activity.RESULT_OK) {
                var dataUri=data?.data
                try{
                    var bitmap: Bitmap =MediaStore.Images.Media.getBitmap(this.contentResolver,dataUri)
                    binding.imageView.setImageBitmap(bitmap)
                }catch (e:Exception)
                {
                    Toast.makeText(this,"$e",Toast.LENGTH_SHORT).show()
                }
            }
            else {
                //something wrong
            }
        }
    }
}

