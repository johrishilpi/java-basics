package assignments;

public class A26_this 
{ 
A26_this(double b)
{
	System.out.println("4");
}
A26_this(int a,double b)
{    this(9.8);
	System.out.println("3");
}
A26_this(int a)
{   this(100,1.78);
	System.out.println("2");
}
A26_this()
{
	this(100);
System.out.println("1");
}
	public static void main(String[] args) {
	
		new A26_this();

	}

}
