package stat;

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 11:52
 */
public class TestStatic {

    public static void main(String[] args) {
        StaticTest.sayMessage("你好");
        StaticTest.INSTANCE.sayMsg2("没有静态注解只有INSTANCE实例化后再调用非静态方法");
    }
}
