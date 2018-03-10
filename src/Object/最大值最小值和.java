package Object;

import java.util.Scanner;

public class 最大值最小值和 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] array = new int[x];
       //int [] array={-5,8,1,2,4};
        int Max = 0, Min = 0, Sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (i == 0) {
                Max = array[i];
                Min = array[i];
                Sum+=array[i];
                continue;
            }
            if (array[i] > Max)
                Max = array[i];
            if (array[i] < Min) {
                Min = array[i];
            }
            Sum+=array[i];
        }
        System.out.println(Max+"\n"+Min+"\n"+Sum+"\n");
    }
}
