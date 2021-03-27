fun main(){
    val itemCosts= mapOf("Хлеб" to 30, "Сахар" to 60, "Картофель" to 50, "Молоко" to 60, "Сок" to 150)
    val shoppingList=listOf("Хлеб", "Картофель")
    var totalCost=0
    for (item in shoppingList){
        val itemCost=itemCosts[item]
        if (itemCost!=null){
            totalCost+=itemCost
        }
    }
    println("Общая стоимость покупки составит $totalCost")

}