package assignments;
class Grandfather
{
	static void sush()
	{
		System.out.println("Raghunath Sharan Johri");
	}
	static void sum()
	{
		int a =10;
		int b=40;
		int sum=a+b;
		System.out.println(sum);
	}
}
class Father extends Grandfather
{
	static void van()
	{
		System.out.println("Vineet Johri");	
	}
}
public class Shilpi_Inheritance extends Father
{public static void main(String[] args) 
{
	   sush();
		van();
System.out.println("Shilpi Johri");
       sum();

}
}
