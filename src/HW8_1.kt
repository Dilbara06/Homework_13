fun main(){
    val array1= arrayOf(1,2,3)
    val array2= arrayOf(4,5,6)
    var arraySum=Array(3){0}
    for (i in array1.indices) {
        arraySum[i]=array1[i]+array2[i]
        println(arraySum[i])
    }

    val array3=arrayOf(5,-3,15,61,29,10,-2,7)
    var max=array3[0]
    for (i in array3.indices){
        if (array3[i]>max){
            max=array3[i]
        }
    }
    println("Max value of array is $max")
}