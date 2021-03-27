import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    println("Введите a")
    var a = readLine()
    println("Введите b")
    var b = readLine()
    println("Введите c")
    var c = readLine()
    var d = b!!.toFloat().pow(2)-4*a!!.toFloat()*c!!.toFloat()
    if (d>0){
        var x1 = (-b!!.toFloat()+ sqrt(d))/(2*a!!.toFloat())
        var x2 = (-b!!.toFloat()- sqrt(d))/(2*a!!.toFloat())
        println("x1 = $x1")
        println("x2 = $x2")
    } else if (d<0){
         println("Корней у уравнения нет")
    } else {
        var x = -b!!.toFloat()/(2*a!!.toFloat())
        println("Корень уравнения равент $x")
    }
}


