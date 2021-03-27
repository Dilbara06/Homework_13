import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println("Введите через пробел координаты точки и радиус круга, в формате - x y r")
    var (x, y, r) = readLine()!!.split(' ')
    var r2 = sqrt(x!!.toDouble().pow(2) + y!!.toDouble().pow(2))
    var R = r!!.toDouble()
    when {
        r2 <= R -> println("Точка ($x,$y) принадлежит кругу с радиусом $r")
        else -> println("Точка ($x,$y) не принадлежит кругу с радиусом $r")
    }
}