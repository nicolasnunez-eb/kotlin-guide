package testingFramework

class StringSpec(init: StringSpec.() -> Unit) {
    private val assertions = mutableListOf<Boolean>()
    init {
        init()
    }

    operator fun String.invoke(result: () -> Boolean) {
        assertions.add(result())
    }

    infix fun <T> T.shouldBe(another: T): Boolean {
        return this == another
    }

    fun execute() {
        if (assertions.all { it }) {
            println("All test passed ✅")
        }
        else throw Exception("Bad ❌")
    }
}