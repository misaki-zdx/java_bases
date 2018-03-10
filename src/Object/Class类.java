package Object;
import  static java.lang.System.out;

public class Class类 {
    private String name="睡睡谁";
    private int age;
    static {

    }
    {
        System.out.println(age+name);
    }
    /*
   静态代码块和非静态代码块都是在类加载的时候就进行了加载
   不同的是静态代码和静态代码块都只进行一次加载  二次无需加载
   而非静态代码块则需要每次实例  每次加载
    还有一点 在继承一个类的时候 会在非静态代码块执行完后执行父类的构造方法

    上例也说明了在类加载的时候会按照代码顺序加载实例变量
     */
    public static void main(String[] args) {
        Class类 c=new Class类();
        out.print("静态导入，不必加上类名前缀");
    }
}
