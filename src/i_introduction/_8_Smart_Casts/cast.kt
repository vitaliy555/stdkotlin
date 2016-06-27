package i_introduction._8_Smart_Casts

fun main(args: Array<String>) {
var x =1
    smartCast(x)
    unSafeCast(1)
    unSafeCast(null)
    safeCast(null)
    safeCast(1)
}

fun smartCast(x:Any){
    if(x !is String || x.length==0)    println("x is String ---> $x.length")
}

fun unSafeCast(y:Any?){
    val x: String? = y as String?
    println(x)
}

fun safeCast(y:Any?){
    val x: String? = y as? String
    println(x)
}
