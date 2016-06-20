package my

import my.module.swap


fun main(args: Array<String>) {
    var mList = mutableListOf(1, 2, 3)
    mList.swap(0,2)
    print(mList)
}
