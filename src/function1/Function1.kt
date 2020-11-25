package function1

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 12:31
 */

fun echo(name:String){
    println("$name")
}

fun echo2(name:String = "ZhangQi"){
    println("$name")
}

fun echo3(name:String) = println("$name")

fun main(args: Array<String>) {
    echo("We go to San Ya")
    echo2()
    echo3("Here we go")

}