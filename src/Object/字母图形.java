package Object;

import java.util.Scanner;

public class 字母图形 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int line=in.nextInt();
        int lie=in.nextInt();

      //第一次版本
        for (int i=0;i<line;i++){
                    int count=0;
                for (int x = i; x >0; x--) {
                    if(count>=lie){
                        break;
                    }
                    count++;
                System.out.print((char) ('A' + x));
                }

            //如果要求列数小于行数 那么就会出现问题

                for (int e = 0; e < lie - i; e++) {
                    System.out.print((char) ('A' + e));
                }

            System.out.println();
        }

  /*      Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(), m = cin.nextInt();
        char c[] = new char[51];
        for (int i = 0; i < 26; i++) {
            c[i] = (char) (i + 65);
            c[50 - i] = (char) (65 + i);
        }
        for(char x:c){
            System.out.println(x);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(c[j]);
            System.out.println();
            for (int j = 49; j >= 0; j--)
                c[j + 1] = c[j];
            c[0] = c[50];
        }*/
    }
}
