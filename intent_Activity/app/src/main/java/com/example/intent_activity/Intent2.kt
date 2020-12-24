package com.example.intent_activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.intent_activity.databinding.ActivityIntent2Binding


class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //자동으로 완성된 액티비티 intent2의 클래스를 가져온
        val binding=ActivityIntent2Binding.inflate(layoutInflater) //메인 액티비->액티비티 메인 바인딩 ->
        //클래스를 찾아와서 인스턴스에 넣어줌 -> findID 역할??

        //뷰 바인딩과 연결
       setContentView(binding.root)


        binding.result.setOnClickListener {
            val number1=intent.getIntExtra("number1",0)
            val number2=intent.getIntExtra("number2",0)
            Log.d("number",""+number1)
            Log.d("number",""+number2)

            val result=number1+number2
            val resultIntent= Intent()
            resultIntent.putExtra("result",result)
            setResult(Activity.RESULT_OK,resultIntent)
            finish()
        }
    }
}