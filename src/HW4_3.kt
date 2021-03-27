fun main() {
    println("Введите через пробел два числа a и b")
    var (a, b) = readLine()!!.split(' ')
    var c = a
    a = b
    b = c
    println("a = $a, b = $b")
}