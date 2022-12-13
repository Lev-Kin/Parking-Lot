fun main() {
    val num: Int = readln().toInt()
    val ch: Char = readln().first()

    if (ch.code == num) {
        println(true)
    } else {
        println(false)
    }
}