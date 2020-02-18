package one;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-18
 */
public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(My8.a);
    }
}
class My8{
    public static final int a=1;
    static {
        System.out.println("c8");
    }

}