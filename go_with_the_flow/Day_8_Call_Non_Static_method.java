package go_with_the_flow;

public class Day_8_Call_Non_Static_method {

	void add()
	{
		System.out.println("addition");
	}
	void sub()
	{
		System.out.println("subtraction");
	}
	
	void mul()
	{
		System.out.println("multiplication");
	}
	void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) {
	
		Day_8_Call_Non_Static_method L1= new Day_8_Call_Non_Static_method();
		L1.add();
		L1.sub();
		L1.mul();
		L1.div();
		
		
		
}
}
