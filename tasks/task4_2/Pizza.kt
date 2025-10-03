fun main(){
    print("PIZZA MENU")
    print("(a) Margherita")
    print("(b) Quattro Stagioni")
    print("(c) Seafood")
    print("(d) Hawaiian")
    print("Choose your pizza (a-d): ")
    
    val input = readln().lowercase()
    if (input.length == 1 && input[0] in 'a'..'d') {
        println("Order Accepted")
    }
    else{
        println("Invalid Choice!")
    }
}