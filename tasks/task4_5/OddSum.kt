// Task 4.5: summing odd integers with a for loop
fun main(){
    print("set a limit: ")
    val limit = readln().toInt()
    var total = 0
    for (n in 1..limit step 2){
        total = total + n
    }
    println(total)
}