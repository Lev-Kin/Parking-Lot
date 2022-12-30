fun main() {

    var result = readln().toInt()
    print("$result")

    while (result != 1) {
        result = if (result % 2 == 0) {
            result / 2
        } else {
            result * 3 + 1
        }
        print(" $result")
    }
}