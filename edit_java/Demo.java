class Demo
{
	private static void doway(jihe j){
		j.draw();
		j.mianji();
	}
	public static void main(String[] args) 
	{
		jihe j=new yuan();
		do(j);
	}
}
class jihe
{
	public void draw(){
		System.out.print("父类 draw");
	};
	public void mianji(){
		System.out.print("父类 mianji");
	};
}
class yuan extends jihe
{
	public void draw(){
		System.out.println("yuan draw");
	};
	public void mianji(){
		System.out.println("yuan mianji");
	};
}
