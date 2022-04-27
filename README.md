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
## Operator
## Lambdas
## Operator + Lambdas
## Extension functions
https://kotlinlang.org/docs/extensions.html
## Extension functions + Lambdas
## Infix
