package xiancheng.com;

public class Product implements Runnable {
    static final int MIN_PRODUCT = 1;
    static final int MAX_PRODUCT = 10;
    private int product=0;

    public synchronized void produce() {
        if (this.product >= MAX_PRODUCT) {
            try {
                wait();
                System.out.println("产品已满,请稍候再生产");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }

        this.product++;
        System.out.println("生产者生产第" + this.product + "个产品.");
        notifyAll();   //通知等待区的消费者可以取出产品了
    }

    public synchronized void consume() {
        if (this.product <= MIN_PRODUCT) {
            try {
                wait();
                System.out.println("缺货,稍候再取");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }

        System.out.println("消费者取走了第" + this.product + "个产品.");
        this.product--;
        notifyAll();   //通知等待去的生产者可以生产产品了
    }

    @Override
    public void run() {
        produce();
        consume();
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new Product());
        Thread t2=new Thread(new Product());
        t1.start();
        t2.start();
    }
}
/*

class Produce implements Runnable {
    private int product;

    public Produce(int product) {
        this.product = product;
    }

    @Override
    public synchronized void run() {
        if (this.product >= Product.MAX_PRODUCT) {
            try {
                wait();
                System.out.println("产品已满,请稍候再生产");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }

        this.product++;
        System.out.println("生产者生产第" + this.product + "个产品.");
        notifyAll();   //通知等待区的消费者可以取出产品了
    }
}

class Consume implements Runnable {
    private int product;

    public Consume(int product) {
        this.product = product;
    }

    @Override
    public synchronized void run() {
        if (this.product <= Product.MIN_PRODUCT) {
            try {
                wait();
                System.out.println("缺货,稍候再取");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }

        System.out.println("消费者取走了第" + this.product + "个产品.");
        this.product--;
        notifyAll();   //通知等待去的生产者可以生产产品了
    }

}*/
