package go_with_the_flow;

public class Day_8_Parametrized_Static {

	
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void sub(double a,int b)
	{
		System.out.println(a-b);
	}
	static void mul(double a,int b)
	{
		double mul=a*b;
		System.out.println(mul);
	}
	static void add(int a,int b,String name)
	{
		System.out.println("Hello");
	}
	
	
public static void main(String[] args) {
	
	add(1990, 10);
	sub(9.9,75643);
	mul(765.78,875);
	add(90, 98, "DM");
	
}	
	
	
}
