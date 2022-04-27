# Kotlin
## Overload methods
* It is used when you want to have the same method but with different arguments
* **Note**: If you want to define the same method with same arguments but different return types
it will not work.
```kotlin
fun find(id: Int): Book?
fun find(id: Int): String // <-- ❌ It will not compile
fun find(id: Int, name: String): Book? // <-- Ok 👍 since the arguments are different
```

## Generics
[Java generics](https://docs.oracle.com/javase/tutorial/java/generics/types.html)

[Baeldung](https://www.baeldung.com/java-generics#:~:text=Java%20Generics%20is%20a%20powerful,extra%20overhead%20to%20our%20applications.)

[Kotlin generics](https://kotlinlang.org/docs/generics.html)

TL;DR: Generics is a way to parameterize types so then the compiler can ensure
you are using the right type

It's mainly uses are:
1. You have a "container" class that can wrap any type, i.e a Box, one approach
could be having a type `Any` inside the `Box` class but the problem with this is that
when you want to retrieve the element of the box, you will have to cast it.
What you can do is use **Generics** to make the compiler understand that your `Box` class
could receive any type, but this type will be inferred from the information provided by the programmer. 
```kotlin
class Box(val elem: Any)

val box = Box(1)
val elem = box.elem
val elem: Int = box.elem // <-- ❌ This will not compile because elem is type Any 
println(elem + 1) // <-- ❌ This will not compile because elem is type Any
val elem: Int = box.elem as Int // ✅ Compile but it sucks

/*-------------------*/
class Box<T>(val elem: T)

val box = Box(1)
val elem = box.elem
val elem: Int = box.elem // <-- ✅ This will compile because the generic type T was parameterized to Int✅ This will compile because the generic type T was parameterized to Int✅ This will compile because the generic type T was parameterized to Int 
println(elem + 1) // <-- ✅ This will compile because the generic type T was parameterized to Int✅ This will compile because the generic type T was parameterized to Int✅ This will compile because the generic type T was parameterized to Int
```
2. When you want to bind arguments with return values in a method/function
```kotlin
fun <T> createBox(elem: T): Box<T> {
    return Box(elem)
}
```

## Operator
[Kotlin](https://kotlinlang.org/docs/operator-overloading.html)

In kotlin you can redefine classic operators like `+`, `-`, `*` and so on.
To do that you have to use the `operator` keyword in your methods like so:

```kotlin
data class Fraction(val numerator: Int, val denominator: Int) {
    operator fun times(another: Fraction): Fraction {
        return Fraction(numerator * another.numerator, denominator * another.denominator)
    }

    operator fun unaryMinus(): Fraction {
        return Fraction(-numerator, denominator)
    }
    
    override fun toString(): String = "$numerator / $denominator"
}

val myFraction = Fraction(1, 2)
val anotherFraction = Fraction(1, 2)

println(-myFraction) // --> Will print "-1 / 2"
println(myFraction * anotherFraction) // --> Will print "1 / 4"
```

## Lambdas
[Lambdas](https://kotlinlang.org/docs/lambdas.html#instantiating-a-function-type)
[Destructuring](https://kotlinlang.org/docs/destructuring-declarations.html)

1. Classic lambda: The classic notation (the same as Java) is declaring
the parameter on the left side of the `->` and then execute the code on the right side.
Lambas do not need the `return` keyword because a lambda always return something, in case of kotlin
it will return the type of the last line of the lambda. 
```kotlin
val words = listOf("asd", "mqwet", "awesome", "fantastic", "lambda")

println(words.filter { word -> word.length == 3 })
```
2. `it` notation: If your lambda has one parameter you can get rid of the classic notation
and just refer the parameter using the `it` keyword
```kotlin
val words = listOf("asd", "mqwet", "awesome", "fantastic", "lambda")

println(words.filter { it.length == 3 })
```
3. Multiple parameters: As a lambda is a function you can pass multiple parameters
```kotlin
val sum: (a: Int, b: Int) -> Int = { a, b -> a + b }

println(sum(1, 2))
```
4. Destructuring: Could be applied on any class that support `componentN` methods. Destructuring not only applies
for lambdas it can be used when declaring variables
```kotlin
data class Dog(val name: String, val legs: Int)

/** You can use whatever name you want when destructuring the object 👇
 If you want to use `{ (n, l) -> ... }` it's ok it will compile */
val printDog: (dog: Dog) -> Unit = { (name, legs) -> println("This dog is $name and have $legs legs") }
```
## Operator + Lambdas
## Extension functions
https://kotlinlang.org/docs/extensions.html
## Extension functions + Lambdas
## Infix
