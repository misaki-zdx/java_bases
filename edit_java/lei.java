public class lei

{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	/**
	i think 
	out put{
		

			}
	*/
}
class Fu
{
	new LuRen();
	static {
	System.out.println("这是一个Fu静态代码块");
	}
	{
		System.out.println("这是Fu普通代码块");
	}
	public Fu(){
		System.out.println("Fu构造方法");
	}
}
class Zi
{
	new LuRen();
	static {
	System.out.println("这是一个zi静态代码块");
	}
	{
		System.out.println("这是zi普通代码块");
	}
	public Zi(){
		System.out.println("zi构造方法");
	}
}
class LuRen
{
	static{System.out.println("这是一个LuRen静态代码块"); }
	public LuRen(){
	System.out.println("LuRen构造方法");
	}
}