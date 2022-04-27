package operators

class RationalExtended(val n: Rational) {
    fun print() {
        n.print()
    }

    fun Rational.print() {
        // This points to class that we are extending
        println(this.numerator)
    }
}