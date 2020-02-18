package one;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-18
 */
public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 启动类加载器
         * */
        Class c=Class.forName("java.lang.String");
        System.out.println(c.getClassLoader());
        /**
         * 应用类加载器
         * */
        Class c1=Class.forName("one.c");
        System.out.println(c1.getClassLoader());
    }
}
class c{

}