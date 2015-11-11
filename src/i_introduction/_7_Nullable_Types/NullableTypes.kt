package i_introduction._7_Nullable_Types

//    Task 5.
//    Rewrite JavaCode5.sendMessageToClient in Kotlin, using only one 'if' expression.
//    Declarations of Client, PersonalInfo and Mailer are given below.

fun sendMessageToClient(client:Client?,message:String?,mailer:Mailer):Unit
{
    val email:String? = client?.personalInfo?.email
    if (email != null && message != null) mailer.sendMessage(email,message)
}

class Client(val personalInfo:PersonalInfo?)
class PersonalInfo(val email:String?)

interface Mailer
{
    fun sendMessage(email:String,message:String)
}
