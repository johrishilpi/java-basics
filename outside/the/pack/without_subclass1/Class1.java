package outside.the.pack.without_subclass1;

public class Class1 {
	public static void add()
	{System.out.println("Outside the package without becoming subclass we can access only:");
	System.out.println("PUBLIC");
		
	}
	private static void sub()
	{
		System.out.println("private cannot be accessed");
	}
	protected static void mul()
	{
		System.out.println("protected cannot be accessed");
	}
	 static void div()
	{
		 System.out.println("default/package cannot be accessed");
	}

}
