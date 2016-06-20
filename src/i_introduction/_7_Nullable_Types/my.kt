package i_introduction._7_Nullable_Types

/**
 * Created by vitaliy on 6/20/16.
 */

fun main(args: Array<String>) {
    var list : List<String?>  =listOf("String",null)
    list.forEach { item->item?.let { print("$item  --- is not null") } }
}
