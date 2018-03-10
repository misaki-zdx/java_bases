package Object;

public class 零一字符串 {
    public static void main(String[] args) {
       /* int n1=0,n2=0,n3=0,n4=0,n5=0;
        for(int i=0;i<32;i++){
            if (i%2==0)n1=0;
            else n1=1;
            if (i/2%2==0)n2=0;
            else n2=1;
            if (i/4%2==0)n3=0;
            else n3=1;
            if (i/8%2==0)n4=0;
            else n4=1;
            if (i/16%2==0)n5=0;
            else n5=1;
            System.out.println(n5+""+n4+""+n3+""+n2+""+n1);
        }*/
        f();

    }

    public static void f() {
        String[] str = new String[5];
        for (int i = 0; i < 32; i++) {
            int temp = i;
            for (int ii = 4; ii >= 0; ii--) {
                str[ii] = temp % 2 + "";
                temp = temp / 2;
            }
            for (String x : str) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
