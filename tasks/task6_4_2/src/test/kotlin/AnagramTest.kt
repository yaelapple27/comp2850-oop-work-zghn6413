// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    // Write your unit tests here!
    "Words that are not an Anagram but same length"{
        "hello" anagramOf "boats" shouldBe false
        "hi" anagramOf "no" shouldBe false
    }

    "Words that are not an Anagram and are different lengths"{
       "hello" anagramOf "bonjour" shouldBe false
        "hi" anagramOf "hello" shouldBe false  
    }

    "An empty string is not an anagram"{
        "" anagramOf "" shouldBe false
     
    }
    
    "Words that are an Anagram"{
        "lol" anagramOf "lol" shouldBe true
        "silent" anagramOf "listen" shouldBe true
    }
})
