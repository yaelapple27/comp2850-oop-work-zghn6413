// Task 7.3.1: list element access
fun main(){
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.get(0))
    //print(numbers[10])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    println("Enter value to replace first item: ")
    val replace = readln().toInt()
    //numbers.add(replace) causes errors
}