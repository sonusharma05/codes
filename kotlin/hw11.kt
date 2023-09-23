fun main(){
    var aver=0.0
    for( i in 1..5){
        var input = readLine()?.toInt()
        if(input != null){
        aver  += input/5.0
        }
       


    }
    println(aver)
}