package eenum

/**
 * @Author: zhangQi
 * @Date: 2020-11-26 9:51
 */
enum class Command {
    A,B,C,D
}

fun exe(command:Command) = when(command){
    Command.A -> { println("command A") }
    Command.B -> { println("command B") }
    Command.C -> { println("command C") }
    Command.D -> { println("command D") }
    else -> { println("else") }
}

fun main(args: Array<String>) {
    exe(Command.B)
}