package com.example.winnie.kotlindemo.kotlin

import android.util.Log

/**
 * Created by winnie on 2018/5/3.
 */
open class Person(name: String = "Default", age: Int = 0) : Any() {
    open var age = age
    open val name = name.toUpperCase()


    init {
        Log.i("tag", "Customer initialized with value ${name}")
        for (i in 1..10) {

        }
    }

    open fun doTest() {}

    open fun v() {}

    fun nv() {}
}

class Man : Person {

    constructor(name: String, age: Int) : super(name, age)


    constructor(name: String) : super(name, 0) {}

    constructor(age: Int) : this("", age)

    override fun doTest() {
        super.doTest()
    }

    override fun v() {
        super.v()
    }
}

class WoMan(name: String, age: Int) : Person(name, age) {
    constructor(name: String) : this(name, 0) {}

    constructor(age: Int) : this("", age)

    override var age: Int
        get() = super.age
        set(value) {}

    override val name: String
        get() = super.name
}

