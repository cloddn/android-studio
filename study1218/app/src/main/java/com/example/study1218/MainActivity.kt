package com.example.study1218

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.annotation.MainThread


class MainActivity : AppCompatActivity() {

 //main(String[] arg[])
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button =findViewById(R.id.btn1)

         btn1.setOnClickListener (new View.OnsetOnClickListener){
            public void OnClick(View v)
            {
                 Intent intent = new Intent(MainActivity.this, SubActivity.class)
                         startActivity(intent)
             }


     }


    }


}