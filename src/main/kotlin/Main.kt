import operators.HtmlBuilder
import operators.Rational
import operators.RationalExtended
import operators.html
import testingFramework.StringSpec

fun printNumbers(n: Int, n2: Int) {
    println(n)
    println(n2)
}

fun main(args: Array<String>) {
    println("Hello World!")
    `2Generics`.Main.main()
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    val n = Rational(1, 2)
//    val n2 = Rational(1, 4)
////    println(n - n2)
////    println(-n)
//
//    // Operator functions
//    n(10)
//    // Lambdas
//    n.execute { a, b ->
//        run {
//            println(a)
//            println(b)
//        }
//    }
//    // Lambdas + Operator functions
//    n(::printNumbers)
//    n { a, b ->
//        run {
//            println(a)
//            println(b)
//        }
//    }
//    // Extension functions
//    val rExtended = RationalExtended(n)
//    rExtended.print()
//    // Lambda + Extension
//    val htmlBuilder = HtmlBuilder()
//    htmlBuilder.addTag("<h1></h1>")
//    htmlBuilder.addTag("<p></p>")
//
//    val htmlTemplate = html {
//        // Operator + extension functions
//        +"<h1></h1>"
//        +"<h1></h1>"
//    }
//
//    val test = StringSpec {
//        "it should return true" {
//            1 shouldBe 1
//        }
//    }
//    try {
//        test.execute()
//    }catch (e: Exception) {
//        println(e)
//    }
}