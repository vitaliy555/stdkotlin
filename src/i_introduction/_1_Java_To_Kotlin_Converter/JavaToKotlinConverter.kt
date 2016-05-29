package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

//fun todoTask1(collection: Collection<Int>): Nothing = TODO(
//    """
//        Task 1.
//        Rewrite JavaCode1.task1 in Kotlin.
//        In IntelliJ IDEA, you can just copy-paste the code and agree to automatically convert it to Kotlin,
//        but only for this task!
//    """,
//    references = { JavaCode1().task1(collection) })

fun todoTask1(collection: Collection<Int>): String {
    var result: String = "{"
    var iter: Iterator<Int> = collection.iterator()
    while (iter.hasNext()) {
        result = result.plus(iter.next())
        if (iter.hasNext()) {
            result = result.plus(", ")
        }
    }
    return result.plus("}")
}

fun task1(collection: Collection<Int>): String = todoTask1(collection)
