package instantiation.one;

/***
 * @Author: lisheng
 * @Date: 2020/8/5
 * @Time: 上午11:48
 * @Description:
 ***/
public class Person {
    public static String name="静态爹";
    public String name1="普通爹";
    static {
        System.out.println(name);
 //       System.out.println(name1);
        System.out.println("你爹的静态代码块");
    }
    {
        System.out.println(name1);
        System.out.println("你爹的普通代码块");
    }
    public Person(){
        System.out.println("你爹的构造函数");
    }
}
