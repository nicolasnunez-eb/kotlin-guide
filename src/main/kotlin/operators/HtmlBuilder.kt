package operators

// Builder
class HtmlBuilder {
    private val childrenTags = mutableListOf<String>()

    fun addTag(tag: String) {
        childrenTags.add(tag)
    }

    operator fun String.unaryPlus() : Unit {
        addTag(this)
    }

    fun build(): String {
        return ""
    }
}


fun html(init: HtmlBuilder.() -> Unit): String {
    val htmlBuilder = HtmlBuilder()
    htmlBuilder.init()
    return htmlBuilder.build()
}