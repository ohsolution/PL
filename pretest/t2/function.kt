fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun sum(a: Int, b: Int) = a + b

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))
}