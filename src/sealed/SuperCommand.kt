package sealed

/**
 * @Author: zhangQi
 * @Date: 2020-11-26 10:02
 */
sealed class SuperCommand {
    object A : SuperCommand()
    object B : SuperCommand()
    object C : SuperCommand()
    object D : SuperCommand()
}

fun exec(superCommand: SuperCommand) = when (superCommand) {
    SuperCommand.A -> {
        println("exec superA")
    }
    SuperCommand.B -> {
        println("exec superB")
    }
    SuperCommand.C -> {
        println("exec superC")
    }
    SuperCommand.D -> {
        println("exec superD")
    }
    else -> {
        println("else")
    }
}

fun main(args: Array<String>) {
    exec(SuperCommand.A)
    exec(SuperCommand.D)
}