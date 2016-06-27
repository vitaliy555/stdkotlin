package i_introduction._7_Nullable_Types

/**
 * Created by vitaliy on 6/20/16.
 */

fun main(args: Array<String>) {
    callListWithNull()
    callWithNullValue()
    safeCast()
    theOperator()
}


fun callListWithNull() {
    var list: List<String?> = listOf("String", null)
    list.forEach { item -> item?.let { println("$item  --- is not null") } }
}

fun callWithNullValue() {
    var tc: TestClass = TestClass("testLable", null)
    var childLable = tc?.testChild?.lable
    println(childLable ?: "ooops - null")
}

class TestClass(val lable: String, val testChild: TestChild?)
class TestChild(val lable: String)


fun safeCast() {
    var str: String = "12"
    var i: Int? = str as? Int
    println(i?:"can't cast String to Int")
}

//!! - expect Exception NPE
fun theOperator() {
    var b: String? = null
//    println(b!!.length)
}

