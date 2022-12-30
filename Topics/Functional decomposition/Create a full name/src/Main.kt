fun main(args: Array<String>) {
    val firstName = readln()
    val lastName = readln()
    createFullName(firstName, lastName)
}

fun createFullName(firstName: String, lastName: String) {
    println("$firstName $lastName")
}