package com.example.winnie.kotlindemo.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.winnie.kotlindemo.R
import kotlinx.android.synthetic.main.activity_kotlin.*
import org.jetbrains.anko.find

class KotlinActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
//        var textView = find<TextView>(R.id.textView)

        //使用anko，可以省略findViewById
        textView.text = getString(R.string.app_name)
        sum1(3,5)
        testEqual()

        var person1: Person = Person("LiuYang1", 19)
        var person2: Person = Person("LiuYang2")
        var person3: Person = Person()
        var man1: Person = Man("LiuYang3", 19)
        var man2: Person = Man(19)
        var man3: Person = Man("LiuYang4")
        var woMan1: Person = WoMan("LiuYang5")
        var woMan2: Person = WoMan("Liuyang6", 19)
        var woMan3: Person = WoMan(19)
    }
}

