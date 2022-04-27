package operators

data class Rational(var numerator: Int, private val denominator: Int) {
    operator fun unaryMinus(): Rational {
        return Rational(-numerator, denominator)
    }

    operator fun invoke(n: Int) {
        numerator *= n
    }

    operator fun invoke(function: (n: Int, n2: Int) -> Unit) {
        function(numerator, denominator)
    }

    // Custom function that receive a lambda
    fun execute(function: (n: Int, n2: Int) -> Unit) {
        function(numerator, denominator)
    }

    operator fun minus(another: Rational): Rational {
        return Rational(numerator - another.numerator, denominator - another.denominator)
    }

    override fun toString(): String {
        return "$numerator / $denominator"
    }
}
