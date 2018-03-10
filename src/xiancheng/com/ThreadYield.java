package xiancheng.com;

public class ThreadYield extends Thread {
    public ThreadYield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<=50;i++){
            System.out.println(this.getName()+i);
            if(i==30)
                this.yield();
        }
    }

    public static void main(String[] args) {
        ThreadYield t1=new ThreadYield("张三");
        ThreadYield t2=new ThreadYield("李四");
        t1.start();
        t2.start();
    }
}
