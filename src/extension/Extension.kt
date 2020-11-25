package extension

import java.io.File
import java.nio.charset.Charset

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 13:40
 */
fun File.readText(charset:Charset = Charsets.UTF_8):
        String = readBytes().toString(charset)


fun main(args: Array<String>) {
    val file = File()
}