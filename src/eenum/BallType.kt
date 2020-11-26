package eenum

/**
 * @Author: zhangQi
 * @Date: 2020-11-26 9:54
 */
enum class BallType(val type:String) {
    basketball("篮球"),
    football("足球"),
    baseball("棒球"),
    tennis("网球")
}

fun exeBall(type:String) = when(type){
    BallType.basketball.type -> { println("篮球用手") }
    BallType.football.type -> { println("足球用脚") }
    BallType.baseball.type -> { println("棒球用棍") }
    BallType.tennis.type -> { println("网球用拍") }
    else -> { println("else") }
}

fun main(args: Array<String>) {
    exeBall("篮球")
    exeBall("网球")
    exeBall("大力神杯")
}