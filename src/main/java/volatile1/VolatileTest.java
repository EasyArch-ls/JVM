package volatile1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author: lisheng
 * @Date: 2023/7/25 4:10 PM
 * @Description:
 */
public class VolatileTest {
    private  int a = 0;
    private volatile int b = 0;

    public  void process() {
        a = 5;
        b = 1;
    }
    public  int afterProcess() {
        int c = b;
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b = 2;
        return a;
    }


    public static void main(String[] args) throws InterruptedException {
        VolatileTest test = new VolatileTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.process();
            }
        }).start();
        Thread s =   new Thread(new Runnable() {
            @Override
            public void run() {
                test.afterProcess();
            }
        } ) ;
        s.start();
        System.out.println(test.a);
        System.out.println(test.b);
        s.join();
        System.out.println(test.b);

    }


}
