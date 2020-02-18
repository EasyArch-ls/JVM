package one;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-18
 */
/**
 * 调用classloader的loadClass并不会对类主动使用 不会进行初始化
 * */
public class MyTest9 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader=ClassLoader.getSystemClassLoader();
        Class<?> class1=loader.loadClass("one.My9");
        System.out.println(class1);
        System.out.println("-----------");
        Class<?> class2=Class.forName("one.My9");
        System.out.println(class2);
    }
}
class My9{
    static {
        System.out.println("c9");
    }
}