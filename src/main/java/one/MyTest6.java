package one;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-17
 */
/**
 * 调用类的静态方法回初始化类
 * */
public class MyTest6 {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getSingleton();
        System.out.println(Singleton.a);
        System.out.println(Singleton.b);

    }
}

class Singleton{
    public static int a;
    public static int b=0;
    private static Singleton singleton=new Singleton();
    private Singleton(){
        a++;
        b++;//准备阶段（连接的第二阶段）的意思 已经为静态变量赋了初值
       // System.out.println(b);
    }
   // public static int b=0; //
    public static Singleton getSingleton(){
        return singleton;
    }
}