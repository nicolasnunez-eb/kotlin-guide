package `3operators`

data class Fraction(var numerator: Int, private val denominator: Int) {
    operator fun times(another: Fraction): Fraction {
        return Fraction(numerator * another.numerator, denominator * another.denominator)
    }

    operator fun unaryMinus(): Fraction {
        return Fraction(-numerator, denominator)
    }

    override fun toString(): String = "$numerator / $denominator"
}
