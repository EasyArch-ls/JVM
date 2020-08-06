package instantiation.two;

import instantiation.one.Stu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/***
 * @Author: lisheng
 * @Date: 2020/8/6
 * @Time: 下午8:20
 * @Description:
 ***/
public class Six {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
      Class o=Class.forName("instantiation.one.Stu");
      Object object= o.newInstance();
      Method method = o.getMethod("toString");
      System.out.println(method.invoke(object));

    }
}
