package my

/**
 * Created by vitaliy on 6/5/2016.
 */
fun main(args: Array<String>) {
    var a=A("aaa")
    var c=  C("1","2")
    c.field1
}


class A{
    constructor(fieldA:String)
    constructor(fieldAA:String,fieldAAA:String):this(fieldA = fieldAA)
}

class B constructor(fieldB:String){
    constructor(fieldBB: String,ff:String) :this(fieldB = fieldBB)
}

class C(val field1:String,field2:String)