package i_introduction._2_Named_Arguments

//    Task 2.
//    Implement the same logic as in 'task1' again through the library method 'joinToString()'.
//    Change values of some of the 'joinToString' arguments.
//    Use default and named arguments to improve the readability of the function invocation.

fun todoTask2(collection:Collection<Int>):String
{
    return collection.joinToString(prefix = "{",postfix = "}")
}

fun task2(collection:Collection<Int>):String
{
    return todoTask2(collection)
}
