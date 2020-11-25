package stat

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 11:55
 */

fun main(args: Array<String>) {
    StaticTest.sayMsg2("kotlin调用非静态方法也可以通过类名直接调")
    StaticTest.sayMessage("Kotlin加了静态注解@JvmStatic的方法")
}