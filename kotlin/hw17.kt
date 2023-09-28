fun main(){
    var sum = alternatingsum(1,2,4,5,6,7,6,9)
    println("the alternation sum is $sum")

}

fun alternatingsum(vararg numbers :Int) :Int{   
    var sum =0
    var bool = true
    for (i in numbers ){
        if(bool){
            sum+=i
        }
        else{
            sum-=i
        }
        bool = ! bool
    }
    return sum;
}