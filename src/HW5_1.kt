fun main(){
    println("Введите четырехзначное число")
    var a = readLine()
    var x1 = a!!.toCharArray()[0].toInt()
    var x2 = a!!.toCharArray()[1].toInt()
    var x3 = a!!.toCharArray()[2].toInt()
    var x4 = a!!.toCharArray()[3].toInt()

    var bool=x1+x2==x3+x4
    if (bool){
        println("Число счастливое? True")
    }else{
        println("Число счастливое? False")
    }

}