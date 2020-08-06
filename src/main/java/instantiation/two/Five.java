package instantiation.two;

import instantiation.one.Stu;

/***
 * @Author: lisheng
 * @Date: 2020/8/6
 * @Time: 下午8:17
 * @Description:
 ***/
public class Five {
    public static void main(String[] args) {
        Stu stu=new Stu();
        Stu stu1=(Stu)stu.clone();
        System.out.println(stu==stu1);

    }
}
