// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circleLength(radius: Double) = 2 * PI * radius

fun readDouble(string: String) : Double{
    val result = string.toDouble()
    return result
}

fun main(){
    print("Enter length of radius: ")
    val string = readln()
    val result = readDouble(string)
    val area = circleArea(result)
    val length = circleLength(result)
    println("the area is %.4f".format(area))
    println("the length is %.4f".format(length))

}