package within.pack;

public class Pack1 {

	public static void add()
	{
		System.out.println("Within the package we can call:");
		System.out.println("public");
	}
	protected static void sub()
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
	
}
