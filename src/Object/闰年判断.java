package Object;

import java.util.Scanner;

/**
 * 给定一个年份，判断这一年是不是闰年。
 * <p>
 * 当以下情况之一满足时，这一年是闰年：
 * <p>
 * 1. 年份是4的倍数而不是100的倍数；
 * <p>
 * 2. 年份是400的倍数。
 * <p>
 * 其他的年份都不是闰年。
 */
public class 闰年判断 {
    static final String YES = "yes", NO = "no";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(YES);
        } else if (year % 400 == 0) {
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }
}
