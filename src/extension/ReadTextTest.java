package extension;

import kotlin.text.Charsets;

import java.io.File;

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 13:49
 */
public class ReadTextTest {

    public static void main(String[] args) {
        File file = new File("test.txt");
        String content = ExtensionKt.readText(file, Charsets.UTF_8);
        System.out.println(content);
    }
}
