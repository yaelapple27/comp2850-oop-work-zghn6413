fun main(){
    print("PIZZA MENU")
    print("(a) Margherita")
    print("(b) Quattro Stagioni")
    print("(c) Seafood")
    print("(d) Hawaiian")
    
    var input = ""
    
    while (input.length != 1 || input[0] !in 'a'..'d'){
        print("Choose your pizza (a-d): ")
        input = readln().lowercase()
    }  
    println("Order Accepted")
}