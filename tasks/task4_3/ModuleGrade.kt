import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 3){
        println("Error")
        exitProcess(1)
    }
    else{
        val total = args[0].toInt() + args[1].toInt() + args[2].toInt()
        val average = total/3
        val grade = when (average) {
            in 0..39    -> "Fail"
            in 40..69   -> "Pass"
            in 70..100  -> "Distinction"
            else        -> "?"
        }
        println(average)
        println(grade)
    }
}