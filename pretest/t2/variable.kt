val PI = 3.14
var x = 0

fun incrementX() { 
    x += 1 
}

fun main() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    println("a = $a, b = $b, c = $c")

    var x = 5 // `Int` type is inferred
    x += 1
    println("x = $x")


    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")

}