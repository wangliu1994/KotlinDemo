package com.example.winnie.kotlindemo.kotlin

/**
 * Created by winnie on 2018/5/3.
 */
open class BaseObject {

    open fun f() {
        print("BaseObject")
    }
}

interface BaseInterface {

    fun f() {
        print("BaseInterface")
    }

    fun f1()

    fun f2() {

    }
}

abstract class BaseAbsObj {
    abstract fun fe()
}

class Test : BaseObject(), BaseInterface {
    override fun f1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun f() {
        super<BaseObject>.f()
        super<BaseInterface>.f()
    }
}

class Test1 : BaseInterface, BaseAbsObj() {
    override fun f1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    var size = 0;

    val isEmpty: Boolean
        get() = this.size == 0


    var stringRepresentation: String = ""
        get() = this.toString()
        private set(value) {
            field = value;
        }
}