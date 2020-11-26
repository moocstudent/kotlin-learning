package extension

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 13:53
 */

fun main(args: Array<String>) {
    //Dog类继承了Animal,所以可以调用printName方法
    //扩展函数是静态时候添加,所以输出的是animal
    Dog().printName(Dog())
}

fun Animal.name() = "animal"
fun Dog.name() = "dog"

fun Animal.printName(anim:Animal){
    println(anim.name())
}
