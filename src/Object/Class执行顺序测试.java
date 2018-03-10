package Object;

/**
 *
 * 1.调用基类构造器步骤循环递归 直至到最底层导出类（代码块和实例成员优先级处于同一级别  除了静态代码块处于最高级）
 * 2.按声明顺序调用成员初始化方法
 * 3.调用导出类构造器主体
 *
 */

public class Class执行顺序测试 {
    A a = new A();
    public static void main(String[] args) {
       // Class执行顺序测试 a = new Class执行顺序测试();
        B b=new Bzi();
    }

}

class A {
    public A() {
        System.out.println("A类构造方法");
    }

    static {
        System.out.println("A类静态代码块");
    }

    {
        System.out.println("A类代码块");
    }

    public void A() {
        System.out.println("A类");
    }
}
class B{

    public B(){
        System.out.println("B类构造方法");
    }
    static {
        System.out.println("B静态代码块");
    }
    {
        System.out.println("B代码块");
    }
    A a = new A();
    public static void staticb(){
        System.out.println("B类静态方法");
    }
    public void b(){
        System.out.println("B类普通方法");
    }
}
class Bzi extends B{
    public Bzi(){
        System.out.println("Bzi类构造方法");
    }
    static {
        System.out.println("Bzi静态代码块");
    }
    {
        System.out.println("Bzi代码块");
    }
    public static void staticb(){
        System.out.println("Bzi类静态方法");
    }
    public void b(){
        System.out.println("Bzi类普通方法");
    }
}
class LuRen{
    public LuRen(){
        System.out.println("路人构造方法");
    }
    static{
        System.out.println("路人静态代码块");
    }
    {
        System.out.println("路人代码块");
    }
}