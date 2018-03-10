package Object;

import java.time.LocalDate;

public class FinalStringBuilderTest {
    private  StringBuilder strb;
    public void getStrb(){
        strb=new StringBuilder();
        strb.append(LocalDate.now());
    }
    public static void main(String[] args) {
        //由下列实验得知final关键字只是表示储存在strb变量中的对象不会再指示其它的StringBuilder对象。不过这个对象是可以更改的；
       //方法参数的传递有两种方式 引用值调用和参数值调用
        //一个方法不能修改基本类型数据的参数  但一个方法可以修改对象参数的状态
        //一个方法不能让对象参数引用一个新的对象
        FinalStringBuilderTest f= new FinalStringBuilderTest();
       f.getStrb();
       f.strb.append(1111);
       f.strb.append(333);
       String b="dddd";

        System.out.println(f.strb);
    }

}
