fun main(){
    var a =0
    var b =0
    println("enter the first number")
    var c = readLine()
    println("enter the second number")
    var d = readLine()


    if(c!=null){
        a=c.toInt()

    }
    if(d!=null){
        b=d.toInt()
        
    }
    var i =0
    while(i<=b){
        a=a*a
        
        i++
        
        
    }
    println(a) 
}