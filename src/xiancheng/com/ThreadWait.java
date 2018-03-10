package xiancheng.com;

public class ThreadWait implements Runnable {
    private String name;
    private Object prev;
    private Object self;

    private ThreadWait(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;

                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadWait pa = new ThreadWait("A", c, a);
        ThreadWait pb = new ThreadWait("B", a, b);
        ThreadWait pc = new ThreadWait("C", b, c);


        new Thread(pa).start();
        //Thread.sleep(100);  //确保按顺序A、B、C执行
        new Thread(pb).start();
        //Thread.sleep(100);
        new Thread(pc).start();
        //Thread.sleep(100);
    }
}


