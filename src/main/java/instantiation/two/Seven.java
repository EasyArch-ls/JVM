package instantiation.two;

import instantiation.one.Stu;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/***
 * @Author: lisheng
 * @Date: 2020/8/6
 * @Time: 下午8:21
 * @Description:
 ***/
public class Seven {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
      Stu s=(Stu) Seven.getUnSafe().allocateInstance(Stu.class);
      System.out.println(s);
    }
    private static Unsafe getUnSafe() throws NoSuchFieldException, IllegalAccessException {
        Field field=Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        return unsafe;
    }
}
