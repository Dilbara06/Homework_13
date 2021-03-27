fun main(){
    println("Введите номер месяца, например Июнь-6")
    var a = readLine()
    var month=a!!.toInt()
    when(month){
        1,3,5,7,8,10,12 -> println("Месяц $month -дней 31")
        4,6,9,11 -> println("Месяц $month -дней 30")
        2 -> println("Месяц $month -дней 28 или 29")
    }


}