package `1overloadMethods`

data class Book(val id: Int, val name: String)

class BookRepo {
    private val books = listOf<Book>()

    fun find(id: Int): Book? {
        return books.firstOrNull { it.id == id }
    }

    /* This will not work */
//    fun find(id: Int): String {
//        return ""
//    }

    fun find(id: Int, name: String): Book? {
        return books.firstOrNull { it.id == id || it.name == name }
    }

}