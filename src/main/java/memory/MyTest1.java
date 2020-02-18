package memory;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-18
 */

import java.util.ArrayList;

/**
 *  虚拟机栈：栈帧（Stack Frame）每个方法独有一个栈帧 里面存储着操作数栈 局部变量表（基本变量 引用变量（（通过句柄指向 或直接指针指向）（对象实例，元数据））） 返回地址
 *  程序计数器（pc）下一步在哪 方法跳转 线程私有
 *  本地方法栈 native 主要用于处理本地方法
 *  堆：分代收集算法 新生代（Edan区 幸存代）老年代
 *
 *
 *  对象在内存的布局
 *  1.对象头
 *  2.实例数据
 *  3.对齐填充
 *
 *  引用访问对象的方式
 *  1.通过句柄池
 *  2.使用直接指针
 *  生成转储文件
 *  -XX:+HeapDumpOnOutOfMemoryError
 *
 * */
public class MyTest1 {
    public void aa(){
        aa();
    }

    public static void main(String[] args) {
        //new MyTest1().aa();
        ArrayList list = new ArrayList();

        for(; ;) {

            list.add(new MyTest1());
            System.gc();

        }

    }


}
