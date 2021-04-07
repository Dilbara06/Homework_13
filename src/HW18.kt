class Food{
    val type: String="Burger"
    val size: String="Big"
    val price: Int= 120
    val weight: Int= 200
}

class Paper{
    val color: String="white"
    val size: String="A4"
    val thickness: String="thick"
}

class Boiler{
    val producer: String="Bosch"
    val volumeL: Int= 10
    val color: String="white"
    val heightM: Int=1
}

class Battery{
    val producer: String="China"
    val brand: String="Renata"
    val type: String="Ultra Alkaline"
}

class Liquid{
    val type: String="Juice"
    val producer: String="J7"
    val product: String="orange"
}

class Cup{
    val owner: String="Dilbara"
    val material: String="glass"
    val volume: Int=200
    val color: String="Red"
}

class Box{
    val material: String="paper"
    val heightC: Int=50
    val lengthC: Int=20
    val widthC: Int=100
    val color: String="green"
}

class Student{
    val name: String="Tom"
    val surname: String="Davidson"
    val age: Int=19
    val university: String="Harvard"
    val group: String="H-2021"
}

class Employee{
    val name: String="Tom"
    val surname: String="Robertson"
    val age: Int=35
    val position:String="Manager"
}
class Cat{
    val name: String ="Murzik"
    val age: Int=2
    val pows: Int=4
    val color: String="White"
    var CatFoodLevel: String="Hungry"
    var CatWaterLevel:String="Thirsty"
    fun infoAboutCat(){
        println("Name: $name, Age: $age, Cat Food Level: $CatFoodLevel, Cat Water level: $CatWaterLevel")
    }
    fun feedCat(){
        CatFoodLevel="Full"
        println("Cat's food level is $CatFoodLevel")
    }
    fun waterCat(){
        CatWaterLevel="Full"
        println("Cat's water level is $CatWaterLevel")
    }


}
fun main(){
    val cat=Cat()
    println(cat.pows)
    cat.infoAboutCat()
    cat.waterCat()
    cat.feedCat()
    cat.infoAboutCat()
    val burger=Food()
    println(burger.price)
    val paper=Paper()
    println(paper.color)
    val boiler=Boiler()
    println(boiler.producer)
    val student=Student()
    println(student.age)
    val employee=Employee()
    println(employee.position)

}