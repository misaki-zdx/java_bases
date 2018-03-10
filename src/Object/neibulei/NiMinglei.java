package Object.neibulei;

/**
 * 匿名内部类的前提:必须继承一个父类或者是实现一个接口。
 * 匿名内部类的格式：
 * new 父类或者接口(){ 执行代码….};
 */

/**
 * 接口中的变量都是public static final 方法都是public abstract
 */
interface IIner {
    public void eat();
}

abstract class Inner {
    abstract void show();
}

public class NiMinglei {
    IIner in=new IIner() {
        public void eat() {
            System.out.println("今天吃的比较好");
        }
    };
    public void print() {
        //匿名内部类调用show方法
        new Inner() {
            public void show() {
                System.out.println("内部类的show方法");
            }
        }.show();

    }
}

class Demo2 {
    public static void main(String[] args) {
        new NiMinglei().print();
        new NiMinglei().in.eat();
    }
}