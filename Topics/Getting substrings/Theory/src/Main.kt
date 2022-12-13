// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val a = "GooD"
    println(a.substringBefore('o') + "OO" + a.substringAfter('o'))
    println(a.replace("o", "O"))
    println(a.uppercase())
    println(a.lowercase())
    println(a.replaceFirst('o', 'O'))
}
