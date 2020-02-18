package one;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Enumeration;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-18
 */
public class Mytest11 {
    public static void main(String[] args) throws IOException {
        ClassLoader loader=Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        String resourcename="one/Mytest11.class";
        Enumeration<URL> enumeration=loader.getResources(resourcename);
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
