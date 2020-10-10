package memory;

/***
 * @Author: lisheng
 * @Date: 2020/10/10
 * @Time: 上午11:37
 * @Description:
 * JDK 1.7后，intern方法还是会先去查询常量池中是否有已经存在，
 * 如果存在，则返回常量池中的引用，这一点与之前没有区别，
 * 区别在于，如果在常量池找不到对应的字符串，则不会再将字符串拷贝到常量池，
 * 而只是在常量池中生成一个对原字符串的引用。
 * 简单的说，就是往常量池放的东西变了：原来在常量池中找不到时，复制一个副本放到常量池，
 * 1.7后则是将在堆上的地址引用复制到常量池。
 * 所以第一个s与s1所指向的都是堆中的地址
 *
 ***/
public class StringTest {
    public static void main(String[] args) {
        String s=new String("ab")+new String("c");
        s.intern();
        String s1="abc";
        System.out.println(s==s1);

        /*String s=new String("ab")+new String("c");
        String s1="abc";
        s.intern();
        System.out.println(s==s1);*/
    }
}
