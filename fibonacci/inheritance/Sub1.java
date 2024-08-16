package fibonacci.inheritance;

public class Sub1 extends Super_Fibonacci
{
   static void sum()
   {
	int a=90;
	int b=35;
	int sum=a+b;
	System.out.println(sum);
			
			
   }
	public static void main(String[] args) {
		System.out.println("This is the first sub class");
		sum();
		fib();

	}

}
