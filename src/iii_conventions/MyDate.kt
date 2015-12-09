package iii_conventions

data class MyDate(val year:Int,val month:Int,val dayOfMonth:Int):Comparable<MyDate>
{
    /** [todoTask25]: Comparison */
    override fun compareTo(other:MyDate):Int
    {
        when
        {
            year != other.year -> return year-other.year
            month != other.month -> return month-other.month
            else -> return dayOfMonth-other.dayOfMonth
        }
    }
}

enum class TimeInterval
{
    DAY,
    WEEK,
    YEAR
}

/** [todoTask27]: RangeTo */
operator fun MyDate.rangeTo(other:MyDate) = DateRange(this,other)

/** [todoTask29]: OverloadingOperators */
class RepeatedTimeInterval(val ti:TimeInterval,val n:Int)

/** [todoTask29]: OverloadingOperators */
operator fun MyDate.plus(other:TimeInterval) = this+RepeatedTimeInterval(other,1)

/** [todoTask29]: OverloadingOperators */
operator fun MyDate.plus(other:RepeatedTimeInterval):MyDate
{
    return this.addTimeIntervals(other.ti,other.n)
}

/** [todoTask29]: OverloadingOperators */
operator fun TimeInterval.times(other:Int):RepeatedTimeInterval = RepeatedTimeInterval(this,1)*other

/** [todoTask29]: OverloadingOperators */
operator fun RepeatedTimeInterval.times(other:Int):RepeatedTimeInterval
{
    return RepeatedTimeInterval(ti,n*other)
}

class DateRange(override public val start:MyDate,override public val end:MyDate):Iterable<MyDate>,kotlin.ClosedRange<MyDate>
{
    /** [todoTask28]: InRange */
    override val endInclusive:MyDate = end

    /** [todoTask26]: ForLoop */
    override fun iterator():Iterator<MyDate>
    {
        return MyIterator()
    }

    /** [todoTask26]: ForLoop */
    inner class MyIterator:Iterator<MyDate>
    {
        private var nextDate = start
        override fun next():MyDate
        {
            val result = nextDate
            nextDate = nextDate.nextDay()
            return result
        }

        override fun hasNext():Boolean = nextDate <= end
    }
}
