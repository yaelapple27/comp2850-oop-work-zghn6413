// Task 5.3.2: dice rolling simulation
import kotlin.random.Random
fun rollDie(sides: Int = 6, dieNo: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling $dieNo number of d$sides dice...")
        var total = 0
        for (n in 1..dieNo){
            val result = Random.nextInt(1, sides + 1)
            total = result + total
            val n = n + 1
        }
        println("You rolled a total of $total")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun main() {
    print("how many sides does the die have? ")
    val sides = readln()
    print("how many die? ")
    val dice = readln()
    if (sides != "" && dice != ""){
        val result = readInt(sides)
        val result2 = readInt(dice)
        rollDie(result, result2)
    }
    else if (sides != "" && dice == "") {
        val result = readInt(sides)
        rollDie(result)
    }
    else if (sides == "" && dice != "") {
        val result2 = readInt(dice)
        rollDie(dieNo = result2)
    }

}

fun readInt(string: String): Int{
    val result = string.toInt()
    return result
}
