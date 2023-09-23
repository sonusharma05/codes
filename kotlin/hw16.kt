fun main(){
    var output = 0
    val list = mutableListOf(1,2,3,4,5)
    println("enter the number you want to find in the $list")
    var b = readLine()?.toInt()
    if ( b!= null){
       output = find(list, b)
    }
    println(" the index of element $b is $output")


}
fun find(a : List<Int>, b :Int): Int{
    var ans = 0
    for (i in 0..4){
        if(a[i]==b)
            ans=i
    }

    return ans

}