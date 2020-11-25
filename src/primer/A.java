package primer;

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 11:34
 */
public class A implements AInterface{

    public static final A a = new A();

    @Override
    public void putNumber(int num) {
        System.out.println("int");
    }

    @Override
    public void putNumber(Integer num) {
        System.out.println("Integer");
    }
}
