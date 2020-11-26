package sealed

/**
 * @Author: zhangQi
 * @Date: 2020-11-26 10:22
 */
sealed class TankSuperCommand {
    object UP : TankSuperCommand()
    object DOWN : TankSuperCommand()
    object LEFT : TankSuperCommand()
    object RIGHT : TankSuperCommand()
    class PACE : TankSuperCommand()
}

fun execTank(tank:Tank,tankSuperCommand: TankSuperCommand)
    = when(tankSuperCommand){
    TankSuperCommand.UP -> {tank.move("上")}
    TankSuperCommand.DOWN -> {tank.move("下")}
    TankSuperCommand.LEFT -> {tank.move("左")}
    TankSuperCommand.RIGHT -> {tank.move("右")}
    is TankSuperCommand.PACE -> { tank.move(1) }
    else -> { println("else") }
}

class Tank{
    fun move(direction:String){
        print("坦克向${direction}移动")
    }

    fun move(step:Int){
        println("${step}步")
    }
}

fun main(args: Array<String>) {
    execTank(Tank(),TankSuperCommand.DOWN)
    execTank(Tank(),TankSuperCommand.PACE())
}