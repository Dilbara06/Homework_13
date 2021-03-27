fun main(){
    var a=13
    val message = if (a%2==0){
        "$a is even"
    } else if (a%5==0){
       "$a is div by 5"
    }else {
        "$a is not even and not div by 5"
    }
    println(message)
    val message1= when{
        a%2 == 0 -> "$a is even"
        a%5==0 -> "$a is div by 5"
        else->  "$a is not even and not div by 5"
    }
    println(message1)
}