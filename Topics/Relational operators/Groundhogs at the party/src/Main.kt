fun main() {
    val number = readln().toInt()
    val weekends = readln().toBoolean()

    if (weekends) {
        if (number in 15..25) {
            println(true)
        } else {
            println(false)
        }
    } else {
        if (number in 10..20) {
            println(true)
        } else {
            println(false)
        }
    }
}
