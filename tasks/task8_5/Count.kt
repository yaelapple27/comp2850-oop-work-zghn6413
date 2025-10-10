fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}

fun main(){
    println("Enter phrase: ")
    val text = readln()

    val vowelsNo = text.howMany { it.lowercaseChar() in "aeiou" }
    println("Vowels: $vowelsNo")

    val numberNo = text.howMany { it.isDigit() }
    println("Numbers: $numberNo")

    val punctuation = text.howMany { it in listOf('.', ',', '!', '?') }
    println("Punctuation: $punctuation")

}