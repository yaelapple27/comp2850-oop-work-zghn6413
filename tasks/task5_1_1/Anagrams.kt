// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main(){
    print("First string: ")
    val first = readln()
    print("Second string: ")
    val second = readln()
    val result = anagrams(first, second)
    println("it is an anagram?: $result")
}