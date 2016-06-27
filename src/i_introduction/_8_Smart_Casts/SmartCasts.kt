package i_introduction._8_Smart_Casts

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
        when (e) {
            is Num -> todoTask8(e)
            is Sum -> todoTask8(e)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun todoTask8(expr: Expr): Int {
    if (expr is Num) return expr.value
    if (expr is Sum) return eval(expr.left) + eval(expr.right)
    return throw IllegalArgumentException("Unknown expression");
}

//    """
//        Task 8.
//        Rewrite 'JavaCode8.eval()' in Kotlin using smart casts and 'when' expression.
//    """,
//    documentation = doc8(),
//    references = { JavaCode8().eval(expr) }

