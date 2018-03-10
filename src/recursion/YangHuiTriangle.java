package recursion;

/**
 * 递归
 * 考虑采用递归的方法解决问题时 必须要知晓其有一定规律
 * 任何递归都可以通过数学表达式 表示出来 有一或更多的出口  规律通过循环调用自身来实现
 * 但在练习的时候可以使用递归 因为这样代码会很简洁 但在工作的时候不要这样写 因为递归很容易造成栈溢出
 * 但递归真的强
 */
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
