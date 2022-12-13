fun main() {
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    println(number1 != number2 && number2 != number3 && number1 != number3)
}