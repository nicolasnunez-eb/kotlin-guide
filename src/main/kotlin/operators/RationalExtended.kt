package operators

class RationalExtended(val n: Fraction) {
    fun print() {
        n.print()
    }

    fun Fraction.print() {
        // This points to class that we are extending
        println(this.numerator)
    }
}