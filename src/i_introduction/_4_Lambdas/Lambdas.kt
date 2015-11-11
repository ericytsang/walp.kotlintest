package i_introduction._4_Lambdas

//    Task 3.
//    Rewrite 'JavaCode3.task3()' in Kotlin using lambdas.
//    You can find the appropriate function to call on 'collection' through IntelliJ's code completion feature.
//    (Don't use the class 'Iterables').

fun todoTask3(collection: Collection<Int>): Boolean
{
    return collection.any { element -> element % 42 == 0 }
}

fun task3(collection: Collection<Int>): Boolean = todoTask3(collection)




