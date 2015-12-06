package i_introduction._3_Default_Arguments

//    Task 3.
//    Several overloads of 'JavaCode2.foo()' can be replaced with one function in Kotlin.
//    Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
//    You have to add parameters and replace 'todoTask3()' with a real body.
//    Uncomment the commented code and make it compile.

fun todoTask3(name:String,number:Int,toUpperCase:Boolean):String
{
    return (if (toUpperCase) name.toUpperCase() else name)+number
}

fun foo(name:String,number:Int = 42,toUpperCase:Boolean = false):String = todoTask3(name,number,toUpperCase)

fun task3():String
{
    return (foo("a")+
        foo("b",number = 1)+
        foo("c",toUpperCase = true)+
        foo(name = "d",number = 2,toUpperCase = true))
}