import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)
    val list: ArrayList<String> = arrayListOf()
    repeat(5) {
        list.add(scanner.next())
    }

    for (i in list) {
        println(i)
    }
}


