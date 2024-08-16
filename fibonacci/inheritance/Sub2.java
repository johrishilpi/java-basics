package fibonacci.inheritance;

public class Sub2 extends Super_Fibonacci
{
	static void subtract()
	   {
		int a=90;
		int b=35;
		int sub=a-b;
		System.out.println(sub);
				
				
	   }
	public static void main(String[] args)
	{
		System.out.println("This is the second sub class");
		subtract();
		fib();

	}

}
