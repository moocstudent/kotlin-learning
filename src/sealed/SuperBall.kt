package sealed

/**
 * @Author: zhangQi
 * @Date: 2020-11-26 10:06
 */

sealed class SuperBall {
    object FootBall: SuperBall()
    object BaseketBall: SuperBall()
    class PingPong(var id:Int) :SuperBall()
}

fun execBall(ball: SuperBall)=when(ball){
    SuperBall.FootBall->{ println("football") }
    SuperBall.BaseketBall->{ println("basketball") }
    is SuperBall.PingPong -> { println("ping pong") }
    SuperBall.PingPong(id = 1) -> { println("ping pong1") }
    else -> { println("else") }
}

fun main(args: Array<String>) {
    execBall(SuperBall.FootBall)
    execBall(SuperBall.BaseketBall)
//    execBall(PingPong())
    execBall(SuperBall.PingPong(1))
}