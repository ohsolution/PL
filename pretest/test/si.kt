/*
    THIS IS TEST KT FILE
    GOOD LUCK OHSOLUTION!
*/

package my.demo.ftp

var str = "llo world!";
val x = 1;
val a: Int = 1.31
var x_89: Int = -5;
var zop = 173;
var str = "hello world!";


fun sum(a: Int, b: Int): Int{
    var x = 5 // `Int` type is inferred
    x += 1
    return a + b
}

fun sum(a: Int, b: Int) = a+b

// This is an end-of-line comment

/* This is a block comment
   on multiple lines. */

fun printSum(a: Int, b: Int): Unit {
    val PI = 3.14
    var x = 0

    fun incrementX() { 
    x += 1 
    }
    println("sum of $a and $b is ")
}


fun main() {
    var a = 1
    // simple name in template:
    val s1 = "a is $a" 

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    printSum(-1, 8)
    println(x * y)
}

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

//fun main()