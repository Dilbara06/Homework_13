import kotlin.math.*
fun main() {
    println("Введите сумму которую вы положили в банк и годовую ставку процента (от 0 до 100) через пробел")
    val (a, b) = readLine()!!.split(' ')
    var s=a!!.toFloat()
    var p=b!!.toFloat()

    fun amountAfter3Years(s:Float,p:Float):Float=s*(1+p/100).pow(3)

    var s3=amountAfter3Years(s,p)
    println("Сумма через три года составит $s3")

}
