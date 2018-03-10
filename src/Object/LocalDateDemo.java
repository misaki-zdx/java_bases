package Object;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateDemo {
    /*
    包含main方法的类只允许拥有一个public类
     */
    //将程序中包含 main方法的类名提供给字节码解释器， 以便启动这个程序：
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        //当前日期减一  minusdays 减去多少天
        date = date.minusDays(today - 1);// Set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        //得到当前是日期是星期几
        int value = weekday.getValue();//1 - Monday, ... 7 = Sunday
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
    }
}
