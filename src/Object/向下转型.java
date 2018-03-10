package Object;

/**
 * 正确的对应对象转型成功    向下转型  系统自动判断
 */
public class 向下转型 {
    public static void main(String[] args) {
        Useful [] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        ((MoreUseful)x[1]).u();
    }

}
class  Useful{
    public void f(){};
    public void g(){};
}
class MoreUseful extends Useful{
    public void f(){};
    public void g(){};
    public void u(){};
    public void v(){};
}