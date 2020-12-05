package my.demo

val a: Int = 1
var b = 2;
var c = 3.14;
var d = true;

fun minus(a:Int,b:Int) = a-b

fun sum(a:Int, b:Int): Int? {
    var p: Double = 4.3
    var q = 2.3
    return a+b
}

fun StringLength(obj:Any): Int?{
    if(obj is String)
        return obj.length
    return null
}

fun main()
{
    println(StringLength("String"))
    println(StringLength(123));
}
