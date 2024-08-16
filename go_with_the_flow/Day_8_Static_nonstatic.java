package go_with_the_flow;

public class Day_8_Static_nonstatic {
	
	static void add()
	{
		System.out.println("adding");
	}
	
    void sub()
	{
		System.out.println("subtraction");
	}
	static void mul()
	{
		System.out.println("multiplication");
	}
     void divide()
	{
		System.out.println("divide");
	}
	
public static void main(String[] args) {
	add();
	mul();
	Day_8_Static_nonstatic d1=new Day_8_Static_nonstatic();
	d1.sub();
	d1.divide();
}
}
