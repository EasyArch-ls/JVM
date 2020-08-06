package instantiation.two;

import instantiation.one.Stu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/***
 * @Author: lisheng
 * @Date: 2020/8/5
 * @Time: 下午2:06
 * @Description:
 ***/
public class Three {
    public static void main(String[] args) {
        Constructor<Stu> constructor;
        try {
            constructor= Stu.class.getConstructor();
            try {
                Stu stu=constructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
