package volatile1;

/**
 * @Author: lisheng
 * @Date: 2023/7/25 5:36 PM
 * @Description:
 */
public class ThreadB extends Thread {
    private VolatileTest task;

    public ThreadB(VolatileTest task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(task.afterProcess());
    }
}

