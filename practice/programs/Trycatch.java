package practice.programs;

public class Trycatch {

	public static void main(String[] args) {
	int a=78;
	int b=0;
	try
	{int c= a/b;
	System.out.println(c);
		
	}
	catch (ArithmeticException d)
	{
		System.out.println("Thank you");
	}
finally
{
	System.out.println("Thanks for visiting us");
}
	}

}
