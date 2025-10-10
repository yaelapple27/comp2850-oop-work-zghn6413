// Task 7.7.2: contact database, using a map
fun main(){
    val contacts = mutableMapOf<String, String>()

    while (true){
        println("Enter contact name: ")
        val name = readln()
        if (name in contacts){
            println("Phone number for $name: ${contacts[name]}")
        }
        else{
            println("No number found for $name")
            println("Please add the number for $name: ")
            val phoneNo = readln()
            contacts[name] = phoneNo
            println("save")
        }
        println("Do you want to find another contact number: Y/N")
        val result = readln().uppercase()
        if (result == "N"){
            break
        }
    }
}