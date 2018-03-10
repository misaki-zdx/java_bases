package xiancheng.com;

/**
 * join方法直到此线程执行结束 其它线程处于阻塞状态 优先权让给当前线程
 */
public class Thread2 implements Runnable {
    private String name;

    public Thread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "线程开始");
        Thread t1 = new Thread(new Thread2("C"));
        Thread t2 = new Thread(new Thread2("D"));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "线程结束");
    }
}
