/**
 * @Author: zhangQi
 * @Date: 2020-11-25 11:02
 */

fun function(){
    val str = "hello!"
    fun say(count:Int = 10){
        println(str)
        if(count>0){
            say(count-1)
        }
    }
    say()
}

fun print(name:String = "Life"):String?{
    println("$name")
    return name
}

fun main(args: Array<String>) {
    print()
}