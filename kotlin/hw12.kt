
fun main(){
    val list =mutableListOf<Int>()
    for (i in 1..5){
        val a = readLine()?.toInt()
        if(a != null){
            list.add(a)
        }
    }
    print(list.reversed())
}