//ask the user to enter thier country and greet them
fun main(){
    println("where are you from")
    val country = readLine()
    when(country){
    "india" -> print("namaste")
    "usa" -> print("hello")
    "germany" -> print("halo")
    else -> println("i dont know")
     }
}