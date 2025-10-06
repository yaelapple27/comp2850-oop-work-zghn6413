// Task 5.2.2: conversion of marks into grades, using a function
fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}

fun main(args: Array<String>){
    var i = 0
    for (arg in args){
        var mark = args[i]
        var result = grade(mark.toInt())
        println("$mark is a $result")
        i =i +1
    }

}