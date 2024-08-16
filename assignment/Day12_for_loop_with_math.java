package shilpi.assignment;

public class Day12_for_loop_with_math {

	public static void main(String[] args) {
	
		for(int i=1;i<11;i++)
		{
			double r=Math.random();
			double area=Math.PI*r*r;
			System.out.print("The area of the circle with radius ");
			System.out.print(r);
			System.out.print(" is ");
			System.out.println(area);
					
		}

	}

}
