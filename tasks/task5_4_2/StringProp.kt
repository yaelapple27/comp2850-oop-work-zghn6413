
val String.tooLong: Boolean get() = this.length > 20
fun main(){
    print("Enter a string: ")
    val result= readln()
    if (result.tooLong){
        println("Too long")
    }
    else{
        println("Good")
    }
}
