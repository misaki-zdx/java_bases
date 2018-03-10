/**

基本类型 作为参数传递时 不改变原来自身的值 只是对实际参数的引用的一个copy

*/
public  class test 
{
	public static int gb(int a){
		return a=3;
	}
	public static void main(String[] args) 
	{
		int b=6;
		System.out.print(gb(b)+" "+b);
	}
}
