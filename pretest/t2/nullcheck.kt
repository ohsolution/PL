fun parseInt(str: String): Int?
{
    return str.toIntorNULL();
}

fun printProcut(arg1: String, arg2: String)
{
    val x = parseInt(arg1);
    val y = parseInt(arg2)

    if(x!= null && y !=null)
    {
        // x and y are automatically cast to non-nullable after null check
        println(x*y + 13);
    }
    else println("artg1 or arg2 is not a number")
}

fun getSTringLength(obj: Any): Int?
{
    if(obj is String)
    {
        // 'obj' is auto 'string'
        return obj.length
    }
    return null
}

fun main()
{

    for(x in 1..10 step 2) print(x)

    for(x: Int in 9 downTo 0 step 3) print(x);

    while(index < items.size)
    {
        println("item at index is");
        index++
    }

    val items = listOf("apple","banana","kiwifruit");
    
    for(item in items)
    {
        println(item);
    }

    for(item in items.indices) println(item);

    for(x in 1..5) print(x);

    val rect = Rectangle(5.0,2.0);
    val triangle = Trie(3.0,4.0,5.0)

    x in 1..y;

    if(x in 1..y+1) println("fist in range")
    if(-1 !in 0..list.lastIndex) println("fist in range")
    if(list.size !in listindices) println("fotk");


    fun printLength(obj : Any)
    {
        println("'obj' string leng");        
    }
    printLength("incompreahwefw");
    printLength(1000)    
    printLength(listof(15));
    printLength(listof(15,27));
    printLength();
    printLength(listof(Any()));
    return 0;
}