package com.example.intent_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NullSafety : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number:Int =10
        val number1:Int?=null

        //number1이 null이 아니라면 number을 더해라 ??
        val number3=number1?.plus(number)


        //둘이 같은 코드
        fun plus(a:Int,b:Int?):Int{
            if(b != null) return a + b
            else return a
        }

        fun plus2(a:Int,b:Int?):Int?
        {
            return b?.plus(a)
        }
    }
}