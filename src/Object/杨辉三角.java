package Object;

import java.util.Scanner;

public class 杨辉三角 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int num[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                num[i][0] = num[i][i] = 1;
                for (int j = 1; j < i; j++) {
                    num[i][j] = num[i - 1][j] + num[i - 1][j - 1];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
