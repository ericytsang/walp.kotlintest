package iii_conventions

import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int):Comparable<MyDate>
{
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

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(public val start: MyDate, public val end: MyDate):Iterable<MyDate>
{
    override fun iterator():Iterator<MyDate>
    {
        return MyIterator()
    }

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
