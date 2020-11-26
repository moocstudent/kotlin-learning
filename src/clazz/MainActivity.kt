package clazz


/**
 * @Author: zhangQi
 * @Date: 2020-11-25 15:43
 */
open class MainActivity :  Father, FatherTest(),Mather {
    override fun get(): String {
        return "Zhang Qi"
    }

    override fun post(): String {
        return "Qi Zhang"
    }
}