package one;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-17
 * -XX:+TraceClassLoading 用来追踪类加载
 * -XX:+<option> 打开
 * -XX:<option>=<value> 赋值
 */
/**
 * 引用了MyTeacher的静态变量 MyTeacher会被初始化 MyStudent 被加载
 * 子类被初始化（主动使用） 父类也会被初始化
 * */

public class MyTest1  {
    public static void main(String[] args) {

        System.out.println(MyStudent.x);
    }
}
class MyTeacher{
   public static int r=1;
    static {
        System.out.println("aaaaa");
    }
}
class MyStudent extends MyTeacher{
    public static int x=1;
    static {
        System.out.println("bbbbb");
    }
}