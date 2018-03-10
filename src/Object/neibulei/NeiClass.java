package Object.neibulei;

/**
 * 内部类能直接访问外部内的非私有属性  而外部类访问内部内需要创建内部类对象的方式访问成员属性
 */
public class NeiClass {
    int i = 5;

    class Demo {
        int in = 4;

        public void demoFangfa() {
            System.out.println("内部类方法" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("外部内部类" + new NeiClass().new Demo().in);
    }
}
