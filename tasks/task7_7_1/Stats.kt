// Task 7.7.1: stats for a numeric dataset
fun readData() = buildList<Float> {
    println("Enter floating point value: ")
    val first = readln().toFloat()
    var numbers = mutableListOf<Float>()
    numbers.add(first)
    while (true){
        println("another floating point: ")
        val point = readln().toFloat()
        numbers.add(point)
        println("are you done: Y/N")
        val answer = readln().uppercase()
        if (answer == "Y"){
            break
        }
    }
    return numbers
}

fun Median(numbers: List<Float>): Float{
    val size = numbers.size

    if (size % 2 ==1){
        val median = numbers[size/2]
        return median
    }
    else{
        val median = (numbers[size/2 -1] + numbers[size/2])/2
        return median
    }
}

fun Stats(numbers: List<Float>) {
    val sorted = numbers.sorted() 
    val minimum = sorted.min()
    val maximum = sorted.max()
    val sumOf = sorted.sum()
    val average = sorted.average()
    val median = Median(sorted)
    println("Minimum: $minimum, Maximum: $maximum, Sum: $sumOf, Average: $average, Median: $median")
}

fun main() {
    val data = readData()
    Stats(data)
}