package i_introduction._8_Smart_Casts

//    Task 6.
//    Rewrite 'JavaCode6.eval()' in Kotlin using smart casts and 'when' expression.

interface Expr
class Num(val value:Int):Expr
class Sum(val left:Expr,val right:Expr):Expr

fun eval(e:Expr):Int
{
    when (e)
    {
        is Num -> return e.value
        is Sum -> return eval(e.left)+eval(e.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }
}