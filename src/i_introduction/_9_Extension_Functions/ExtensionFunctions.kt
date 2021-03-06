package i_introduction._9_Extension_Functions

//    Task 8.
//    Implement the extension functions Int.r(), Pair<Int, Int>.r()
//    to support the following manner of creating rational numbers:
//    1.r(), Pair(1, 2).r()

data class RationalNumber(val numerator:Int,val denominator:Int)

fun Int.r():RationalNumber = RationalNumber(this,1)
fun Pair<Int,Int>.r():RationalNumber = RationalNumber(first,second)


