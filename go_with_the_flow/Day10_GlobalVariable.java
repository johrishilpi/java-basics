package go_with_the_flow;

public class Day10_GlobalVariable {

	static double pi= 3.14;//global-fathers wallet
	static void sister()
	{
		int radius=10;
		double area_of_circle=pi*radius*radius;
		System.out.println(area_of_circle);
	}
			
	public static void main(String[] args) {
		int r=7;//local
		double area=pi*r*r;
		System.out.println(area);
				

	}

}
