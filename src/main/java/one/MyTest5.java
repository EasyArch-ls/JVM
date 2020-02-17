package one;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-17
 */

import java.util.Random;

/**
 *  当一个接口初始化的时候 不要求父接口完成了初始化 接口本身的值都是final 不会加载MyTeacher5，MyStudent5接口
 *  只有真在使用到父接口的时候（运行期才能确定值） 才会初始化
 *  实践时可删除class文件查看
 * */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyStudent5.b);
       // System.out.println(MyStudent5.b1);
    }
}
/*interface MyTeacher5{
    int a=5;
    int a1=new Random().nextInt(5);
    public static Thread t=new Thread(){
        {
            System.out.println("xx");
        }
    };

}*/

interface MyTeacher5{
    int a=5;
    int a1=new Random().nextInt(5);
    public static Thread t=new Thread(){
        {
            System.out.println("xx");
        }
    };

}

/*interface MyStudent5 extends MyTeacher5 {
    int b = 6;
    int b1 = new Random().nextInt(5);
}*/
/*class MyStudent5 extends MyTeacher5{
    static int b=6;
    int b1=new Random().nextInt(5);
}*/

class MyStudent5 implements MyTeacher5{
    static int b=6;
    int b1=new Random().nextInt(5);
}
