package `4lambdas`

object Main {
    fun main() {
        val words = listOf("asd", "mqwet", "awesome", "fantastic", "lambda")
        // Classic lambda notation
        println("Classic lambda notation")
        println(words.filter { word ->
            val len = word.length
            len == 3
        })
        // It notation
        println("It notation")
        println(words.filter { it.length == 3 })

        // Lambda Multiples parameters
        val sum: (a: Int, b: Int) -> Int = { a, b -> a + b }
        println("Lambda Multiples parameters")
        println(sum(1, 2))

        // Destructuring
        data class Dog(val name: String, val legs: Int)

        // Without destructuring with classical lambda notation
        val printDog: (dog: Dog) -> Unit = { dog -> println("This dog is ${dog.name} and have ${dog.legs} legs") }
        // Without destructuring with it notation
        val printDog2: (dog: Dog) -> Unit = { println("This dog is ${it.name} and have ${it.legs} legs") }
        // With destructuring
        val printDog3: (dog: Dog) -> Unit = { (name, legs) -> println("This dog is $name and have $legs legs") }

        val dog = Dog("manchi", 5)
        println("Without destructuring with classical lambda notation")
        printDog(dog)
        println("Without destructuring with it notation")
        printDog2(dog)
        println("With destructuring")
        printDog3(dog)
    }
}