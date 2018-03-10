public class HuiWenShu
{
	public static void main(String[] args) 
	{
	int zero,ten,hundred,thousand;
		for (int x =1000;x<10000;x++)
		{
			 zero = x%10;
			 ten = x/10%10;
			 hundred= x/100%10;
			 thousand=x/1000%10;
			if(zero==thousand&&ten==hundred){
				System.out.println(x);
		}
	}
}
}