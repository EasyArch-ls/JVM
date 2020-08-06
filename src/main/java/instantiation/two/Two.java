package instantiation.two;

import instantiation.one.Stu;

/***
 * @Author: lisheng
 * @Date: 2020/8/5
 * @Time: 下午2:03
 * @Description:
 ***/
public class Two {
    public static void main(String[] args) {
        try {
        Class c=Class.forName("instantiation.one.Stu");
        Stu stu=(Stu) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
