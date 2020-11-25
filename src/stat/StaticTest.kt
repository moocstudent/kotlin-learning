package stat

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 11:50
 */

object StaticTest {
    //该注解让调用变为静态化 = java:static
    @JvmStatic
    fun sayMessage(msg:String){
        println(msg)
    }

    fun sayMsg2(msg:String){
        println("sayMsg2:$msg")
    }
}

fun main(args: Array<String>) {
    StaticTest.sayMessage("hello")
    StaticTest.sayMsg2("本文件调用")
}