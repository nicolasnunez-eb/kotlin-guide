fun printNumbers(n: Int, n2: Int) {
    println(n)
    println(n2)
}

fun main(args: Array<String>) {
    println("Hello World!")
//    `2Generics`.Main.main()
//    `3operators`.Main.main()
    `4lambdas`.Main.main()

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