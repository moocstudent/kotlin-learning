package dynamic_proxy

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 16:08
 * Animail接口有个方法bark
 * class Dog实现了Animal接口实现重写bark接口输出
 * Zoo通过将传入的animal参数作为参数作为对象执行
 * Dog类对像传入Zoo()对象执行bark方法,会调用Dog的bark
 */

interface Animal{
    fun bark()
}

class Dog:Animal{
    override fun bark() {
        println("Wang")
    }
}

class Zoo(animal:Animal) : Animal by animal{
    override fun bark() {
        println("zoo")
    }
}

fun main(args: Array<String>) {
    Zoo(Dog()).bark()
}