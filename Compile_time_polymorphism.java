package practice.programs;

public class Compile_time_polymorphism 
{   void add()
	{
	System.out.println("Compile time polymorphism 1");
	}
void add(int a)
{
	System.out.println("Compile time polymorphism 2");	
}
void add(byte b)
{
	System.out.println("Compile time polymorphism 3");
}
void add(int a, double b)
{
	System.out.println("Compile time polymorphism 4");
}

	public static void main(String[] args)
	{
		Compile_time_polymorphism c1= new Compile_time_polymorphism();
		c1.add();
		c1.add(127888);
		c1.add(12);
		c1.add(2000, 2.34);
		
		

	}

}
