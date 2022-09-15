fun main(args: Array<String>) {
    var razas = mutableMapOf("razaPerro" to "corgi")
    razas.put("razaPerro", "pitbull")
    val a : Boolean = false
    println(a)
}

fun mapExample() {
    val superHeroesAges = mapOf(
        "Ironman" to 50,
        "Spiderman" to 17,
        "captain america" to 100
    )

    val superHeroesMutable = mutableMapOf(
        "Ironman" to 50,
        "SpiderMan" to 17,
        "captain america" to 100
    )

    superHeroesMutable.put("wolverine", 500)
    superHeroesMutable["Storm"] = 30

    println(superHeroesAges)
    println(superHeroesMutable)
}
fun miFuncion(nombre: String, apellido: String) = nombre + apellido
fun listExample() {
    val nameList = listOf("Leo", "Fas", "Gio")
    println(nameList)

    val mutableNameList = mutableListOf<String>()

    println(mutableNameList)
    mutableNameList.add("leo")

    println(mutableNameList)

    println(mutableNameList.run { get(0) })
    println(mutableNameList[0])
    println(mutableNameList.firstOrNull())
    mutableNameList.removeAt(0)
    mutableNameList.removeIf { character -> character.length > 3 }
    println(mutableNameList)

    val myArray = arrayOf(1, 2, 3, 4)

    println("Our Array $myArray")
    println("Our Array as list ${myArray.toList()}")

    val lotteryNumList = listOf(1, 78, 22, 43, 56)

    val sortedLottery = lotteryNumList.sorted()

    val descendingSortedLottery = lotteryNumList.sortedDescending()

    println(lotteryNumList)
    println(sortedLottery)
    println(descendingSortedLottery)
    println(lotteryNumList.sortedBy { num -> num <50 })
    println(lotteryNumList.shuffled())
    println(lotteryNumList.reversed())

    val messageList = lotteryNumList.map {num -> "your lottery num is $num"}

    println(messageList)

    val filteredNumbers = lotteryNumList.filter { num -> num > 30 }

    println(filteredNumbers)
}

fun exceptionExample() {
    val a = 10
    val b = 0
    val solution: Int = try {
        a + b
    } catch (exception: Exception) {
        0
    } finally {
        println("prueba")
    }

    println(solution)
    val string: String? = null

    val length: Int = string?.length ?: 0
    println(length)

}

fun forExample() {
    val fruitList = listOf("apple", "peach", "blueberry")
    for (fruit in fruitList) println("today I'll eat a $fruit")
    fruitList.forEach { fruit -> println("your sis will eat a $fruit") }

    val charactersOfFruits = fruitList.map { fruit -> fruit.length }
    println(charactersOfFruits)

    val filteredList = charactersOfFruits.filter { charactersOfFruit -> charactersOfFruit > 5 }
    println(filteredList)
}

fun whileExample() {
    var counter = 10
    while (counter > 0) {
        println("El valor de contador es $counter")
        counter--
    }
}

fun doWhileExample() {
    do {
        println("random num")
        val randomNum = (0..100).random()
        println(randomNum)
    } while (randomNum != 12)
}

fun whenExample()    {
    val nameColor = "Crimson"

    when (nameColor) {
        "Yellow" -> println("is the happiness color")
        "Red", "Crimson" -> println("is the rage color")
        else -> println("error I haven't idea about the color")
    }
    val code = 200
    when (code) {
        in 200..299 -> "Success"
        in 300..500 -> "Error"
        else -> "wtf dude"
    }
}

fun ifExample() {
    val name = "Leo"

    if (name.isNotEmpty()) {
        println("the length of our variable is ${name.length}")
    } else {
        println("the variable is empty")
    }
    val message: String = if (name.length > 4) {
        "your name is long"
    } else if (name.isEmpty()) {
        "you don't tell me your name"
    } else {
        "your name is short"
    }
    println(message)
}