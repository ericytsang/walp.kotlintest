package iii_conventions

import util.*


class Invokable(private val invocationCount:Int = 0)
{
    operator fun invoke() = Invokable(invocationCount+1)
    fun getNumberOfInvocations():Int = invocationCount
}

fun todoTask31(): Nothing = TODO(
    """
        Task 31.
        Change class Invokable to count the number of invocations (round brackets).
        Uncomment the commented code - it should return 4.
    """,
    references = { invokable: Invokable -> })

fun task31(invokable: Invokable): Int {
    return invokable()()()().getNumberOfInvocations()
}
