package shilpi.assignment;

public class Day11_FinalVariable {

	final static double pi=3.14;
	static double r=5;
	
	static void circumference()
	{
	
		double circumference=2*pi*r;
		System.out.print("The Circumference of the circle is ");
		System.out.println(circumference);
	}
	static void area()
	{
	
		double area=pi*r*r;
		System.out.print("The area of the circle is ");
		System.out.println(area);
		
	}
	
	public static void main(String[] args) {
	
	circumference();
	area();
				
		

	}

}
