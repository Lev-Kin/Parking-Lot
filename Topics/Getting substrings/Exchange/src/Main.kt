fun main() {
    val str = readln()
    println(str.last() + str.substring(1, str.length - 1) + str.first())
}