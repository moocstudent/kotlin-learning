package clazz

import kotlin.reflect.KClass

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 11:24
 */

fun main(args: Array<String>) {
    println()
    testClass(JavaMain::class.java)
    testClass(KotlinMain::class)
}

fun testClass(clazz:Class<JavaMain>){
    println(clazz.simpleName)
}

fun testClass(clazz: KClass<KotlinMain>){
    println(clazz.simpleName)
}