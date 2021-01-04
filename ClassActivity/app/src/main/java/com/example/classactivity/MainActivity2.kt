package com.example.classactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val account:Account=Account("종만이","1993/12/20",1000)

        Log.d("잔액확인1",""+account.checkBalance())
        Log.d("1000원 저축하기",""+account.save(1000))
        Log.d("2000원 찾기",""+account.withdraw(2000))
        Log.d("잔액확인1-2",""+account.checkBalance())

        val account2:Account2=Account2("종만이","1993/12/20",-1000)
        Log.d("잔액확인2",""+account2.checkBalance())
        Log.d("1000원 저축하기2",""+account2.save(1000))
        Log.d("2000원 찾기2",""+account2.withdraw(1000))
        Log.d("잔액확인2-2",""+account2.checkBalance())
    }

}
//이 계좌 클래스는 마이너스 통장을 지원한다.
//돈이 없는 생활은 괜찮아도 빚있는 생활은 진짜 안되니까.
class Account(var Name: String, var Date: String, var Balance: Int) {

    fun checkBalance(): Int {
        return Balance
    }

    fun withdraw(amount: Int): Boolean {
        if(Balance>=amount){
            Balance -= amount
            return true
        }
        else{
            return false
        }
        //return Balance >= amount
    }

    fun save(amount: Int) {
        Balance += amount
    }
}

class Account2 {

    var name:String
    var date:String
    var balance:Int
    constructor(Name: String, Date: String, Balance: Int){
        this.name=Name
        this.date=Date
        //이 부분을 관리해주어야 한다.
        //생성자를 통해서 관리해줄 수 있다.
        if(Balance>=0){
            this.balance=Balance
        }
        else{
            this.balance=0
        }

    }
    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if(balance>=amount){
            balance -= amount
            return true
        }
        else{
            return false
        }
        //return Balance >= amount
    }

    fun save(amount: Int) {
        balance += amount
    }
}

//생성자에 default값 넣어주기
class Account3(var Name: String, var Date: String, var Balance: Int = 1000) {

    fun checkBalance(): Int {
        return Balance
    }

    fun withdraw(amount: Int): Boolean {
        if(Balance>=amount){
            Balance -= amount
            return true
        }
        else{
            return false
        }
        //return Balance >= amount
    }

    fun save(amount: Int) {
        Balance += amount
    }
}

class Account4(initialBalance:Int){

    val balance :Int = if(initialBalance>=0) initialBalance else 0
    fun checkBalance() :Int{
        //return initialBalance 이건 안된다!! 생성자에 있는 val/var로 안되어있는 변수는 바로 리턴불가
        return balance
    }

}