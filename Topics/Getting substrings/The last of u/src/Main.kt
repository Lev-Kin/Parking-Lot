fun main() {
    val string = readln()
    println(string.substring(0, string.lastIndexOf("u") + 1) + string.substring(string.lastIndexOf("u") + 1, string.length).toUpperCase())
}