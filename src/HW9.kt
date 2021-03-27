import com.sun.jdi.IntegerValue
import kotlin.reflect.typeOf

fun main() {
    /// Задача 1
    for (i in 1..5) {
        for (n in 1..5) {
            print(" * ")

        }
        println()
    }
    println()
    for (i in 1..5) {
        for (n in 1..5) {
            if (n > 5 - i) {
                print(" * ")
            } else {
                print("   ")
            }
        }
        println()
    }

    /// Задача 3
    println("Первые 20 элементов последовательности a(n)=a(n-1)*2")
    var a = 2
    for (i in 2..20) {
        print(" $a ")
        a *= 2
    }
    println()
    ///Задача 2
    var number = 65
    var count = 0
    while (number>1){
        var div = number/10
        count += 1
        number=div
    }
    println("В числе $count цифры")


}