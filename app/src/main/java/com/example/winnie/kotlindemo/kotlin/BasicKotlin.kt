package com.example.winnie.kotlindemo.kotlin

/**
 * Created by winnie on 2018/5/3.
 */
import java.io.File

var a = 12
var b: Int = 13

//将表达式作为函数体、返回值类型⾃动推断的函数
fun sum(a: Int, b: Int) = a + b

//定义函数
fun sub(a: Int, b: Int): Int {
    return a + b
}

//使用函数返回无意义的值
fun sum1(a: Int, b: Int): Unit {
    val num1: Int = b //立即赋值
    var num2 = a //自动推断出是Int类型
    var num3: Int //如果没有初始化值，类型不能省略
    num3 = sum(num1, num2)
    println("test a sum b = " + num3)
}

//使用函数返回无意义的值，Unit可以省略
fun sum2(a: Int, b: Int) {
    println("test a sum b")
}

//使用类型检测及自动类型转换
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length;
    } else {
        return null;
    }
}

fun sum(a: Int, b: Int?): Int {

    var num1 = a
    var num2: Int
    if (b == null) {
        num2 = 0
    } else {
        num2 = b
    }

    return num1 + num2
}

fun <T> getString(obj: Any, vararg s: T): String? {

    if (obj is String) {
        return obj
    }
    return null
}

fun getListItem() {
    var items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a String"
            else -> "UnKnown"
        }

fun range() {
    var x = 10
    var y = 9

    if (x in 1..y + 1) {
        println("fits in range")
    } else {
        println("not fits in range")
    }

    var items = listOf("apple", "banana", "kiwi")
    if (-1 !in 0..items.size) {
        println("-1 is out of range")
    }

    if (items.size !in items.indices) {
        println("list size is out of valid list range too")
    }
}

fun rangeIn() {
    for (x in 1 until 10) {
        //不包含10
    }

    for (x in 1..10) {
        //默认是step 1
    }

    for (x in 1..10 step 4) {
        println(x)
    }
}

fun filter() {
    var items = listOf("apple", "banana1", "kiwi", "Banana", "Kwi")
    items.filter { !it.startsWith("a") }
            .sortedBy { it }
            .map { it.toLowerCase() }
            .forEach { println(it) }
}

fun isNull() {
    var files = File("Test").listFiles()
    println(files?.size ?: "empty")
}

fun testEqual() {
    val a: Int = 10000
    print(a === a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    //同一性
    print(boxedA === anotherBoxedA) // ！！！输出“false”！！！
    //相等性
    print(boxedA == anotherBoxedA) // 输出“true”

    var b: Long = a.toLong();
    var c: Int = b.toInt();
}

class Turtle {
    fun perDown() {

    }

    fun perUp() {

    }

    fun turn(degree: Double) {

    }

    fun forword(pix: Double) {

    }

    fun objectTest() {
        var turtle = Turtle()
        with(turtle) {
            perDown()
            for (i in 1..4) {
                forword(100.0)
                turn(90.0)
            }
            perUp()
        }
    }

    var asc = Array(5, { i ->
        (i * i).toString()
    })

    var text = """
        hello im
        just test
        hahha
        """.trimMargin()


    //高阶函数和拉姆达表达式
    fun testLambda(testBody: () -> Int, testBody1: (Int) -> Int, testBody2: (Int, Int) -> Int, testBody3: (Int, Int) -> Int): Int {
        try {
            return testBody() + testBody1(1) + testBody2(1, 2)
        } catch (e: Exception) {
            return 0
        } finally {

        }
    }

    fun callLamda() {
        testLambda({
            ->
            2
        }, {
            it * 2
        }, { i1: Int, i2: Int ->
            i1 + i2
        }, { i1, i2 ->
            i1 + i2
        }
        )

        var string: List<String> = listOf("hello", "jhdhsj")
        string.filter {
            var tag = it.length > 0
            tag
        }.sortedBy {
            it.toUpperCase()
        }
    }
}