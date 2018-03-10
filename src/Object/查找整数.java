package Object;

import java.util.Scanner;

public class 查找整数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int y = in.nextInt();
        int count = 1;
        boolean flage = false;
        for (int temp : array) {
            if (temp == y) {
                flage = true;
                break;
            }
            count++;
        }
        if (flage) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
