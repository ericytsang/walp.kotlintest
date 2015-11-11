package i_introduction._6_Data_Classes

//    Convert 'JavaCode7.Person' class to Kotlin.
//    Then add an annotation `data` to the resulting class.
//    This annotation means the compiler will generate a bunch of useful methods in this class: `equals`/`hashCode`, `toString` and some others.
//    The `task7` function should return a list of persons.

fun todoTask7(): List<Person>
{
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

data class Person(val name: String, val age: Int)

fun task7(): List<Person>
{
    return todoTask7()
}

