package one;

import java.util.UUID;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-17
 */
/**
 * 常量的值在编译阶段不确定 不会存入到调用这个方法的所在类的常量池中
 * 调用时回主动使用这个类  所以类会被初始化
 * */
public class MyTest3 {

    public static void main(String[] args) {
        System.out.println(MyTeacher3.s);
    }
}
class MyTeacher3{
    public static final String s= UUID.randomUUID().toString();
    static {
        System.out.println("aaaaa");
    }
}
