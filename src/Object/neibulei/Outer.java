package Object.neibulei;

/**
 * 内部类定义在类中的局部位置（包含在外部类中的函数中）
 * 内部类定义局部位置上 只能访问到局部中的被final修饰的常量
 * 可以在包含局部内部类的方法中直接创建局部内部类的对象调用局部内部类的成员。
 */
public class Outer {
    int num = 4;

    class Myin {

    }

    public void method(final int y) {
        final int x = 3;
        class Inner {
            void show() {
                System.out.println("show run" + num);
                System.out.println("x=" + x);
                System.out.println("y=" + y);
            }
        }
        new Inner().show();
    }
}

class InnerDemo {
    public static void main(String[] args) {
        new Outer().method(32);
    }
}
