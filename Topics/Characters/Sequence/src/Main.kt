fun main() {
    val ch1: Char = readln().first()
    val ch2: Char = readln().first()
    val ch3: Char = readln().first()
    if (ch1 == ch2 - 1 && ch2 == ch3 - 1) {
        println(true)
    } else {
        println(false)
    }
}
