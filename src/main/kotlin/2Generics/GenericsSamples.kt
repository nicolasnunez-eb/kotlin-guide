package `2Generics`


class Box(val elem: Any)
class Box2<T>(val elem: T)

fun <T> createBox(elem: T): Box2<T> = Box2(elem)


open class IdentificationElement<K>(open val id: K)


/* We have one implementation and multiple parameterization which are type safety */
/* Note: The generic type T is bounded to any type that extends from IdentificationElement */
open class InMemoryRepo<K, T : IdentificationElement<K>> {
    private val elements = mutableListOf<T>()

    fun add(elem: T) {
        elements.add(elem)
    }

    fun find(id: K): T? = elements.firstOrNull { it.id == id }
}


data class Dog(override val id: Int, val name: String) : IdentificationElement<Int>(id)

class DogRepo : InMemoryRepo<Int, Dog>()


data class Cat(override val id: String, val name: String) : IdentificationElement<String>(id)

class CatRepo : InMemoryRepo<String, Cat>()
