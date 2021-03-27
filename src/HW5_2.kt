fun main(){
    println("Введите ваш возраст")
    var a = readLine()
    var age=a!!.toInt()

    if (age>= 1 && age <=200) {
        if (age>= 11 && age <=14) {
            println("$age лет")
        } else if (age>=111 && age<=114){
            println("$age лет")
        } else if (age%10 == 1){
            println("$age год")
        } else if (age%10 ==2 || age%10 == 3 || age%10 == 4){
            println("$age года")
        }  else {
            println("$age лет")
        }
    } else {
        println("Введите возраст в диапазоне от 1 до 200")
    }

}