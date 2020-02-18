package one;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-18
 */
public class Mytest10 {
    public static void main(String[] args) {
        ClassLoader loader=ClassLoader.getSystemClassLoader();
        System.out.println(loader);
        while (loader!=null){
            loader=loader.getParent();
            System.out.println(loader);
        }
    }
}
