package v_builders.myHtml

class MyHtml(val name: String = "html") {
    override fun toString(): String {
        return "<$name>" + "<$name>"
    }
}


open class Tag(val name: String) {
    val children: List<Tag> = mutableListOf()
}

class HTML : Tag("html") {
    fun table(init: Table.() -> Unit): Table {
        return Table()
    }
}

class Table : Tag("table") {
    fun tr(): TR {
        return TR()
    }
}

class TR : Tag("tr")
class TD : Tag("td")

fun html(init: HTML.() -> Unit): HTML {
    return HTML()
}

//fun HTML.table():Table{
//    return Table()
//}

fun main(args: Array<String>) {
    var html = html() {
        table {
            tr()
        }
    }

}