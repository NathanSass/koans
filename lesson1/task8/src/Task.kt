fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    val personalInfo: PersonalInfo? =  client?.personalInfo

    val email: String = personalInfo?.email ?: return null

//    if (personalInfo == null || email == null) return null
    mailer.sendMessage(email, message)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}