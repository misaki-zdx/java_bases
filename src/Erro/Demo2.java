package Erro;

public class Demo2 {
    public static void main(String[] args) {
        div(2, 0);
        System.out.println("over");
    }

    public static void div(int x, int y) {

        try {
            System.out.println(x / y); // 可能出现异常的语句，放入try中。
        } catch (ArithmeticException e) { // 进行异常匹配，
            //异常信息
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("除数不能为0");
        }
        System.out.println("除法运算");
    }

}
