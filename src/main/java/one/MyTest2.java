package one;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-17
 */
    /**
     * 常量在编译阶段 会存入到调用这个方法的所在类的常量池中
     * 本质上调用类并没有直接引用到定义常量的类 所以类不会被初始化
     * 这里是将r存入了MyTest2的常量池中，之后MyTest2与MyTeacher2没有关系了
     * 而且可以将MyTeacher2的class文件删除
     * */
    /**
     * 反编译 javap -c class文件
     * 助记符：bipush  表示将单子节-127~128 常量值推送到栈顶
     *       sipush 表示将短整形常量值 -32768～32767 推送到栈顶
     *       iconst_ 表示将int 0～5 推送到栈顶 iconst_m1 表示-1
     *       ldc 表示将 int float string类型的常量值从常量池推送到栈顶
     * */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyStudent2.x);
    }
}

class MyTeacher2{
    public static final int r=1;
//    public static final String s="11";
    static {
        System.out.println("aaaaa");
    }
}
class MyStudent2 extends MyTeacher2{
    public static final int x=32768;
    static {
        System.out.println("bbbbb");
    }
}