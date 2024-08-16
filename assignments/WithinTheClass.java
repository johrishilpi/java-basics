package assignments;

public class WithinTheClass 
{
	public static void add()
	{
		System.out.println("Within the class we can call:");
		System.out.println("public");
	}
	
	protected static void subtract()
	{
		System.out.println("protected");
	}
	 static void mul()
	{
		 System.out.println("default/package");
	}
	private static void div()
	{
		System.out.println("private");
	}
	public static void main(String[] args) 
	{
		add();
		subtract();
		mul();
		div();
		
	}

}
