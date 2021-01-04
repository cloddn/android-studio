package com.example.classactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val tv = TV(listOf<String>("K", "M", "S"))
        tv.switch()
        Log.d("TV", "" + tv.onOroff) //TV를 켜겠다.
        tv.channelUp()
        tv.channelUp()
        tv.channelUp()
        tv.channelUp()
        Log.d("TV", "" + tv.checkCurrentChannel())
        tv.channelDown()
        tv.channelDown()
        tv.channelDown()
        tv.channelDown()
        Log.d("TV", "" + tv.checkCurrentChannel())

    }

}


class TV(val channels: List<String>) {
    var onOroff: Boolean = false //True : On False : Off
    var currentChannelNumber = 0
        set(value) {
            //이 함수는 S채널 다음에 K채널로 오게하는 중요한 함수. field를 사용한다는 점 확인할 것.
            field = value
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }
        get(){
            println("TV호출되었습니다.")
            return field
        }

    fun switch() {
        onOroff = !onOroff
    }

    fun channelUp() {
        channels.forEachIndexed { index, value ->
            if (currentChannelNumber == index) {
                currentChannelNumber += 1
                return
            }
        }
    }

    fun channelDown() {
        channels.forEachIndexed { index, value ->
            if (currentChannelNumber == index) {
                currentChannelNumber -= 1
                return
            }
        }
    }

    fun checkCurrentChannel(): String {
        return channels[currentChannelNumber]
    }
}