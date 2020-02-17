package one;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-17
 */
/**
 * 第一次new对象会主动使用类 类被初始化
 * 数组实例 类型是由JVM在运行期动态生成的 表示为class [Lone.MyTeacher4; 父类是object
 * 助记符：anewarray 表示创建一个引用类型的（如类，接口，数组）数组，并将其引用压入栈顶
 *        newarray 表示创建原始数组（int，float。。。。）数组，并将其引用压入栈顶
 * */
public class MyTest4 {
    public static void main(String[] args) {
        MyTeacher4 myTeacher4=new MyTeacher4();
        System.out.println(myTeacher4.getClass());
        MyTeacher4[] myTeacher4s=new MyTeacher4[1];
        /*System.out.println(myTeacher4s.getClass());
        MyTeacher4[][] myTeacher4ss=new MyTeacher4[1][1];
        System.out.println(myTeacher4ss.getClass().getSuperclass());
        int [] ints=new int[1];*/
    }
}
class MyTeacher4{
    static {
        System.out.println("aaaa");
    }
}