package instantiation.one;

import java.io.Serializable;

/***
 * @Author: lisheng
 * @Date: 2020/8/5
 * @Time: 上午11:52
 * @Description:
 ***/
public class Stu extends Person implements Serializable {
    public static String stuName="静态名字";
    public String stuName1="普通名字";
    static {
        System.out.println(stuName);
        System.out.println("静态代码块");
    }
    {
        System.out.println(stuName1);
        System.out.println("普通代码块");
    }
    public Stu(){
        System.out.println("构造函数");
    }

    public static String getStuName() {
        return stuName;
    }

    public static void setStuName(String stuName) {
        Stu.stuName = stuName;
    }

    @Override
    public Object clone(){
        return this;
    }
}
