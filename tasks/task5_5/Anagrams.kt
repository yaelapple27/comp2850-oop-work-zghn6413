infix fun String.anagramOf(str: String) = this.lowercase().toList().sorted() == str.lowercase().toList().sorted()

fun main(){
    print("First string: ")
    val first = readln()
    print("Second string: ")
    val second = readln()
    if (first anagramOf second){
        println("$first is anagram of $second")
    }
    else{
        println("$first is not anagram of $second")
    }

}