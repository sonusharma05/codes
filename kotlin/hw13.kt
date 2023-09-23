fun main(){
    println("enter the number of element you want in fibonacchi series ")
    var a = 0
    var b = 1
    val n =readLine()?.toInt()
    var list= mutableListOf<Int>()
    list.add(a)
    list.add(b)
    if (n != null){
    for ( i in 1..n-2){
        
        val c= a+b
        list.add(c)
        a=b
        b=c
        
        

        

    
        
    }
    }
    println(list)

}