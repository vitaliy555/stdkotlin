package my.module

internal  fun MutableList<Int>.swap(i1: Int, i2: Int) {
    var firstVal = this.get(i1)
    var secondVal = this.get(i2)
    this.set(i2, firstVal)
    this.set(i1, secondVal)
}
