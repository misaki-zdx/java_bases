package recursion;

public class YangHuiTriangle {
    public static int  f(int x, int y) {
        if(y==0)
            return 1;
        if(x==y)
            return 1;
        return f(x-1,y)+f(x-1,y-1);
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.printf(f(i,j)+"\t");
            }
            System.out.println();
        }
    }
}
