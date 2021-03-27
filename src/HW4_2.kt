fun main(){
    println("Введите через пробел время выезда в формате- час минуты")
    var (a, b) = readLine()!!.split(' ')
    println("Введите через пробел время приезда в формате- час минуты")
    var (a1, b1) = readLine()!!.split(' ')
    var trip = (a1!!.toInt()*60+b1!!.toInt())-(a!!.toInt()*60+b!!.toInt())
    println ("Время поездки составило: $trip  минут")
}