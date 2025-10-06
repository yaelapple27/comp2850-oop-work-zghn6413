import kotlin.random.Random
fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun main() {
    print("how many sides does the die have? ")
    val sides = readln()
    if (sides != ""){
        val result = readInt(sides)
        rollDie(result)
    }
    else{
        rollDie()
    }

}

fun readInt(string: String): Int{
    val result = string.toInt()
    return result
}