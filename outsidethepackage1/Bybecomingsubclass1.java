package outsidethepackage1;

public class Bybecomingsubclass1
{
public static void add()
{
	System.out.println("Outside the package by becoming a subclass we can access:");
	System.out.println("PUBLIC");
}
protected static void sub()
{
	System.out.println("PROTECTED");
}
 static void mul()
{
	 System.out.println("Cannot access default/package");
}
private static void div()
{
	System.out.println("Cannot access private");
}

}
