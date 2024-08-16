package go_with_the_flow;

public class June14_Global_variable  {


		final static double pi=3.14;//global
		
		static void sister()
{
			int radius=10;
			double area=pi*radius*radius;
			System.out.println(area);
}
		
	public static void main(String[] args) 
	{
		int r=7;//local
		double area=pi*r*r;
		System.out.println(area);
		sister();
		
		
	}
	
	//pi*r*r
}


