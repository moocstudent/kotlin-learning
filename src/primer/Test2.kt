package primer

import primer.B.format

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 11:35
 */
fun main(args: Array<String>) {
    A.a.putNumber(123)

    function("")
}

fun function(str: String) {
    val fmt1 = format(str)
//    val fmt2: String = format(str) //exception
    val fmt3: String? = format(str)
    println(fmt3?.length)
}