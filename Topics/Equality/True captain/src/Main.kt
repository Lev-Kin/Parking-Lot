// you do not need to understand how it works, ignore it
data class Pirate(var name: String)

// Do not touch the lines above

fun main() {
    var captain = Pirate("Hector Barbossa")
    println(captain.name)
    captain.name = "Jack Sparrow"
    println(captain.name)
}
