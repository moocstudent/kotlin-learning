package lambda

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 15:18
 */

/**
 * 高阶函数
 * inline通常在高阶函数使用,滥用增加编译器负担
 * 这样当方法在编译时就会拆解方法的调用为语句调用,进而减少创建不必要的对象
 */
inline fun onlyif(isDebug:Boolean,block:()->Unit){
    if(isDebug) block()
}

fun main(args: Array<String>) {
    //函数参数是最后一个参数时,可以写在()小括号之外
    onlyif(true){
        println("打印日志")
    }

    onlyif(true,{println("打印结果")})


    //函数在kotlin是"一等公民"
    val runnable = Runnable{
        println("Runnable::run")
    }

    val function:()-> Unit

    function = runnable::run

    onlyif(true,function)

}

