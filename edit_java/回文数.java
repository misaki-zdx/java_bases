public class HuiWenShu
{
	public static void main(String[] args) 
	{
		for (int x =1000;x<10000;x++)
		{
			int zero = x%10;
			int ten = x/10%10;
			int hundred= x/100%10;
			int thousand=x/1000%10;
			if(zero==thousand&&ten==hundred){
				System.out.println(x);
		}
	}
}
}