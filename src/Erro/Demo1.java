package Erro;

public class Demo1 {
    public static void main(String[] args) {
        Throwable able =new Throwable("想吐===");
        System.out.println(able.toString()); //输出异常类名
        System.out.println(able.getMessage());// 输出异常的信息，需要通过构造方法传入异常信息
        able.printStackTrace();//打印栈信息
    }
}
