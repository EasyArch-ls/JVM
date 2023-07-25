package volatile1;

/**
 * @Author: lisheng
 * @Date: 2023/7/25 5:36 PM
 * @Description:
 */
public class ThreadA extends Thread {
    private VolatileTest task;

    public ThreadA(VolatileTest task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.process();
    }
}
