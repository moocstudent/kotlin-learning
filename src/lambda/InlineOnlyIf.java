package lambda;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/**
 * @Author: zhangQi
 * @Date: 2020-11-26 9:31
 * inline修饰后的方法会展示为以下代码
 */
public class InlineOnlyIf {

    public static final void onlyif(boolean isDebug, Function0<Unit> block){
        if(isDebug){
            block.invoke();
        }
    }

    public static final void main(String[] args){
        boolean isDebug = true;
        if(isDebug){
            String str = "打印日志";
            System.out.println(str);
        }
    }
}
