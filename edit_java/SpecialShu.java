public class SpecialShu 
{
	public static void main(String[] args) 
	{
		int zero,ten,hundred;
		for(int i=100;i<1000;i++){
			zero = i%10;
			ten  = i/10%10;
		 hundred = i/100%10;
			if(zero*zero*zero+ten*ten*ten+hundred*hundred*hundred==i){
				System.out.println(i);
			}
		}
	}
}
