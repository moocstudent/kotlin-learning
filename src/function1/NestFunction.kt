package function1

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 12:41
 * 在某些条件下触发递归的函数
 * 不希望被外部函数访问到的函数
 * 通常不会使用内部嵌套函数
 */

fun function(){
    val str = "hello!"
    fun say(count:Int=10){
        println(str)
        if(count>0){
            //递归调用
            say(count-1)
        }
    }
    say()
}

fun main(args: Array<String>) {
    function()
}