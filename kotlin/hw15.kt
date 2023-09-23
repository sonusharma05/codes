fun main(){
    var a = readLine()?.toInt()
    if(a!=null){
        sum(a)
    }


}
fun sum(n : Int){
    var sum=0
    for (i in 1..n){
        sum=sum+i
    }
    print(sum)

}