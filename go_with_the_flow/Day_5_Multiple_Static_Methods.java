package go_with_the_flow;

public class Day_5_Multiple_Static_Methods {

	static void add()
	{
		System.out.println("addition");
	}
	static void sub()
	{System.out.println("subtraction");
		
	}
	static void mul()
	{
		System.out.println("multiplication");
	}
	
	
	public static void main(String[] args) {
		add();//calling static method add by its name
		sub();//calling static method sub by its name
		mul();//calling static method mul by its name
	
		System.out.println("Main method");
		add();//calling static method add by its name
		sub();//calling static method sub by its name
		mul();//calling static method mul by its name
	}

}
