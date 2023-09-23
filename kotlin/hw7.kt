fun main(){
    
    val age = readLine()
    var a :Int

    if(age!=null){
        a= age.toInt()
    
        if ( a <= 18){
            println("you are a kido")

        }
        else if (a < 19 || a < 65 ){
            println("your a teenager")
        }
        else{
            println("you are very old ")
        }
    }
    
    

}